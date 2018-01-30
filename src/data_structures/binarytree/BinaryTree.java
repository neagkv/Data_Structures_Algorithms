package data_structures.binarytree;

/**
 * @author Kevin Neag
 */
public class BinaryTree {

    Node root;

    BinaryTree(int key){

        root = new Node(key);
    }

    BinaryTree(){

        root = null;
    }


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root = new Node(1);

        binaryTree.root.left = new Node(2);

        binaryTree.root.left = new Node(3);

        binaryTree.root.left = new Node(4);

        binaryTree.root.right = new Node (11);

        binaryTree.root.right.left = new Node(12);

        binaryTree.root.right.right = new Node(13);


    }
}
