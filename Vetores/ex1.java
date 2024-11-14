import java.util.Random;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        System.out.print("O vetor inicial é: ");
        int[] v = criarVetor();
        imprimirVetor(v);

        
        System.out.print("\nO vetor sem numeros pares fica assim: ");
        int[] vsp = retirarPares(v);
        imprimirVetor(vsp);
    }

    public static int[] criarVetor() {
        int[] vetor = new int[10];
        Random rd = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1, 100);
        }   
        return vetor;
    }

    public static void imprimirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

    public static int[] retirarPares(int[] x) throws Exception {
        int qntdImpares = 0;
        int indice = 0;
       

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                qntdImpares++;
            }
        }
        int[] vet = new int[qntdImpares];
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 != 0) {
                vet[indice] = x[i];
                indice++;
            }
        }

        return vet;
    }
}
