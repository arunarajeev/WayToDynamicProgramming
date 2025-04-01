public class DoubleNode {
    int data;
    DoubleNode next;
    DoubleNode previous;

    DoubleNode(int data) {
        this.data = data;
    }

    public static void main(String[] args) {

        DoubleNode n1 = new DoubleNode(10);
        DoubleNode n2 = new DoubleNode(20);
        DoubleNode n3 = new DoubleNode(30);
        
        DoubleNode head = null;
        n1.previous=head;
        n1.next=n2;
        n2.previous=
        n2.next = n3;
        n3.next = null; 
        System.out.println(n1.next.data);



    }

}
