package SemGenerics;

public class Fila{
    int tam = 0;
    No cabeca = new No();
    No cauda = new No();

    public void enfileirar(String nome){ // nas filas A e B
        No el = new No(null, nome);
        if (tam != 0) 
            cauda.proximo = el;
        else
            cabeca = el;
        cauda = el;
        tam++;
    }

    public String desenfileirar()throws Exception{ // nas filas A e B
       if (isEmpty()) 
        throw new Exception("ta vazia ze");
        String result = cabeca.nome;
        cabeca = cabeca.proximo;
        tam--;
        return result;
    }

    public void enfileirarQ(Pessoa pessoa){ // na Fila Q
        No el = new No(null, pessoa);
        if (tam != 0) 
            cauda.proximo = el;
        else
            cabeca = el;
        cauda = el;
        tam++;
    }


    public Pessoa desenfileirarQ()throws Exception{ // na fila Q
        if (isEmpty()) 
         throw new Exception("ta vazia ze");

         Pessoa result = cabeca.pessoa;
         cabeca = cabeca.proximo;
         tam--;
         return result;
     }


    public boolean isEmpty(){
        return tam == 0;
    }


}