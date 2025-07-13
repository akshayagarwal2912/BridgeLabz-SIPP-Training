import java.util.*;

class TextState {
    String content;
    TextState prev, next;
    public TextState(String content) {
        this.content = content;
        this.prev = this.next = null;
    }
}

public class UndoRedoTextEditor {
    private TextState head, tail, current;
    private int size = 0;
    private final int MAX_HISTORY = 10;

    public void addState(String content) {
        TextState newState = new TextState(content);
        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }
        // Remove forward history
        if (current != tail) {
            TextState temp = current.next;
            while (temp != null) {
                TextState next = temp.next;
                temp.prev = temp.next = null;
                temp = next;
                size--;
            }
            current.next = null;
            tail = current;
        }
        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;
        // Limit history
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available.");
        }
    }

    public void displayCurrent() {
        if (current == null) {
            System.out.println("No text state available.");
        } else {
            System.out.println("Current Text: " + current.content);
        }
    }

    public static void main(String[] args) {
        UndoRedoTextEditor editor = new UndoRedoTextEditor();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Undo/Redo Text Editor ---");
            System.out.println("1. Type/Add New State");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display Current State");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter new text: ");
                    String txt = sc.nextLine();
                    editor.addState(txt);
                    break;
                case 2:
                    editor.undo();
                    break;
                case 3:
                    editor.redo();
                    break;
                case 4:
                    editor.displayCurrent();
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