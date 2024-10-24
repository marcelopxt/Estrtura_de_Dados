import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número usar como base da multiplicação: ");
        int base = sc.nextInt();
        System.out.println("Digite um número para ser multiplicado pela base: ");
        int num = sc.nextInt();
        sc.close();
        int result = multiplicarRecursiva(base, num);
        System.out.println("O resultado dessa multiplicação é: " + result);
    }
    public static int multiplicarRecursiva(int xbase, int xnum){
        int total = 0;
        return multiplicarRecursiva(xbase, xnum, total);
    }

    public static int multiplicarRecursiva(int xbase, int xnum, int total){
        if(xbase == 0){
            return total;
        }
        total += xnum;
        return multiplicarRecursiva(--xbase, xnum, total);
    }

}
