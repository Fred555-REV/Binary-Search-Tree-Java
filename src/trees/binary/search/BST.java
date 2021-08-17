package trees.binary.search;

public class BST {
    private NodeBST root;

    public BST() {
        this.root = null;
    }

    public void add(String data) {
        if (root.data == null) {
            root = new NodeBST(data);
        } else {

        }
    }

    public NodeBST searchTree() {
        return root;
    }


    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }
}
