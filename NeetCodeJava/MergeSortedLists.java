
package NeetCodeJava;
public class MergeSortedLists {
    private static Node mergeLists(Node list1, Node list2) {
        // Dummy node to simplify list operations
        Node dummy = new Node(0);
        Node merge = dummy; // Pointer to track the merged list

        // Traverse both lists and merge them in sorted order
        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next; // Move forward
        }

        // Append the remaining nodes from list1 or list2
        if (list1 != null) {
            merge.next = list1;
        } else {
            merge.next = list2;
        }

        return dummy.next; // Return merged list (excluding dummy node)
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating first sorted linked list: 1 -> 3 -> 5
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        // Creating second sorted linked list: 2 -> 4 -> 6
        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        // Merging the lists
        Node mergedList = mergeLists(list1, list2);

        // Printing merged list
        printList(mergedList);
    }
}
