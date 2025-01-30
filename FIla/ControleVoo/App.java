package ControleVoos;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String entrada = "A";
        Fila filaNorte = new Fila();
        Fila filaSul = new Fila();
        Fila filaOeste = new Fila();
        Fila filaLeste = new Fila();
        Fila filaAtual = filaOeste;
        Fila resultado = new Fila();

        do {
            entrada = sc.nextLine();
            if (entrada.equals("-1") || entrada.equals("-2") || entrada.equals("-3") || entrada.equals("-4")) {
                switch (entrada) {
                    case "-1":
                        filaAtual = filaOeste;
                        break;
                    case "-2":
                        filaAtual = filaSul;
                        break;
                    case "-3":
                        filaAtual = filaNorte;
                        break;
                    case "-4":
                        filaAtual = filaLeste;
                        break;
                }
            } else if (entrada.equals("0")) {
                while (!filaLeste.isEmpty() || !filaNorte.isEmpty() || !filaSul.isEmpty() || !filaOeste.isEmpty()) {
                    if (!filaOeste.isEmpty())
                        resultado.enfileirar(filaOeste.desenfileirar());
                    if (!filaNorte.isEmpty())
                        resultado.enfileirar(filaNorte.desenfileirar());
                    if (!filaSul.isEmpty())
                        resultado.enfileirar(filaSul.desenfileirar());
                    if (!filaLeste.isEmpty())
                        resultado.enfileirar(filaLeste.desenfileirar());
                }
                resultado.imprimirTudo();
                break;
            } else
                filaAtual.enfileirar(new Aviao(entrada));
        } while (entrada != "0");
        sc.close();
    }
}
