public class Main {
    public static void main(String[] args) {
        try {
        Bst tree = new Bst();
        tree.insert(tree.root, new Student("marcelo", "marcelo@email.com", 1));
        tree.insert(tree.root, new Student("ana", "ana@email.com", 10));
        tree.insert(tree.root, new Student("miguel", "miguel@email.com", 21));
        tree.insert(tree.root, new Student("roger", "roger@email.com", 4));
        tree.insert(tree.root, new Student("Laura", "roger@email.com", 2));
        tree.insert(tree.root, new Student("diego", "diego@email.com", 42));
        tree.insert(tree.root, new Student("larback", "larback@email.com", 50));
        tree.insert(tree.root, new Student("excluir_com_2filhos", "exlcuir@email.com", 19));
        tree.insert(tree.root, new Student("excluir_com_1filho", "exlcuir@email.com", 99));
        tree.insert(tree.root, new Student("excluir_sem_filho", "exlcuir@email.com", 121));

        System.out.println("\nMaior nota:");
        System.out.println(tree.highestEnrollment(tree.root).toString());

        System.out.println("\nVerificar matricula 3:");
        System.out.println(tree.isRegistered(tree.root, 42));

//        System.out.println("\n\n Excluindo matricula 99: "); // 1 filhos
//        tree.remove(tree.root, 99);

//        System.out.println("\n\n Excluindo matricula 21: "); // 2 filhos
//        tree.remove(tree.root, 21);

        System.out.println("\n\n Excluindo matricula 121: "); // sem filhos
        tree.remove(tree.root, 121);

        System.out.println("\n\nPre order:");
        tree.preOrder(tree.root);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}