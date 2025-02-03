package dataStructures.linkedLists;

public class LinkedList {
    Node head;

    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;
        }

        current.next = new Node(data);
    }


    public static void main(String[] args) {

        LinkedList fabioLinkedList = new LinkedList();
        //System.out.println(fList.head);

        fabioLinkedList.append(2);
        fabioLinkedList.append(1);
        fabioLinkedList.append(5);
        fabioLinkedList.append(10);
        fabioLinkedList.append(22);
        fabioLinkedList.append(8);


        //show all elements
        Node currentShowing = fabioLinkedList.head;
        while (currentShowing != null){
            System.out.println(currentShowing.data);
            currentShowing = currentShowing.next;
        }

        //show last element
        Node showing = fabioLinkedList.head;
        while (showing != null){
            if(showing.next == null){
                System.out.println("last: " + showing.data);
            }
            showing = showing.next;
        }

        //show specific element
        int index = 0;
        int indexToFind = 3;
        Node current = fabioLinkedList.head;
        while (current != null){
            if(index == indexToFind){
                System.out.println("index " + indexToFind + ": " + current.data);
            }
            index++;
            current = current.next;
        }

    }

}
