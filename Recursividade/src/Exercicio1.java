import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        System.out.print("Informe um número: ");
        int n = sc.nextInt();
        System.out.println("Você deseja saber o fatorial [1], ou o fibonacci [2] de " + n + "?"); 
        int escolha = sc.nextInt();
        System.out.println("");
        sc.close();
            if (escolha == 1) {
                System.out.println("o fatorial de " + n + " é: " + calcularFatorial(n));
            } else {
                if (n < 0) {
                    System.out.println("Por favor, digite um numero positivo se quiser calcular o Fibonacci!");
                }else{
                System.out.println("O Fibonacci de " + n + " é: " + calcularFibonacci(n));
                System.out.println("A sequencia fica assim: ");
                for(int i = 0 ; i <= n; i++){
                    System.out.println(calcularFibonacci(i));
                }
                }
            }
        } catch (Exception e) {
           System.out.println("Por favor, digite um numero válido.");
        }
    }

    public static long calcularFibonacci(int x) throws Exception{
        if (x <= 1) {
            return x;
        }
        long a = 0;
        long b = 1;
        long result = 0;

        for (int i = 2; i <= x; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static long calcularFatorial(int x) throws Exception{
        long result = 1;
        if (x < 0) {
            for (int i = x; i < -1; i++) {
                result *= i;
            }
        }else{
        for (int i = x; i > 1; i--) {
            result *= i;
        }
    }
        return result;
    }
}
