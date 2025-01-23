package Cartas;

public class Fila {
    static final int tamMax = 50;
    int tamanho = 0;
    int inicio = 0;
    int fim = 0;
    Cartas cartas[] = new Cartas[tamMax];



    public void enfileirar(Cartas s) throws Exception{
        if(isFull())
        throw new Exception("A fila já atingiu o limite!");

        cartas[fim] = s;
        fim++;

        if(fim == tamMax)
        fim = 0;

        tamanho++;
    }

    public Cartas desenfileirar() throws Exception{

        if(isEmpty())
        throw new Exception("A lista está vazia!");

        Cartas aux = cartas[inicio];
        inicio++;
        if(inicio == tamMax)
        inicio = 0;
        tamanho--;
        return aux;
    }

        public Cartas consultarPrimeiro() throws Exception{
        if (isEmpty())
            throw new Exception("Fila vazia");
        return cartas[inicio];
    }

    
    public void imprimirCartas()throws Exception{
        if(isEmpty())
        throw new Exception("A fila está vazia!");

        for (int i = inicio; i < fim; i++) {
            if (i == fim-1 || tamanho == 1) {
             System.out.println(cartas[i].num);
             break;
            }
            System.out.print(cartas[i].num + ", ");
        }
    }


    public void excluirTodos()throws Exception{
        if (isEmpty()) 
            throw new Exception("A Fila está vazia!");
        while (!isEmpty())
            this.desenfileirar();
            this.tamanho = 0;

        
    }

    public boolean isFull(){
        return tamMax == tamanho;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }
}
