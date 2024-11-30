import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu de Controle ===");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Exibir Clientes (Ordem Crescente)");
            System.out.println("3. Exibir Clientes (Ordem Decrescente)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do cliente: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o telefone do cliente: ");
                    String telefone = scanner.nextLine();

                    Cliente cliente = new Cliente(codigo, nome, telefone);
                    lista.inserirOrdenado(cliente);
                    System.out.println("Cliente adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== Lista em Ordem Crescente ===");
                    lista.exibirOrdemCrescente();
                    break;

                case 3:
                    System.out.println("\n=== Lista em Ordem Decrescente ===");
                    lista.exibirOrdemDecrescente();
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
