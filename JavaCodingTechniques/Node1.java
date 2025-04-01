

public class Node1 {
    Node1 next;
    int data;

    Node1(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        
        int arr[] = { 20, 10, 50 };
        Node1 myNode = new Node1(arr[0]);
        Node1 head = myNode;    
        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]);
            myNode.next=temp;    
            myNode=myNode.next; 
        }
        Node1 it = head;
        while(it!=null){
            System.out.print(it.data+"->");
            it=it.next;
        }
    }
}
