import java.util.Random;

public class Ex2 {
    public static int posicao = -1;

    public static void main(String[] args) throws Exception {
        int[] vet = new int[100];
        int x;
        Random rd = new Random();
        int opcao;

        for (int i = 0; i < vet.length; i++) {
            x = rd.nextInt(1, 10);
            opcao = rd.nextInt(1, 3);
            switch (opcao) {
                case 1:
                    inicio(vet, x);
                    break;
                case 2:
                    ultima(vet, x);
                    break;
                case 3:
                    penultima(vet, x, vet.length - 2);
                    break;
                default:
                    System.out.println("Ocorreu um erro no switch Case.");
                    break;
            }
        }
        for (int j = 0; j < vet.length; j++) {
            System.out.print(vet[j] + " ");
        }
    }

    public static void inicio(int[] vetor, int x) throws Exception {
        if (posicao == vetor.length - 1)
            throw new Exception("O vetor já esta cheio!");

        for (int i = (posicao + 1); i > 0; i--) {
            vetor[i] = vetor[i - 1];
        }
        vetor[0] = x;
        posicao++;
    }

    public static void ultima(int[] vetor, int x) throws Exception {
        if (posicao == vetor.length - 1)
            throw new Exception("O vetor já esta cheio!");
        vetor[++posicao] = x;
    }

    public static void penultima(int[] vetor, int x, int p) throws Exception {
        if (posicao == vetor.length - 1)
            throw new Exception("Sem espaco.");
        if (p > posicao)
            ultima(vetor, x);
        else {
            for (int i = posicao + 1; i > p; --i)
                vetor[i] = vetor[i - 1];
            vetor[p] = x;
            posicao++;
        }
    }
}
