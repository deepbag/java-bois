package DS.LinkedList;

public class Main {
    static class Node {
        int data;
        Node node;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.node = null;
        }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
}
