package Fila.ProcessosOperacionais;

public class FilaArranjo {
    static final int TAM_MAX = 100;
    int inicio = 0; 
    int fim = 0; 
    int tamanho = 0;
    
    Processo vetor[] = new Processo[TAM_MAX];

    public void incluirProcesso(Processo p) throws Exception{
        if (isFull())
            throw new Exception("Fila cheia");
        vetor[fim] = p;
        fim++;
        if (fim == TAM_MAX)
            fim = 0;
        
        tamanho++;
    }
    public Processo retirarProcesso() throws Exception{
        if (isEmpty())
            throw new Exception("Fila vazia");
        Processo aux = vetor[inicio];
        inicio++;
        if (inicio == TAM_MAX)
            inicio = 0;
        tamanho--;
        return aux;
    }

    public Processo consultarPrimeiro() throws Exception{
        if (isEmpty())
            throw new Exception("Fila vazia");
        return vetor[inicio];
    }

    public void excluirTodos()throws Exception{
        if (isEmpty()) 
            throw new Exception("A Fila está vazia!");
        while (!isEmpty()) 
            this.retirarProcesso();
        System.out.println("Processos Excluidos");
    }

    public void imprimirProcessos()throws Exception{
        if(isEmpty())
        throw new Exception("A lista está vazia!");

        for (int i = inicio; i < fim; i++) {
            System.out.println("Titulo do Processo: " + vetor[i].title + " | " + " Id do Processo: " + vetor[i].id);
        }
    }

    public boolean existeProcesso(int find)throws Exception{
        if(isEmpty())
        throw new Exception("A lista está vazia!");
        boolean achou = false;

        if (find >= inicio && find <= fim){      
        for (int i = inicio; i < fim; i++) {
            if (vetor[i].id == find) 
                achou = true;
            }
    }
        return achou;
    }

    public Processo retornarProcesso(int find)throws Exception{
        if(isEmpty())
        throw new Exception("A lista está vazia!");
        return vetor[find];
    }

    public boolean isFull() {
        return tamanho == TAM_MAX;
    }
    public boolean isEmpty() {
        return tamanho == 0;
    }

    
    
}

