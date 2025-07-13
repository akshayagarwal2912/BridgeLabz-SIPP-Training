import java.util.Scanner;

class Process {
    int processId;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime;
    int turnaroundTime;
    Process next;

    public Process(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

public class RoundRobinScheduler {
    private Process head = null;

    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            newProcess.next = head;
            return;
        }
        Process temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newProcess;
        newProcess.next = head;
    }

    public void removeByProcessId(int processId) {
        if (head == null) return;
        if (head.processId == processId && head.next == head) {
            head = null;
            return;
        }
        Process temp = head, prev = null;
        do {
            if (temp.processId == processId) {
                if (temp == head) {
                    Process last = head;
                    while (last.next != head) last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }
        System.out.println("PID\tBurst\tPriority\tRemaining");
        Process temp = head;
        do {
            System.out.println(temp.processId + "\t" + temp.burstTime + "\t" + temp.priority + "\t" + temp.remainingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public void roundRobin(int quantum) {
        if (head == null) return;
        int time = 0, completed = 0, n = 0;
        Process temp = head;
        do {
            n++;
            temp = temp.next;
        } while (temp != head);
        temp = head;
        while (completed < n) {
            if (temp.remainingTime > 0) {
                int execTime = Math.min(quantum, temp.remainingTime);
                time += execTime;
                temp.remainingTime -= execTime;
                if (temp.remainingTime == 0) {
                    temp.turnaroundTime = time;
                    temp.waitingTime = temp.turnaroundTime - temp.burstTime;
                    completed++;
                }
                displayProcesses();
            }
            temp = temp.next;
        }
        // Display avg waiting and turnaround time
        double totalWT = 0, totalTAT = 0;
        temp = head;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            temp = temp.next;
        } while (temp != head);
        System.out.printf("Average Waiting Time: %.2f\n", totalWT / n);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTAT / n);
    }

    public static void main(String[] args) {
        RoundRobinScheduler rrs = new RoundRobinScheduler();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Round Robin Scheduler ---");
            System.out.println("1. Add Process");
            System.out.println("2. Remove Process by ID");
            System.out.println("3. Display Processes");
            System.out.println("4. Simulate Round Robin");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Process ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Burst Time: ");
                    int bt = sc.nextInt();
                    System.out.print("Priority: ");
                    int prio = sc.nextInt();
                    rrs.addProcess(pid, bt, prio);
                    break;
                case 2:
                    System.out.print("Enter Process ID to remove: ");
                    int remId = sc.nextInt();
                    rrs.removeByProcessId(remId);
                    break;
                case 3:
                    rrs.displayProcesses();
                    break;
                case 4:
                    System.out.print("Enter Time Quantum: ");
                    int quantum = sc.nextInt();
                    rrs.roundRobin(quantum);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}