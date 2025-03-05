public class Node {
    Node right;
    Node left;
    Child child;

    public Node(Child child) {
        this.child = child;
    }

    public Node(Node right, Node left, Child child) {
        this.right = right;
        this.left = left;
        this.child = child;
    }
}
