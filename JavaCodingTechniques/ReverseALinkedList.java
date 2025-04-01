public class ReverseALinkedList {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        Node myNode = new Node(arr[0]);
        Node head = null;     
        head=Node.insertArrData(head,arr);  
        Node.traverse(head);
        head=reverseList(head);
        Node.traverse(head);

    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node forw = null;
           
        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;

           
           
        }
        return prev;
    }
}
