package ControleVoos;

public 
class Fila {

    int tam = 0;
    No cauda= new No();
    No cabeca = new No();

    public void enfileirar(Aviao a){
        No atual = new No(null, a);
        if (tam != 0)
            cauda.proximo = atual;
        else
            cabeca = atual;
        cauda = atual;
        tam++;        
    }

    public Aviao desenfileirar() throws Exception{
        if (isEmpty())
            throw new Exception("Está vazia!");
        No aux = cabeca;
        cabeca = cabeca.proximo;
        tam--;
        return aux.elemento;
    }

    public void imprimirTudo() throws Exception{
        if (isEmpty())
        throw new Exception("Está vazia!");
        while (!isEmpty()) {
            System.out.print(desenfileirar().id + " ");
        }
    }

    public boolean isEmpty(){
        return tam == 0;
    }

    


}