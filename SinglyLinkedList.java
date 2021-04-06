public class SinglyLinkedList {
    public Node head;
    
    public SinglyLinkedList() {
        // your code here
    }

    // basically remove
    public int yeet() {
        int val = 0;
        Node runner = head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        val = runner.next.value;
        runner.next = null;
        return val;
    }

    public String toString() {
        String str = "[";
        Node runner = head;
        while(runner.next != null) {
            str += runner.value + ", ";
            runner = runner.next;
        }
        return str + runner.value + "]";
    }
    
    // basically add
    public void yeet(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    
}