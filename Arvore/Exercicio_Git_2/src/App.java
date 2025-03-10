import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Bst t = new Bst();

            Scanner sc = new Scanner(System.in);
            String qnt = sc.nextLine();
            String heights = sc.nextLine();
            t.insertChild(Integer.parseInt(qnt), heights);

            t.inOrder(t.root);
            t.smallestPerLevel(t.root);

            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
