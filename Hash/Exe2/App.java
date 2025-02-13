import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        HashTale ht = new HashTale();
        Boolean taNoSys = true;
        String opcao;

        while (taNoSys) {
            System.out.println("O que deseja fazer? (1- criar time; 2- pesquisar; 3- excluir; 0 - sair)");
            opcao = in.nextLine();

            switch (opcao) {
                case "0":
                    System.out.println("Saindo...");
                    taNoSys = false;
                break;
                case "1":
                    System.out.println("Digite o codigo do time: ");
                    String cod = in.nextLine();
                    System.out.println("Digite o nome do time: ");
                    String nome = in.nextLine();
                    System.out.println("Digite o ano de fundacao do time: ");
                    String anoFund = in.nextLine();
                    System.out.println("Digite o nome do presidente do time: ");
                    String presida = in.nextLine();
                    System.out.println("Digite o nome do técnico do time: ");
                    String tec = in.nextLine();

                    Times tim = new Times(cod, nome, anoFund, presida, tec);
                    ht.put(tim);
                    System.out.println("Time: " + nome + " criado com sucesso!");
                    break;
                case "2":
                    System.out.println("Digite o codigo do time que deseja pesquisar: ");
                    String codPesq = in.nextLine();
                    Times timPesq = ht.get(codPesq);
                    System.out.println("-----------------------| Time Pesquisado |-----------------------");
                    System.out.println("Codigo: " + timPesq.getCodigo());
                    System.out.println("Nome: " + timPesq.getNome());
                    System.out.println("Ano fundacao: " + timPesq.getAnoFundacao());
                    System.out.println("Presidente: " + timPesq.getPresidente());
                    System.out.println("Tecnico: " + timPesq.getTecnico());
                    System.out.println("-----------------------------------------------------------------");
                    break;
                case "3":
                    System.out.println("Digite o codigo do time que deseja excluir: ");
                    String codExcluir = in.nextLine();
                    Times timExcluir = ht.remove(codExcluir);
                    if (timExcluir != null)
                        System.out.println("O time: " + timExcluir.getNome() + " foi removido.");
                    break;
                default:
                    System.out.println("Digite uma opcao válida!");
                    continue;
            }
        }
        in.close();
    }

}
