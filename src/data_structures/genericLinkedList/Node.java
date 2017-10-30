package data_structures.genericLinkedList;

public class Node {
    private int data1;
    private int data2;
    private int data3;


    Node nextNode;


    public Node(int data1, int data2, int data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }


    public Node(int data1, int data2, int data3, Node nextNode) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.nextNode = nextNode;
    }


    public int getData1() {
        return data1;
    }

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
