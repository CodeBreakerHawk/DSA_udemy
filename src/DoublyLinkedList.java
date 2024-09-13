public class DoublyLinkedList {

    private DNode head;
    private DNode tail;
    private int length;

    class DNode {
        int value;
        DNode next;
        DNode prev;  //used only in case of Doubly Linked List scenarios.

        DNode(int value) {
            this.value = value;
        }
    }
    public DoublyLinkedList(int value) {
        DNode newNode = new DNode(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public DNode getHead() {
        return head;
    }

    public DNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        DNode temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void appendDll(int value){
        DNode newNode = new DNode(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode = tail;

        }
        length++;
    }

}
