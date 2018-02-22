package com.ethanx.learning.algorithm.solution;

import static java.lang.Math.min;

import com.ethanx.learning.algorithm.tree.TreeNode;

/**
 * Created by xiaoxin on 2018/2/23.
 */
public class Leetcode01 {

  /*
  Given a binary tree, find its minimum depth.
  The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
   */

  public int run(TreeNode root){

    if (root == null)
      return 0;
    int l = run(root.left);
    int r = run(root.right);

    if (l == 0 || r == 0) {
      return l + r + 1;
    } else {
      return min(l, r) + 1;
    }
  }
}
