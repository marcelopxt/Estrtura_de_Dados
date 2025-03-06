import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
        Bst b = new Bst();
       
        Scanner sc = new Scanner(System.in);
        int qntDados = 1;

        while(qntDados != 0){
            
            qntDados = sc.nextInt();
            sc.nextLine();

            if(qntDados == 0)
                break;

            for (int i = 0; i < qntDados; i++) {
                String dado = sc.nextLine();
                int data = Integer.parseInt(dado.split(" ")[0]);
                Double temp = Double.parseDouble(dado.split(" ")[1]);
                b.insert(b.root, new Ano(data, temp));
            }

            int qntAposta = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < qntAposta; i++) {
                int aposta = sc.nextInt();
                sc.nextLine();
                System.out.println((b.verificaAposta(b.root, aposta))? "Correto" : "Incorreto");
            }

            b.root = null;
        };
        sc.close();
    }
}