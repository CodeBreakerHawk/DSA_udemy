import java.net.StandardSocketOptions;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(7);
        myLinkedList.append(2);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);

//        (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
//        (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
//        (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.prepend(8).value);
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println();
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.get(2).value + "\n");
//        After Set method is implemented run this to use set method.
        myLinkedList.set(2,5);
//        This is to run the Insert method to insert the value to the linked list
        System.out.println(myLinkedList.insert(3,16));
        myLinkedList.remove(2);



        myLinkedList.printList();
        myLinkedList.reverse();
        System.out.println();
        myLinkedList.printList();

//        Here ends the Linked List, uncomment to use the methods

//          From here DoublyLinkedList starts.

            DoublyLinkedList myDll = new DoublyLinkedList(7);
            myDll.printList();


    }
        
        





}
