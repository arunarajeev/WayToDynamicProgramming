
public class Node2 {
    Node2 next;
    String data;

    Node2(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        // String[] arr = { "Enjoy", "solving", "problems" };
        String[] arr = { "Enjoy", "solving" };
        Node2 strList = null;
        Node2 head = null;
        if (arr.length != 0) {
            strList = new Node2(arr[0]);
            head = strList;
        }
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                Node2 temp = new Node2(arr[1]);
                strList.next = temp;
                strList = strList.next;
            }
        }
        if (strList != null) {
            Node2 it = head;
            while (it != null) {
                System.out.println(it.data);
                it = it.next;
            }
        } else {
            System.out.println("List is Empty");
        }
    }

}
