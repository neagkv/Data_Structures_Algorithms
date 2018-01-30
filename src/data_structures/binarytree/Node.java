package data_structures.binarytree;

/**
 * @author Kevin Neag
 */
public class Node {

    int key;
    Node left;
    Node right;

    public Node(int item){

        key = item;
        left = right = null;
    }
}
