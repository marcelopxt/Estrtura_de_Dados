import java.util.Scanner;
public class Exercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número para saber se é primo: ");
            int s = sc.nextInt();
            System.out.println(calcularPrimo(s));
            sc.close();
        } catch (Exception e) {
           System.out.println("Digite um numero válido.");
        }
        
    }

    public static String calcularPrimo(int n) throws Exception{
        if (n < 2) {
            return "Não é primo";
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "Não é primo";
            }
        }
        return "É primo";
    }
}
