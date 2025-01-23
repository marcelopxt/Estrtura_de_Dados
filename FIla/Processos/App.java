package Fila.ProcessosOperacionais;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FilaArranjo fila = new FilaArranjo();
        int id = 0;

        fila.incluirProcesso(new Processo("a", id++));
        fila.incluirProcesso(new Processo("b", id++));
        fila.incluirProcesso(new Processo("c", id++));
        fila.incluirProcesso(new Processo("d", id++));
        fila.incluirProcesso(new Processo("e", id++));
        fila.incluirProcesso(new Processo("f", id++));

        String opcao = "-1";
        do {
            System.out.println("\nEscolha uma das Opções: ");
            System.out.println(" 1 - Incluir processo");
            System.out.println(" 2 - Retirar processo mais antigo");
            System.out.println(" 3 - Imprimir todos os processos");
            System.out.println(" 4 - Procurar processo pelo ID");
            System.out.println(" 5 - Deletar todos os processos");
            System.out.println("0 - Finalizar sistema.");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        limparTela();
                        System.out.println("Digite o nome do Processo: ");
                        String nomeProc = sc.nextLine();
                        fila.incluirProcesso(new Processo(nomeProc, id++));
                        System.out.println("\n \nProcesso '" + nomeProc + "' incluido com sucesso!");
                        break;
                    } catch (Exception e) {
                        System.out.println("Fila Cheia!");
                    }

                case "2":
                    try {
                        limparTela();
                        System.out.println("Processo '" + fila.retirarProcesso().title + "' retirado com sucesso!");
                        break;
                    } catch (Exception e) {
                        System.out.println("Fila Vazia!");
                    }
                case "3":
                    try {
                        limparTela();
                        System.out.println("-------------------------------------------------------------------");
                        fila.imprimirProcessos();
                        System.out.println("-------------------------------------------------------------------");
                    } catch (Exception e) {
                        System.out.println("Fila Vazia!");
                    }
                    break;
                case "4":
                    try {
                        limparTela();
                        System.out.println("Digite o Id do processo que deseja encontrar: ");
                        int idx = sc.nextInt();
                        sc.nextLine();

                        if (fila.existeProcesso(idx))
                            System.out.println("Titulo do Processo: " + fila.retornarProcesso(idx).title + " | "
                                    + " Id do Processo: " + fila.retornarProcesso(idx).id);
                        else
                            System.out.println("Não Existe um processo com esse Id.");
                    } catch (Exception e) {
                        System.out.println("Fila Vazia!");
                    }
                    break;
                case "5":
                    try {
                        limparTela();
                        fila.excluirTodos();
                        System.out.println("Todos os processos foram excluidos!");
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
