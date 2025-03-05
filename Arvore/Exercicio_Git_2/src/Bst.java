import java.util.ArrayList;

public class Bst {
    Node root = null;

    public void insert(Node no, Child child) {
        if (no != null) {
            if (child.height > no.child.height)
                if (no.right != null)
                    insert(no.right, child);
                else
                    no.right = new Node(child);
            else if (no.left != null)
                insert(no.left, child);
            else
                no.left = new Node(child);
        } else {
            root = new Node(child);
        }
    }

    public void smallestPerLevel(Node no) {
        ArrayList<Child> array = new ArrayList<>();
        smallestLevel(no, 0, array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(i + " " + array.get(i).height);
        }
    }

    public void smallestLevel(Node no, int level, ArrayList<Child> array) {
        if (no == null)
            return;
        if(level == array.size()){
            array.add(no.child);
        }else{
            if(no.child.height < array.get(level).height)
                array.set(level, no.child);
        }
            smallestLevel(no.left, level+1, array);
            smallestLevel(no.right, level+1, array);
    }

    public void insertChild(int qnt, String heights) {
        String[] vetHeights = heights.split(" ");
        for (String height : vetHeights) {
            insert(this.root, new Child(Integer.parseInt(height)));
        }
    }

    public void inOrder(Node no) {
        if (no != null) {
            inOrder(no.left);
            System.out.println(no.child.toString());
            inOrder(no.right);
        }
    }
}
