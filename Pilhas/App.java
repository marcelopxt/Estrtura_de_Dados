import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd;
        int ordem = -1;
        Pilha p = new Pilha();
        Pilha saida = new Pilha();
        Pilha resultado = new Pilha();
       
        while (true) {
            System.out.println("Quantos Vagoes?");
            qtd = sc.nextInt();

            if (qtd == 0)
                break;

            for (int i = qtd; i > 0; i--) {
                p.push(new Vagao(i));
            }
            while (true) {
                System.out.println("Digite a ordem de saída: ");

                for (int i = 1; i < qtd + 1; i++) {
                ordem = sc.nextInt();
                    if (ordem == 0)
                    break;

                    saida.push(new Vagao(ordem));
                }
                if (ordem == 0)
                    break;

                for (int i = 0; i < qtd; i++)
                resultado.push(saida.pop());

                if (p.verificarOrdem(resultado))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        sc.close();
    }
}
