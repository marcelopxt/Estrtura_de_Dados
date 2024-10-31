public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = {12, -34, 56, -78, 90, -23, 45, -67, 89, -10,
            -15, 25, -35, 45, -55, 65, -75, 85, -95, 20,
            30, -40, 50, -60, 70, -80, 90, -100, 110, -120,
            130, -140, 150, -160, 170, -180, 190, -200, 210, -220,
            230, -240, 250, -260, 270, -280, 290, -300, 310, -320
        };
        int [] resposta = encontrarMaiores(vetor1);
        System.out.println("O maior numero é: " + resposta[0]);
        System.out.println("O menor numero é: " + resposta[1]);
    }
    
//Complexidade O(n)
    public static int[] encontrarMaiores(int[] vetor){
        int maior = vetor[0];
        int menor  = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];   
            }
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }
        int[] resposta = {maior, menor};
        return resposta;
    }
}
