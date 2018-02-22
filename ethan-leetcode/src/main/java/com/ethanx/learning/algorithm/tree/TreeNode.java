package com.ethanx.learning.algorithm.tree;

/**
 * Created by xiaoxin on 2018/2/23.
 */
public class TreeNode {

  private int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }
}
