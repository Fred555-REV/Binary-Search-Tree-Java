package trees.binary.search;

public class BST {
    private NodeBST root;

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


    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }
}
