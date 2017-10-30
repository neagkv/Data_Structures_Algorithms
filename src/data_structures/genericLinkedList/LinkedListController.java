package data_structures.genericLinkedList;

public class LinkedListController {
    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();


        linkedList.addNode (38, 777, 65);
        linkedList.addNode(66, 78, 1003);
        linkedList.addNode(65, 79, 888);
        linkedList.addNode(432, 2, 366);



        linkedList.display();

        System.out.println(
                "Value of first node in LinkedList " + linkedList.head.getData1() + "\n");


        linkedList.removeHead();


        linkedList.display();


        System.out.println(
                linkedList.findNode(66).getData1()+ " " + "was found.");


        linkedList.removeNode(66);

        System.out.println("Node deletion exectuted");


        linkedList.display();


    }
}
