package com.sammy.treeBasedAlgorithms;

public class BinaryTreeMain {

    public static void main(String[] args) {
        //Binary tree structure
        /*         5 --> root node
        *     2         4
        * 9     10   7
        * */
        TreeNode rootNode = new TreeNode();
        rootNode.setData(5);
        TreeNode nodeTwo = new TreeNode();
        nodeTwo.setData(2);
        TreeNode nodeFour = new TreeNode();
        nodeFour.setData(4);
        TreeNode nodeNine = new TreeNode();
        nodeNine.setData(9);
        TreeNode nodeTen = new TreeNode();
        nodeTen.setData(10);
        TreeNode nodeSeven = new TreeNode();
        nodeSeven.setData(7);

        rootNode.setLeft(nodeTwo);
        rootNode.setRight(nodeFour);
        nodeTwo.setLeft(nodeNine);
        nodeTwo.setRight(nodeTen);
        nodeFour.setLeft(nodeSeven);

        BinaryTree tree = new BinaryTree();
        tree.setRoot(rootNode);

        tree.preOrderTraversal();
        System.out.println();

        tree.inOrderTraversal();
        System.out.println();

        tree.postOrderTraversal();
        System.out.println();
    }
}
