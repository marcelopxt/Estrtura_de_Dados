import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int n = sc.nextInt();

        System.out.println("Você deseja saber o fatorial [1], ou o fibonacci [2] de " + n + "?");
        int escolha = sc.nextInt();
        sc.close();

        if (escolha == 1) {
            System.out.println("o fatorial de " + n + " é: " + calcularFatorial(n));
        } else {
            System.out.println("o Fibonacci de " + n + " é: " + calcularFibonacci(n));

        }
    }

    public static long calcularFibonacci(int x) {
        if (x <= 1) {
            return x;
        }

        long a = 0;
        long b = 1;
        long result = 1;

        for (int i = 2; i <= x; i++) {
            result = a + b;
            a = b;
            b = result;
        }

        return result;
    }

    public static long calcularFatorial(int x) {
        long result = 1;
        for (int i = x; i > 1; i--) {
            result *= i;
        }
        return result;
    }
}
