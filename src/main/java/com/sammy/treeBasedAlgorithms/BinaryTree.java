package com.sammy.treeBasedAlgorithms;

import lombok.Data;

import java.util.Optional;

@Data
public class BinaryTree {

    private TreeNode root;

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(TreeNode root) {
        Optional.ofNullable(root)
                .ifPresent(node -> {
                    System.out.print(node.getData() + " ");
                    preOrderTraversal(node.getLeft());
                    preOrderTraversal(node.getRight());
                });
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        Optional.ofNullable(root)
                .ifPresent(node -> {
                    inOrderTraversal(node.getLeft());
                    System.out.print(node.getData() + " ");
                    inOrderTraversal(node.getRight());
                });
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private void postOrderTraversal(TreeNode root) {
        Optional.ofNullable(root)
                .ifPresent(node -> {
                    postOrderTraversal(node.getLeft());
                    postOrderTraversal(node.getRight());
                    System.out.print(node.getData() + " ");
                });
    }
}
