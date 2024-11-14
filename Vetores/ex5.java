public class Ex5 {
    public static void main(String[] args) throws Exception {
        int [] teste = {10, 4, 5, 2, 1, 6, 7, 3, 8, 9};
        imprimirOrdenado(teste);    
    }
    
    public static void imprimirOrdenado(int[] vetor) {
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        for (int i = menor; i <= maior; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == i) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }

    }
}
