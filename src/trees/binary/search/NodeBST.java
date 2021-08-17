package trees.binary.search;

import trees.binary.Color;
import trees.binary.Main;

public class NodeBST {
    public int order = 0;
    public Integer data;
    public NodeBST left;
    public NodeBST right;

    public NodeBST(int data) {
        Main.order++;
        this.order = Main.order;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return Color.getColor(order) + "\nNodeBST{" +
                "data='" + data + '\'' + "\nleft=" + left +
                Color.getColor(order) + "\nright=" + right +
                Color.getColor(order) + '}' + Color.RESET;
    }
}
