import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite dois numeros para saber o maximo divisor comum!");
            System.out.println("1° numero: ");
            int a = sc.nextInt();
            System.out.println("2° numero: ");
            int b = sc.nextInt();
            sc.close();
            if (b == 0) {
                b = a;
            }
            int result = calcularMdc(a, b);
            System.out.println("O maximo divisor comum é: " + result);
        } catch (Exception e) {
           System.out.println("Digite um numero válido.");
        }
    }
    public static int calcularMdc(int a, int b) throws Exception {
        if(a >= b && a % b == 0){
            return  b;
        }else if(a < b){
            return calcularMdc(b, a);
        }else{
            return calcularMdc(b, a%b);
        }
    }
}
