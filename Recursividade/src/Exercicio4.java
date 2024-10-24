import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número usar como base da multiplicação: ");
            int base = sc.nextInt();
            System.out.println("Digite um número para ser multiplicado pela base: ");
            int num = sc.nextInt();
            sc.close();
            int result = multiplicarRecursiva(base, num);
            System.out.println("O resultado dessa multiplicação é: " + result);
        } catch (Exception e) {
           System.out.println("Digite um numero válido.");
        }
    }
    public static int multiplicarRecursiva(int xbase, int xnum) throws Exception{
        int total = 0;
        return multiplicarRecursiva(xbase, xnum, total);
    }

    public static int multiplicarRecursiva(int xbase, int xnum, int total) throws Exception{
        if(xbase == 0){
            return total;
        }
        total += xnum;
        return multiplicarRecursiva(--xbase, xnum, total);
    }

}
