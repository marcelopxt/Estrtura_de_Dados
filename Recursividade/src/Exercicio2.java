import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Informe um número para usar como potencia de 2: ");
            int n = sc.nextInt();
            sc.close();
            System.out.println("o resultado de  2^" + n + " é: " + calcularRecursiva(n));

        } catch (Exception e) {
           System.out.println("Digite um número válido.");
        }
        
    }

    public static double calcularRecursiva(double n) throws Exception {
        if (n < 0) {
            return 1.0/(2 * calcularRecursiva(-n - 1));
        }else if (n == 0) {
            return 1;
        }
        return 2 * calcularRecursiva(n - 1);
    }
}
