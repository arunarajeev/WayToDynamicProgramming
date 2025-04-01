package NeetCodeJava;
public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node head = n1;
        head.next = n2;
        n2.next = n3;
        n3.next = null;
        traverse(head);
        head=insert(head, 25);
        head=insertAtPos(head, 35, 3);
        int[] arr = { 23,67,12};       
        head=insertArrData(head, arr);
        traverse(head);

        // System.out.println(n1.next.data);
    }

    public static Node insertArrData(Node head, int[] arr){
        Node strList = null;  
        if (arr.length != 0) {
            strList = new Node(arr[0]);
            head = strList;
        }
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                strList.next = temp;
                strList = strList.next;
            }
        }
        return head;
    }
    private static Node insert(Node head, int num) {
        Node toAdd = new Node(num);
        if (head == null || head.data == num) {
            toAdd.next = head;
            head = toAdd;
            return head;
        }
        Node prev = head;
        while (prev.next.data < num && prev.next != null) {
            prev = prev.next;
        }   
        toAdd.next = prev.next;
        prev.next=toAdd;
       return head;
    }

    private static Node insertAtPos(Node head, int num, int pos) {
        Node toAdd = new Node(num);
        if (pos == 0) {
            toAdd.next = head;
            head = toAdd;
            return head;
        }
        Node prev = head;
        int count = 0;
        while (count < pos - 1) {
            prev = prev.next;
            count++;
        }

        toAdd.next = prev.next;
        prev.next = toAdd;
        return head;
    }

    public static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("null"+"\n");
    }

}
