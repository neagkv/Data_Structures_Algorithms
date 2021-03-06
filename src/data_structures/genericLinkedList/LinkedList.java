package data_structures.genericLinkedList;

public class LinkedList <T> {
    public Node head;


    LinkedList(){
        head = null;
    }


    public boolean isEmpty() {

        return (head == null);
    }


    public <T> void addNode (T data1, T data2, T data3, String dataName, byte dataId){

        Node node = new Node(data1, data2, data3, dataName, dataId);

        node.nextNode = head;
        head = node;
    }



    public <T> Node removeHead() {

        Node nodeRef = head;

        if (!isEmpty()) {
            head = head.nextNode;
        } else {
            System.out.println("Empty LinkedList");
        }
        return nodeRef;
    }

    public <T> void removeNode(T nodeData1) {

        Node currentNode = head;
        Node previousNode = head;

        while (currentNode.getData1() != nodeData1) {
            if (currentNode == null) {
                return;
            }

            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        previousNode.nextNode = currentNode.nextNode;

    }

    public <T> void display() {
        Node node = head;

        while(node != null) {
            System.out.println(node.getDataid());

            node = node.nextNode;

            System.out.println("--------");
        }
    }

    public  <T> Node findNode(T nodeData1) {
        Node node = head;

        if (!isEmpty()) {
            while (node.getData1() != nodeData1) {

                if (node.nextNode == null) {
                    return null;
                } else {
                    node = node.nextNode;
                }

            }
            return node;

        } else

            System.out.println("Empty LinkedList");


        return null;

    }
}
