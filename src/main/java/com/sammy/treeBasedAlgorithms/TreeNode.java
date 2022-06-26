package com.sammy.treeBasedAlgorithms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
    private TreeNode right;
    private TreeNode left;
    private int data;
}
