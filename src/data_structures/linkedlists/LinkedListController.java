package data_structures.linkedlists;

public class LinkedListController {

    public static void main(String[] args) {                            //main method


        LinkedList linkedList = new LinkedList();                       // create a new linkedlist


        linkedList.addNode (38, 777, 65);           // add nodes to the linked list
        linkedList.addNode(66, 78, 1003);
        linkedList.addNode(65, 79, 888);
        linkedList.addNode(432, 2, 366);



        linkedList.display();                                          // display the first set of data in each node

        System.out.println(
                "Value of first node in LinkedList " + linkedList.newNode + "\n");  //print the value of the newNode in linkedlist


        linkedList.removeNewNode();                                     // remove node method to remove 432


        linkedList.display();                                           // display the first data sets after the node was deleted


        System.out.println(                                            // try to find the node with data matching  432
                linkedList.findNode(432).getData1()+ "was found.");


        linkedList.removeNode(432);                         // remove the node if its value is 432

        System.out.println("Node deletion exectuted");


        linkedList.display();                                         //display the contents of the node again


    }
}
