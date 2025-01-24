package SemGenerics;

import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String tudo = "1";
        String nome;
        String operacao;

        Fila filaA = new Fila();
        Fila filaB = new Fila();
        Fila filaQ = new Fila();

        System.out.println("Digite um nome e uma operacao (separe com ',')");
        while (!tudo.equals( "0")) {
            tudo = sc.nextLine();
            if (!tudo.equals("0")){
            String[] separado = tudo.split(",");
            nome = separado[0];
            operacao = separado[1].toUpperCase();
            filaQ.enfileirarQ(new Pessoa(nome, operacao));
            }else{
                break;
            }
        }

        while (!filaQ.isEmpty()) {
            Pessoa atual = filaQ.desenfileirarQ();
            if (atual.ope.equals("A")) {
                filaA.enfileirar(atual.nome);
            }else if(atual.ope.equals("B")){
                filaB.enfileirar(atual.nome);
            }else{
                if (filaA.tam == filaB.tam) 
                    continue;
                else if(filaA.tam < filaB.tam)
                    filaA.enfileirar(atual.nome);
                else
                    filaB.enfileirar(atual.nome);
            }
        }


        System.out.println("\n \nFila A: ");
        while (!filaA.isEmpty()) {
            System.out.println("- " + filaA.desenfileirar());
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Fila B: ");
        while (!filaB.isEmpty()) {
            System.out.println("- " + filaB.desenfileirar());
        }
        sc.close();
    }


}