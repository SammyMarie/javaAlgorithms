package com.sammy.treeBasedAlgorithms;

import lombok.Data;

@Data
public class BinarySearchTree {
    private TreeNode root;

    public void insert(int value){
        insert(root, value);
    }

    private TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode();
            root.setData(value);
        }else if(value < root.getData()){
            //insert on the left
            root.setLeft(insert(root.getLeft(), value));
        }else if(value > root.getData()){
            //insert on the right
            root.setRight(insert(root.getRight(), value));
        }

        return root;
    }

    public boolean contains(int value){
        return contains(root, value);
    }

    private boolean contains(TreeNode root, int value) {
        if(root == null){
            return false;
        }

        if(value < root.getData()){
            return contains(root.getLeft(), value);
        }
        if(value > root.getData()){
            return contains(root.getRight(), value);
        }

        return true;
    }
}
