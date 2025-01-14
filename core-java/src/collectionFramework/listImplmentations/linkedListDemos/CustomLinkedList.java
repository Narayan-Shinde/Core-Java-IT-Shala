package collectionFramework.listImplmentations.linkedListDemos;

public class CustomLinkedList {
    private class Node {
        Object data;
        Node reference;

        Node(Object data) {
            this.data = data;
        }
    }

    Node head;

    public CustomLinkedList() {

    }

    public void add(Object data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp!=null){
                temp = temp.reference;
            }
            temp.reference = node;

        }
    }


}
