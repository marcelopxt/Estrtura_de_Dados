import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaVeiculos lista = new ListaVeiculos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu de Controle ===");
            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Excluir Veículo pela Placa");
            System.out.println("3. Listar Todos os Veículos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a placa do veículo: ");
                    String placa = scanner.nextLine();

                    System.out.print("Digite a marca do veículo: ");
                    String marca = scanner.nextLine();

                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Digite o valor do veículo: ");
                    double valor = scanner.nextDouble();

                    Veiculo veiculo = new Veiculo(placa, marca, modelo, valor);
                    lista.inserir(veiculo);
                    System.out.println("Veículo adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a placa do veículo a ser excluído: ");
                    String placaExcluir = scanner.nextLine();

                    if (lista.excluirPorPlaca(placaExcluir)) {
                        System.out.println("Veículo excluído com sucesso!");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("\n=== Lista de Veículos ===");
                    lista.imprimirTodos();
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
