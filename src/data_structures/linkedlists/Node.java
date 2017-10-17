package data_structures.linkedlists;

public class Node {                                                 // Node class of objects stored in the linkedlist

    private int data1;                                              // instance variables for data each node
    private int data2;
    private int data3;


    Node nextNode;                                                  // create a new nextNode variable


    public Node(int data1, int data2, int data3) {                  //Node constructor
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }


    public Node(int data1, int data2, int data3, Node nextNode) {   //overloaded node constructor that  also includes next node
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.nextNode = nextNode;
    }


    public int getData1() {
        return data1;
    }                          // getters and setters for each variable

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public int getData3() {
        return data3;
    }

    public void setData3(int data3) {
        this.data3 = data3;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}


