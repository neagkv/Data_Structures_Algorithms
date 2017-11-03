package data_structures.genericLinkedList;

public class Node {
    private int data1;
    private int data2;
    private int data3;
    private String dataName;
    private byte dataid;



    Node nextNode;


    public Node(int data1, int data2, int data3, String dataName, byte dataid, Node nextNode) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.dataName = dataName;
        this.dataid = dataid;
        this.nextNode = nextNode;

    }

    public Node(int data1, int data2, int data3, String dataName, byte dataid) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.dataName = dataName;
        this.dataid = dataid;
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

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public byte getDataid() {
        return dataid;
    }

    public void setDataid(byte dataid) {
        this.dataid = dataid;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
