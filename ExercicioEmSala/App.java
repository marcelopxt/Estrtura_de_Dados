import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaCandidato lista = new ListaCandidato();
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        int cont = 0;

        while (opcao != 0){
            System.out.println("\n \n \n=== MENU ===");
            System.out.println("1. Adicionar Candidato");
            System.out.println("2. Remover Candidato");
            System.out.println("3. Localizar Candidato");
            System.out.println("4. Exibir Lista de Candidatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1: {
                    System.out.print("Digite o nome do Candidato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o Nota do Candidato: ");
                    String Nota = scanner.nextLine();

                    try {
                        Candidato Candidato = new Candidato (cont, nome, Nota);
                        cont++;
                        lista.add(Candidato);
                        System.out.println("Candidato adicionado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao adicionar Candidato: " + e.getMessage());
                    }
                    break;
                }
                case 2 : {
                    System.out.print("\nDigite o Inscrição do Candidato a ser removido: ");
                    int Inscricao = scanner.nextInt();

                    try {
                        lista.remove(Inscricao);
                        System.out.println("Candidato removido com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao remover Candidato: " + e.getMessage());
                    }
                    break;
                }
                case 3 : {
                    System.out.print("\nDigite o nome do Candidato a ser localizado: ");
                    String nome = scanner.nextLine();

                    try {
                        System.out.println("\n \nCandidato encontrado:");
                        lista.encontrar(nome);
                    } catch (Exception e) {
                        System.out.println("Erro ao localizar Candidato: " + e.getMessage());
                    }
                    break;
                }
                case 4 : {
                    System.out.println("\n=== Lista de Candidatos ===");
                    for (int i = 0; i < lista.getContador(); i++) {
                        try {
                            Candidato Candidato = lista.get(i);
                            System.out.println("Inscrição: " + Candidato.getInscricao());
                            System.out.println("Nome: " + Candidato.getNome());
                            System.out.println("Nota: " + Candidato.getNota());
                            System.out.println("---------------------------");
                        } catch (Exception e) {
                            break;
                        }
                    }
                    break;
                }
                case 0 : System.out.println("Saindo...");
                 break;
                default : System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
