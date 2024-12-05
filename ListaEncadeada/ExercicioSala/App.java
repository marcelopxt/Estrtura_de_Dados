import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaCidade lista = new ListaCidade();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n=== Menu de Controle ===");
            System.out.println("1. Adicionar Cidade");
            System.out.println("2. Excluir Cidade pelo nome e país");
            System.out.println("3. Listar Cidades");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome da Cidade: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o país da Cidade: ");
                    String pais = scanner.nextLine();

                    System.out.print("Digite o ponto turístico da Cidade: ");
                    String ponto = scanner.nextLine();

                    System.out.print("Digite a nota da Cidade (0-10): ");
                    int nota = -1;
                    while (nota < 0 || nota > 10) {
                        if (scanner.hasNextInt()) {
                            nota = scanner.nextInt();
                            if (nota < 0 || nota > 10) {
                                System.out.println("Nota inválida! Deve ser entre 0 e 10.");
                            }
                        } else {
                            System.out.println("Entrada inválida! Digite um número.");
                            scanner.next(); 
                        }
                    }
                    scanner.nextLine(); 
                    Cidade cidade = new Cidade(nome, pais, ponto, nota);
                    lista.add(cidade);
                    System.out.println("Cidade adicionada com sucesso!");
                    break;

                case "2":
                    System.out.print("Digite o nome da cidade a ser excluída: ");
                    String nomeEx = scanner.nextLine();

                    System.out.print("Digite o país da cidade a ser excluída: ");
                    String paisEx = scanner.nextLine();
                    
                    lista.removerCidade(nomeEx, paisEx);
                    break;

                case "3":
                    System.out.println("\n=== Lista de Cidades ===");
                    int op = 1;
                    while (op != 0) {
                        lista.imprimir(op);
                        System.out.println("\n");
                        System.out.println("Digite 1 para exibir a próxima");
                        System.out.println("Digite 2 para exibir a anterior");
                        System.out.println("Digite 0 para sair da visualização");
                        
                        if (scanner.hasNextInt()) {
                            op = scanner.nextInt();
                            if (op < 0 || op > 2) {
                                System.out.println("Opção inválida, digite 0, 1 ou 2.");
                            }
                        } else {
                            System.out.println("Entrada inválida! Digite um número.");
                            scanner.next(); 
                        }
                    }
                    scanner.nextLine(); 
                    break;

                case "4":
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (!opcao.equals("4"));

        scanner.close();
    }
}
