import java.util.Scanner;

public class Jogo {
    Scanner sc = new Scanner(System.in);
    String opcao;

    public void limparTela() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

    public void rolarTurno(Player p) throws Exception {
        boolean emJogo = true;
        System.out.println("Olá! Esta é sua carta inicial: " + p.BaralhoInicial());

        while (emJogo) {
            System.out.println("Sua pontuação atual é: " + p.getPontuacao());
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Pegar uma carta");
            System.out.println("2 - Passar turno");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    limparTela();
                    p.pegarCarta();
                    System.out.println("A sua carta é: " + p.getCartaTopo());
                    if (p.estourou()) {
                        System.out.println("\n \n \nVocê estourou! Aplicando penalidade (-5). Sua pontuação total foi: "
                                + p.getPontuacao());
                        System.out.println("Seu turno foi encerrado!\n \n \n");
                        emJogo = false;
                    }
                    break;

                case "2":
                    System.out.println("Você decidiu passar o turno. \n \n \n");
                    emJogo = false;
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void getCartasDoVencedor(Player p) throws Exception {
        System.out.println("Com as cartas: ");
        while (!p.getBaralho().isEmpty()) {
            System.out.println("Carta: " + p.getBaralho().pop().getNum() + "\n");
        }

    }

    public String getResultado(Player p1, Player p2) throws Exception {
        boolean p1Estourou = p1.getPontuacao() > 21;
        boolean p2Estourou = p2.getPontuacao() > 21;

        if (p1Estourou && p2Estourou)
            return "Ambos os jogadores estouraram! Não há vencedores.";

        if (p1Estourou) {
            getCartasDoVencedor(p2);
            return "Player 2 venceu! Player 1 estourou.\n";
        }

        if (p2Estourou) {
            getCartasDoVencedor(p1);
            return "Player 1 venceu! Player 2 estourou.\n";
        }

        if (p1.getPontuacao() > p2.getPontuacao()) {
            getCartasDoVencedor(p1);
            return "Player 1 venceu!\n";
        } else if (p1.getPontuacao() < p2.getPontuacao()) {
            getCartasDoVencedor(p2);
            return "Player 2 venceu!\n";
        } else
            return "Houve um empate!";

    }

}
