package Fila.SistemaSenha;

public class Fila {
    static final int tamMax = 50;
    int tamanho = 0;
    int inicio = 0;
    int fim = 0;
    Senha senhas[] = new Senha[tamMax];



    public void solicitarSenha(Senha s) throws Exception{
        if(isFull())
        throw new Exception("A fila já atingiu o limite!");
        senhas[fim++] = s;
        if(fim == tamMax)
        fim = 0;
        tamanho++;
    }

    public Senha irAtendimento() throws Exception{
        if(isEmpty())
        throw new Exception("A lista está vazia!");
        Senha aux = senhas[inicio];
        inicio++;
        if(inicio == tamMax)
        inicio = 0;
        tamanho--;
        return aux;
    }


    public boolean isFull(){
        return tamMax == tamanho;
    }

    public boolean isEmpty(){
        return tamanho == 0;
    }
}
