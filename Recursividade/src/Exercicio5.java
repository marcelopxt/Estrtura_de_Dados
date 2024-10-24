import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois numeros para saber o maximo divisor comum!");
        System.out.println("1° numero: ");
        int a = sc.nextInt();
        System.out.println("2° numero: ");
        int b = sc.nextInt();
        sc.close();
        int result = calcularMdc(a, b);
        System.out.println("O maximo divisor comum é: " + result);
    }
    public static int calcularMdc(int a, int b) {
        if(a >= b && a % b == 0){
            return  b;
        }else if(a < b){
            return calcularMdc(b, a);
        }else{
            return calcularMdc(b, a%b);
        }
    }
}
