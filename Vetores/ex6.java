import java.util.Random;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        int[] vet = { 0, 2, 4, 6, 8, 10, 12 };
        int[] vet2 = { 1, 3, 5, 7, 9, 11, 13 };
        int[] result = preencherVetor(vet, vet2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] preencherVetor(int[] v1, int[] v2) {
        int[] vet3 = new int[v1.length];
        int cont1 = 0;
        int cont2 = 0;
        Random rd = new Random();
        int opcao;

        for (int i = 0; i < vet3.length; i++) {
            opcao = rd.nextInt();
            if (opcao % 2 == 0) {
                vet3[i] = v1[cont1];
                cont1++;
            } else {
                vet3[i] = v2[cont2];
                cont2++;
            }
        }
        return vet3;
    }
}
