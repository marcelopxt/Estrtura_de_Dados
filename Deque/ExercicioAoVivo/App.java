import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Deque<Parcela> deque = new Deque<Parcela>();
        Deque<Parcela> aux = new Deque<Parcela>();
        Scanner sc = new Scanner(System.in);
        double juros;
        double valor;
        double valorJ;
        double jurosP;
        double desconto;
        double montante = 1;
        int qtdParcelas = 1;
        boolean quitou = false;
        boolean tudoOk = false;

        while (!tudoOk) {
            try {
                System.out.println("Qual o valor do montante? ");
                montante = sc.nextDouble();

                if(montante <= 0){
                    System.out.println("Digite um numero válido.");
                    continue;
                }
        
                System.out.println("Quantas parcelas? ");
                qtdParcelas = sc.nextInt();

                if(qtdParcelas <= 1){
                    System.out.println("Digite uma quantidade válida.");
                    continue;
                }
                tudoOk = false;
            } catch (Exception e) {
                System.out.println("Digite um numero válido.");
                System.exit(0);
            }
        }
        sc.nextLine();
        juros = 0.001 * montante;
        valor = (montante/qtdParcelas);

        try {
            for (int i = 1; i <= qtdParcelas; i++) {
                jurosP = (juros * i);
                valorJ = valor + jurosP;
                deque.addLast(new Parcela(valorJ, jurosP));    
                aux.addLast(new Parcela(valorJ, jurosP));
            }

            System.out.println("As parcelas serão: ");
            deque.print();

            while (!quitou) {       
                if (deque.isEmpty()) {
                    quitou = true;
                    break;
                }
                
                System.out.println("Como deseja pagar? (1 - parcela inicio, 2 - ultima parcela): ");
                String opcao = sc.nextLine();
                System.out.println("");

                switch (opcao) {
                    case "1":
                        System.out.println("Voce pagou a parcela de: " + (deque.getFirst().getValor()));
                        deque.removeFirst();
                        break;
                    case "2":
                        if (deque.size() == 1) {
                            System.out.println("Voce pagou a parcela de: " + (deque.getFirst().getValor()));
                            deque.removeFirst();
                        }
                        desconto = deque.getLast().getJurosP();
                        System.out.println("Voce pagou a parcela de: " + (deque.getLast().getValor() - desconto));
                        deque.removeLast();
                        break;
                    default:
                     System.out.println("Digite uma opção válida!");
                        break;
                    }
            }
            System.out.println("Divida quitada.");
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
