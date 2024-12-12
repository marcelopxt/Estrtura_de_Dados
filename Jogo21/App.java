public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player(0, 0, new Pilha());
        Player p2 = new Player(0, 0, new Pilha());
        Jogo j = new Jogo();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Turno do jogador " + i);
            if (i == 1)
                j.rolarTurno(p1);
            else
                j.rolarTurno(p2);
        }

        System.out.println("O vencedor do jogo é... \n \n \n" + j.getResultado(p1, p2));
    }
}
