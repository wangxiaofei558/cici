package com;

/**
 * 二叉树
 */
public class BinarySearchTree {

    class BinaryTreeNode {
        int data;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;

        private int getData() {
            return this.data;
        }

        private void setData(int data) {
            this.data = data;
        }

        private BinaryTreeNode getLeftChild() {
            return this.leftChild;
        }

        private void setLeftChild(BinaryTreeNode node) {
            this.leftChild = node;
        }

        private BinaryTreeNode getRightChild() {
            return this.rightChild;
        }

        private void setRightChild(BinaryTreeNode node) {
            this.rightChild = node;
        }
    }

    private BinaryTreeNode mRoot;

    private BinarySearchTree(BinaryTreeNode root) {
        this.mRoot = root;
    }

    public BinaryTreeNode search(int data) {
        return search(mRoot, data);
    }

    public BinaryTreeNode search(BinaryTreeNode node, int data) {
        if (node == null || node.getData() == data) {    //节点为空或者相等，直接返回该节点
            return node;
        }
        if (data < node.getData()) {    //比节点小，就从左子树里递归查找
            return search(node.getLeftChild(), data);
        } else {        //否则从右子树
            return search(node.getRightChild(), data);
        }
    }

    public void insert(int data) {
        if (mRoot == null) {
            mRoot = new BinaryTreeNode();
            mRoot.setData(data);
        }

    }

    private BinaryTreeNode searchAndInsert(BinaryTreeNode parent, BinaryTreeNode node, int data) {
        if (node == null) {
            node = new BinaryTreeNode();
            node.setData(data);
            if (parent != null) {    //父节点不为空，绑定关系
                if (data < parent.getData()) {
                    parent.setLeftChild(node);
                } else {
                    parent.setRightChild(node);
                }
            }
            return node;
        }
        //对比的节点不为空
        if (node.getData() == data) {    //已经有了，不用插入了
            return node;
        } else if (data < node.getData()) {   //比节点小，从左子树里查找、插入
            return searchAndInsert(node, node.getLeftChild(), data);
        } else {
            return searchAndInsert(node, node.getRightChild(), data);
        }
    }

}
