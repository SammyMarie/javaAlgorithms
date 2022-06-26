package com.sammy.treeBasedAlgorithms;

public class BinarySearchTreeMain {

    public static void main(String[] args) {
        TreeNode rootNode =  new TreeNode();
        rootNode.setData(2);

        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.setRoot(rootNode);

        searchTree.insert(1);
        searchTree.insert(3);
        searchTree.insert(4);

        System.out.println(searchTree);

        System.out.println(searchTree.contains(1));
        System.out.println(searchTree.contains(2));
        System.out.println(searchTree.contains(3));
        System.out.println(searchTree.contains(4));
        System.out.println();
        System.out.println(searchTree.contains(5));
        System.out.println(searchTree.contains(-4));
        System.out.println(searchTree.contains(0));
        System.out.println(searchTree.contains(6));
    }
}
