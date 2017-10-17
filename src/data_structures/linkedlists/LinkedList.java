package data_structures.linkedlists;

public class LinkedList {


    public Node head;


    LinkedList(){
        head = null;
    }


    public boolean isEmpty() {

        return (head == null);
    }


    public void addNode (int data1, int data2, int data3){

        Node node = new Node(data1, data2, data3);

        node.nextNode = head;
        head = node;
    }

   public Node removeHead() {

       Node nodeRef = head;

       if (!isEmpty()) {
           head = head.nextNode;
       } else {
           System.out.println("Empty LinkedList");
       }
       return nodeRef;
   }

   public void removeNode(int nodeData1) {

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

   public void display() {
        Node node = head;

        while(node != null) {
            System.out.println(node.getData1());

            node = node.nextNode;

            System.out.println("--------");
        }
   }

   public Node findNode(int nodeData1) {
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


