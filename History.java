class Node {
    String url;
    Node prev;
    Node next;
    public Node(String url){
        this.url = url;
    }
}

class BrowserHistory{
    Node current;
    public void visit(String url){
        Node newNode = new Node(url);
        if(current != null){
            current.next = null;
            newNode.prev = current;
            current.next = newNode;
        }
        current = newNode;
        System.out.println("Visited " + url);
    }
    public void back(){
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }
        else{
            System.out.println("Cannot move Back!! ");
        }
    }
    public void forward(){
        if(current != null && current.next != null){
            current = current.next;
            System.out.println("Next is: " + current.url);
        }
        else{
            System.out.println("Cannot move to next!! ");
        }
    }
    public String getCurrentPage(){
        if(current != null){
            return current.url;
        }
        else{
            System.out.println("No page Visited!!");
            return "";
        }
    }
}
public class History {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();

        history.visit("https://instagram.com");
        history.visit("https://chatgpt.com");
        history.visit("https://github.com");

        history.back();
        history.back();
        history.forward();
        history.visit("https://youtube.com");
        history.back();

        System.out.println("Current page: " + history.getCurrentPage());
    }
}