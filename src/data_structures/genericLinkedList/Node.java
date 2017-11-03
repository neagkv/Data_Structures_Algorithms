package data_structures.genericLinkedList;

public class Node<T> {
    private T data1;
    private T data2;
    private T data3;
    private T dataName;
    private T dataid;



    Node nextNode;


    public Node(T data1, T data2, T data3, T dataName, T dataid, Node nextNode) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.dataName = dataName;
        this.dataid = dataid;
        this.nextNode = nextNode;

    }

    public Node(T data1, T data2, T data3, T dataName, T dataid) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.dataName = dataName;
        this.dataid = dataid;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T getData2() {
        return data2;
    }

    public void setData2(T data2) {
        this.data2 = data2;
    }

    public T getData3() {
        return data3;
    }

    public void setData3(T data3) {
        this.data3 = data3;
    }

    public T getDataName() {
        return dataName;
    }

    public void setDataName(T dataName) {
        this.dataName = dataName;
    }

    public T getDataid() {
        return dataid;
    }

    public void setDataid(T dataid) {
        this.dataid = dataid;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
