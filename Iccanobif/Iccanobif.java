public class Iccanobif {
    Pilha p = new Pilha();

    public long calcularFibonacci(int x){
        if (x == 1 || x == 0)
            return x;

        long a = 0;
        long b = 1;
        long resultado = 0;

        for (long i = 2; i <= x; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        
        return resultado;
    }

    public void imprimirPilha(int x) throws Exception{
        for (int i = 1; i <= x; i++)
            p.push(new Num(calcularFibonacci(i)));
        while (!p.isEmpty()) 
            System.out.println(p.pop().n); 
    }
}
