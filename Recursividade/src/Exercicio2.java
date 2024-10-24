import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para usar como potencia de 2: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("o resultado de  2^" + n + " é: " + calcularRecursiva(n));
    }

    public static double calcularRecursiva(double n) {
        if (n < 0) {
            return 1.0/(2 * calcularRecursiva(-n - 1));
        }else if (n == 0) {
            return 1;
        }
        return 2 * calcularRecursiva(n - 1);
    }
}
