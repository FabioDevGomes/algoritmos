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

    public int getSpecificElementFromIndex(int indexToFind){
        int index = 0;
        Node current = this.head;
        while (current != null){
            if(index == indexToFind){
                return current.data;
            }
            index++;
            current = current.next;
        }
        return 0;
    }

    public int getLastElement(){
        Node showing = this.head;
        while (showing != null){
            if(showing.next == null){
                return showing.data;
            }
            showing = showing.next;
        }
        return 0;
    }

    public void printAllElements(){
        Node currentShowing = this.head;
        while (currentShowing != null){
            System.out.println(currentShowing.data);
            currentShowing = currentShowing.next;
        }
    }


    public static void main(String[] args) {
        LinkedList fabioLinkedList = new LinkedList();

        fabioLinkedList.append(2);
        fabioLinkedList.append(1);
        fabioLinkedList.append(5);
        fabioLinkedList.append(10);
        fabioLinkedList.append(22);
        fabioLinkedList.append(8);

        fabioLinkedList.printAllElements();

        fabioLinkedList.getLastElement();

        fabioLinkedList.getSpecificElementFromIndex(2);

    }

}
