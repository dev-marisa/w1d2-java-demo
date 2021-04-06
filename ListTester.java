public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList listy = new SinglyLinkedList();
        listy.yeet(3);
        listy.yeet(4);
        listy.yeet(10);
        listy.yeet(5);
        listy.yeet(15);
        listy.yeet(2);
        System.out.println(listy.yeet());
        System.out.println(listy.yeet());
        // listy.printValues();
        System.out.println(listy);
    }
}