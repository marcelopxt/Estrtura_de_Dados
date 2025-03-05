public class Bst {
    Node root = null;

    public void insert(Node no, Student student) {
        if (no != null) {
            if (student.getEnrollment() < no.getStudent().getEnrollment()) {
                if (no.getLeft() != null)
                    insert(no.getLeft(), student);
                else
                    no.setLeft(new Node(student));
            } else if (no.getRight() != null)
                insert(no.getRight(), student);
            else
                no.setRight(new Node(student));
        } else {
            root = new Node(student);
        }
    }

    public Student highestEnrollment(Node no) throws Exception {
        if (no == null)
            throw new Exception("Essa arvore está vazia.");
        else if (no.getRight() != null)
            return highestEnrollment(no.getRight());
        else
            return no.getStudent();
    }

    public String isRegistered(Node no, int enrollment) {
        if (no == null)
            return "Não está cadastrado.";
        else if (enrollment > no.getStudent().getEnrollment())
            return isRegistered(no.getRight(), enrollment);
        else if (enrollment < no.getStudent().getEnrollment())
            return isRegistered(no.getLeft(), enrollment);
        else
            return "Esta cadastrado!";
    }

    public Node remove(Node no, int enrollment) throws Exception {
        boolean adjust = false;
        if (this.root == null)
            throw new Exception("Essa raiz esta vazia.");
        if (no == null)
            throw new Exception("Aluno nao encontrado!");
        if (enrollment < no.getStudent().getEnrollment())
            no.setLeft(remove(no.getLeft(), enrollment));
        else if (enrollment > no.getStudent().getEnrollment())
            no.setRight(remove(no.getRight(), enrollment));
        else {
            if (no.getRight() != null && no.getLeft() != null) {
                no.setStudent(minimum(no.getRight()).getStudent());
                no.setRight(removeMin(no.getRight()));
            } else {
                if (root == no)
                    adjust = true;
                no = (no.getLeft() != null) ? no.getLeft() : no.getRight();
                if (adjust)
                    root = no;
            }
        }
        return no;
    }

    public Node minimum(Node no) throws Exception {
        if (no == null)
            throw new Exception("Esse no esta nulo.");
        if (no.getLeft() != null)
            return minimum(no.getLeft());
        else
            return no;
    }

    public Node removeMin(Node no) throws Exception {
        if (no == null)
            throw new Exception("Esse nó esta nulo!");
        if (no.getLeft() != null) {
            no.setLeft(removeMin(no.getLeft()));
            return no;
        } else
            return no.getRight();
    }


    public void preOrder(Node no) {
        if (no != null) {
            System.out.println(no.getStudent().toString());
            preOrder(no.getLeft());
            preOrder(no.getRight());
        }
    }

}
