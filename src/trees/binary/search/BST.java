package trees.binary.search;

import com.sun.source.tree.BreakTree;

public class BST {
    public NodeBST root;

    public BST() {
        this.root = null;
    }

    public void add(int data) {
        if (root == null) {
            root = new NodeBST(data);
        } else {
            NodeBST current = this.root;
            searchTree(current, data);
        }
    }

    public NodeBST searchTree(NodeBST current, int data) {

        if (data < current.data) {

            if (current.left == null) {
                current.left = new NodeBST(data);
                return current.left;
            } else {
                searchTree(current.left, data);
                return null;
            }

        } else if (data > current.data) {
            if (current.right == null) {
                current.right = new NodeBST(data);
            } else {
                searchTree(current.right, data);
                return null;
            }
        }
        return root;

    }

    public NodeBST findMin() {
        NodeBST minNode = root;
        while (minNode.left != null) {
            minNode = minNode.left;
        }
        System.out.println(minNode.data);
        return minNode;
    }

    public NodeBST findMax() {
        NodeBST maxNode = root;
        while (maxNode.right != null) {
            maxNode = maxNode.right;
        }
        System.out.println(maxNode.data);
        return maxNode;
    }

    public void removeData(int data) {
        removeNode(null, data);
        this.root = removeNode(this.root, data);
    }

    public NodeBST removeNode(NodeBST node, int data) {
        if (node == null) {
            return null;
        }
        if (data == node.data) {

            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.right == null) {
                return node.left;
            }
            if (node.left == null) {
                return node.right;
            }

            NodeBST tempNode = node.right;
            while (tempNode.left != null) {
                tempNode = tempNode.left;
            }
            node.data = tempNode.data;
            node.right = removeNode(node.right, data);
            return node;
        } else if (data < node.data) {
            node.left = removeNode(node.left, data);
            return node;
        } else {
            node.right = removeNode(node.right, data);
            return node;
        }

    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }
}
