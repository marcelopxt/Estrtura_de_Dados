import java.util.Random;

public class Player {
    private int pontuacao = 0;
    private int penalidade = 0;
    Pilha baralho;
    Cards carta;
    Random random = new Random();

    public Player(int pontuacao, int penalidade, Pilha baralho) {
        this.pontuacao = pontuacao;
        this.penalidade = penalidade;
        this.baralho = baralho;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public int getPenalidade() {
        return this.penalidade;
    }

    public void setPenalidade(int penalidade) {
        this.penalidade += penalidade;
        this.pontuacao -= 5;
    }

    public Pilha getBaralho() {
        return this.baralho;
    }

    public boolean temPenalidade() {
        return getPenalidade() != 0;
    }

    public int BaralhoInicial() {
        Cards c1 = new Cards(random.nextInt(10) + 1);
        this.baralho.push(c1);
        setPontuacao(c1.getNum());
        return c1.getNum();
    }

    public void pegarCarta() throws Exception {
        Cards c = new Cards(random.nextInt(10) + 1);
        setPontuacao(c.getNum());
        this.baralho.push(c);
    }

    public boolean estourou() throws Exception {
        if (getPontuacao() > 21) {
            setPenalidade(5);
            this.baralho.pop();
            return true;
        } else {
            return false;
        }
    }

    public int getCartaTopo() throws Exception {
        return this.baralho.top().getNum();
    }
}
