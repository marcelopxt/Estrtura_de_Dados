public class Node {
    private Student student;
    private Node right;
    private Node left;

    public Node(Student student) {
        this.student = student;
    }

    public Node(Student student, Node right, Node left) {
        this.student = student;
        this.right = right;
        this.left = left;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
