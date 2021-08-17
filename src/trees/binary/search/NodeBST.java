package trees.binary.search;

public class NodeBST {
    public String data;
    public NodeBST left;
    public NodeBST right;

    public NodeBST(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "NodeBST{" +
                "data='" + data + '\'' +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
