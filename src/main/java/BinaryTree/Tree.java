package BinaryTree;

import java.util.ArrayList;


public class Tree {

    private static int[] array = {0,1,2,3,4,5,6,7,8,9,10};

    private static ArrayList<Node> list = new ArrayList<>();

    private static class Node{

        int value;

        Node LeftChild;
        Node RightChild;

        Node(int value){
            this.value = value;
        }
    }

    private  void arrayToTree() {

        for (int i: array
             ) {
            list.add(new Node(i));
        }

        if (list.size() > 0) {
            for (int i = 0; i <= list.size() / 2 - 1; i++) {
                if (list.get(i * 2 + 1) != null) {
                    list.get(i).LeftChild = list.get(2 * i + 1);
                }
                if (list.get(i * 2 + 2) != null){
                    list.get(i).RightChild = list.get(2 * i + 2);
                }
            }

        } else {
            System.out.println("Data Error!");

        }
    }

    private void printTree(Node node){

        if (node != null) {
            System.out.println("node: "+node.value);
            printTree(node.LeftChild);
            printTree(node.RightChild);
        } else {      //  叶子节点的左右孩子都为空，打印出 10 个Node is NUll!
            System.out.println("Node is NULL!");
        }

    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.arrayToTree();

        tree.printTree(list.get(0));

    }

}
