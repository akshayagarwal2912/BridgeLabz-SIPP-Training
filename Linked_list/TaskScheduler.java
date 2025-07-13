import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    private Task head = null;

    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            newTask.next = head;
            temp.next = newTask;
            head = newTask;
        }
    }

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newTask;
        newTask.next = head;
    }

    public void addAtPosition(int pos, int taskId, String taskName, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task temp = head;
        for (int i = 1; temp.next != head && i < pos - 1; i++) temp = temp.next;
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        newTask.next = temp.next;
        temp.next = newTask;
    }

    public void removeByTaskId(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId && head.next == head) {
            head = null;
            return;
        }
        Task temp = head, prev = null;
        do {
            if (temp.taskId == taskId) {
                if (temp == head) {
                    Task last = head;
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

    public Task searchByPriority(int priority) {
        if (head == null) return null;
        Task temp = head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != head);
        return null;
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        System.out.println("TaskID\tName\tPriority\tDueDate");
        Task temp = head;
        do {
            System.out.println(temp.taskId + "\t" + temp.taskName + "\t" + temp.priority + "\t" + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentAndMoveNext() {
        if (head == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        System.out.println("Current Task: " + head.taskId + ", " + head.taskName + ", Priority: " + head.priority + ", Due: " + head.dueDate);
        head = head.next;
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Task Scheduler ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Remove by Task ID");
            System.out.println("5. View Current Task and Move to Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Task ID: ");
                    int taskId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Task Name: ");
                    String taskName = sc.nextLine();
                    System.out.print("Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Due Date: ");
                    String dueDate = sc.nextLine();
                    if (choice == 1) ts.addAtBeginning(taskId, taskName, priority, dueDate);
                    else if (choice == 2) ts.addAtEnd(taskId, taskName, priority, dueDate);
                    else {
                        System.out.print("Position: ");
                        int pos = sc.nextInt();
                        ts.addAtPosition(pos, taskId, taskName, priority, dueDate);
                    }
                    break;
                case 4:
                    System.out.print("Enter Task ID to remove: ");
                    int remId = sc.nextInt();
                    ts.removeByTaskId(remId);
                    break;
                case 5:
                    ts.viewCurrentAndMoveNext();
                    break;
                case 6:
                    ts.displayAll();
                    break;
                case 7:
                    System.out.print("Enter Priority to search: ");
                    int prio = sc.nextInt();
                    Task found = ts.searchByPriority(prio);
                    if (found != null) {
                        System.out.println("Found: " + found.taskId + ", " + found.taskName + ", Priority: " + found.priority + ", Due: " + found.dueDate);
                    } else {
                        System.out.println("No task with given priority.");
                    }
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