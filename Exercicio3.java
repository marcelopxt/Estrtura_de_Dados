public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        int[] vetor = {
            -320, -300, -280, -260, -240,
            -220, -200, -180, -160, -140,
            -120, -100, -80, -60, -40,
            -20, -15, -10, -5, 0,
            5, 10, 15, 20, 25,
            30, 40, 50, 56, 65,
            70, 75, 80, 85, 90,
            100, 110, 120, 130, 140,
            150, 160, 170, 180, 190,
            200, 210, 220, 230, 240,
            250, 260, 270, 280, 290,
            300, 310
        };
        
        boolean resposta = encontrarMaiores(vetor, 333);
        if (resposta) 
            System.out.println("Sim, o numero está no vetor");
        else
            System.out.println("O numero não está no vetor");
    }

    public static boolean encontrarMaiores(int[] vetor, int n){
        int inicio = 0;
        int fim = vetor.length - 1;
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio)/2;
            if (vetor[meio] == n) {
                return true;
            }else if (vetor[meio] < n) {
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return false;
    }
}
