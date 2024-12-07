
public class Pilha{

static final int tamanhoMaximo = 100;
    Coisa[] pilha = new Coisa[tamanhoMaximo];
    int topo = -1;


    public boolean isVazia(){
        return topo == -1;
    }

    public int getTamanho(){
        return topo;
    }

    public void push(Coisa p)throws Exception{
        if (topo == tamanhoMaximo-1) 
           throw new Exception("A pilha já está cheia!");
        
           pilha[++topo] = p;
    }

    public char top() throws Exception{
        if (isVazia()) {
            throw new Exception("A pilha está vazia!");
        }

        return pilha[topo].getDiamante();
    }

    public Coisa penultimo() throws Exception{
        if (isVazia()) {
            throw new Exception("A pilha está vazia!");
        }

        return pilha[topo--];
    }


    public Coisa pop()throws Exception{
        if (isVazia()) {
            throw new Exception("A pilha está vazia!");
        }

        return pilha[topo--];
    }
}