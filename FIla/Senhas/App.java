
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Fila fila1 = new Fila();
        String opcao = "-1";
        do {
            System.out.println("\nEscolha uma das Opções: ");
            System.out.println(" 1 - Solicitar Senha");
            System.out.println(" 2 - Ir ao Atendimento");
            System.out.println("0 - Finalizar sistema.");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        limparTela();
                        System.out.println("Digite o nome da Senha: ");
                        String nomeProc = sc.nextLine();
                        fila1.solicitarSenha(new Senha(nomeProc));
                        System.out.println("\n \nSenha '" + nomeProc + "' incluida com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Fila Cheia!");
                    }
                    break;

                case "2":
                    try {
                        limparTela();
                        System.out.println("Senha '" + fila1.irAtendimento().nome + "' Foi atendida com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Fila Vazia!");
                    }
                    break;
                case "0":
                    limparTela();
                    System.out.println("saindo do sistema...");
                    opcao = "0";
                    break;
                default:
                    limparTela();
                    System.out.println("Opção Inválida, escolha somente as opções disponiveis no menu!");
                    break;
            }
        } while (opcao != "0");

        sc.close();
    }

    public static void limparTela() {
        for (int i = 0; i < 15; i++) {
            System.out.println("");
        }
    }
}
