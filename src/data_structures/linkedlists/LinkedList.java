package data_structures.linkedlists;



public class LinkedList {

    private int counter;
    private Node head;


    public LinkedList() {
    }

    // appends the specified element to the end of this list.
    public void add(Object data) {


        //Initialize Node only incase of 1st element

        if(head == null){
            head = new Node();
        }

        Node temp = new Node();
        Node currentLoc = head;

        //check for Null pointer exception, before iterate over LinkedList
        if(currentLoc != null) {

            //starting at the head node, crawl to the end of the list and then add element after last node
            while(currentLoc.getNext() !=null) {
                currentLoc = currentLoc.getNext();
            }

            // the last node's "next" reference set to out new node
        }

}





    }








