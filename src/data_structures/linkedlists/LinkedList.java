package data_structures.linkedlists;

public class LinkedList {                   //LinkedList class


    public Node newNode;                    //declare a new object of class node


    LinkedList(){
        newNode = null;
    }        //LinkedList constructor that sets newNode to null

    public boolean isEmpty() {      //isEmpty method that returns true if newNode ==null

        return (newNode == null);
    }

    public void addNode (int data1, int data2, int data3){  //a method to add a node

        Node node = new Node(data1, data2, data3);  //node constructor

        node.nextNode = newNode;        //why?         //takes the next node and sets equal to newNode
        newNode = node;                                //resets newnode = node
    }

   public Node removeNewNode() {    //removeNewNode method to remove the first node in the list

       Node nodeRef = newNode;      // creates a nodeReference and sets equal to newNode

       if (!isEmpty()) {            //if the newNode is not empty
           newNode = newNode.nextNode;          //set newnode = newnode.next node
       } else {
           System.out.println("Empty LinkedList");  //otherwise you have an empty LinkedList
       }
       return nodeRef;                              //return the location of the head node after the other was deleted
   }

   public Node removeNode(int nodeData1) {   //Remove node method that allows you to remove any node by searching, takes in the first
                                            // variable from the node constructor
       Node currentNode = newNode;          // declares a current node reference, sets it at newNode
       Node previousNode = newNode;         // declares a pervious node reference sets it at previousNode

       while (currentNode.getData1() != nodeData1) {    //while the data 1 currentNode gets is not equal to node data 1
           if (currentNode == null) {                   //if currentNode is null
               return null;                             // return null
           } else {                                     // other wise print 3 empty lines
               System.out.println();
               System.out.println();
               System.out.println();
           }

           previousNode.nextNode = previousNode;   //set the previousNode.nextNode as previous Node
       }
       return currentNode;                          //return current node
   }

   public void display() {                          //display method
        Node node = newNode;                        // create a new node object and set it equal to the new node

        while(node != null) {                       // while the node is not equal to no
            System.out.println(node.getData1());    //print out the data1 for each node

            node = node.nextNode;                   //then set node equal to node.nextNode

            System.out.println("--------");         //print a line in between nodes
        }
   }

   public Node findNode(int nodeData1) {            // findA node that takes in nodeData 1 and returns a node object
       Node node = newNode;                         //set node object equal to newNode

       if (!isEmpty()) {                           //if the list is not empty
           while (node.getData1() != nodeData1) {  // while node.getData1 is not equal to the nodeData1

               if (node.nextNode == null) {        //if the next node is null
                   return null;                    // return null
               } else {
                   node = node.nextNode;          // other wise push the node down the linkedlist
               }

           }
           return node;                            //return the node object

       } else                                      //if data1 equals the value of the node object's data 1

           System.out.println("Empty LinkedList"); // The linkedlist is empty


       return null;                                //Otherwise return null

           }

       }


