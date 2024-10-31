public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = { 12, 3333, 3333, 3333,-34, 56, -78, 90, -23, 45, -67, 89, -10,
                -15, 25, -35, 45, -55, 65, -75, 85, -95, 20,
                30, -40, 50, -60, 70, -80, 90, -100, 110, -120,
                130, -140, 150, -160, 170, 290, -180, 190, -200, 210, -220,
                230, -240, 250, -260, 270, -280, 290, -300, 309
                , -320
        };
        int[] resposta = encontrarMaiores(vetor1);
        System.out.println("O 1° maior numero é: " + resposta[0]);
        System.out.println("O 2° maior numero é: " + resposta[1]);
        System.out.println("O 3° maior numero é: " + resposta[2]);
    }
// A complexidade é O(n)
    public static int[] encontrarMaiores(int[] vetor) {
        int maior1 = 0;
        int maior2 = 0;
        int maior3 = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior1 || vetor[i] == maior1) {
                maior3 = maior2;
                maior2 = maior1;
                maior1 = vetor[i];
            } else if ((vetor[i] > maior2) || (vetor[i] == maior2)) {
                maior3 = maior2;
                maior2 = vetor[i];  
            } else if ((vetor[i] > maior3)) {
                maior3 = vetor[i];
            }
        }

        int[] resposta = { maior1, maior2, maior3 };
        return resposta;
    }
}
