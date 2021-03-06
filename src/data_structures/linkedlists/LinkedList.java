package data_structures.linkedlists;

public class LinkedList {

    //node variable for the head node
    public Node head;

    //linkedlist constructor that takes in the head node
    LinkedList(){
        head = null;
    }

    // an is empty method that returns true if head is null
    public boolean isEmpty() {

        return (head == null);
    }


    /*
    add node method that takes in all the instances of the node class  and creates a new node object that contains that
    data and calls the nextnode method that sets the new node object as the head and resets it as the node object
     */
    public void addNode (int data1, int data2, int data3){

        Node node = new Node(data1, data2, data3);

        node.nextNode = head;
        head = node;
    }

    //remove head method that returns a node object
   public Node removeHead() {
       // set a noderef object as the head
       Node nodeRef = head;

       //if the next node is not empty, reset the node as head and call the next node method on it to push it down a spot
       if (!isEmpty()) {
           head = head.nextNode;
       } else {
           //if the next node is empty your linked list is next
           System.out.println("Empty LinkedList");
       }

       //return the nodeRef
       return nodeRef;
   }


   //remove node method that takes in the the data from the first node
   public void removeNode(int nodeData1) {


       //create a current node object and set it eqaul to the head
       Node currentNode = head;
       //create a prvious node object and set it equal to the head
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


