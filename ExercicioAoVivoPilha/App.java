import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd;
        int cont = 0;
        Pilha d = new Pilha();
            System.out.println("Quantos testes?");
            qtd = sc.nextInt();
            
            while (cont < qtd) {
                int diamantes = 0;
                String entrada = sc.nextLine();
                entrada = sc.next();
                for (int i = 0; i < entrada.length(); i++) {
                    char caracter = entrada.charAt(i);
                    if (caracter == '<') { 
                        d.push(new Coisa(caracter));
                    }else if(caracter == '>'){
                        if (d.isVazia()) {
                        System.out.println("acabou");
                        }else{
                        d.pop();
                        diamantes++;
                        }
                    }
                }
                cont++;
                System.out.println("A sua entrada foi:  " + entrada);
                System.out.println("A quantidade de diamantes é: " + diamantes);
            }
            sc.close();
    }
}
