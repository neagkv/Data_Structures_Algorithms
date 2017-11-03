package data_structures.genericLinkedList;

public class LinkedListController {
    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList();


        linkedList.addNode (38, 77, 65, "DataList one", (byte)1 );
        linkedList.addNode(66, 78, 1003, "DataList two", (byte)2);
        linkedList.addNode(65, 79, 888, "DataList three", (byte)3);
        linkedList.addNode(432, 2, 366, "DataList four", (byte)4);



        linkedList.display();

        System.out.println(
                "Value of first node in LinkedList " + linkedList.head.getData1() + "\n");
        System.out.println(
                "The data name is" + linkedList.head.getDataName() + "\n");



        linkedList.removeHead();


        linkedList.display();


        System.out.println(
                linkedList.findNode(66).getData1()+ " " + "was found.");


        linkedList.removeNode(66);

        System.out.println("Node deletion exectuted");


        linkedList.display();


    }
}
