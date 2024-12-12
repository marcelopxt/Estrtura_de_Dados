public class Pilha {
    int tam = 0;
    Num topo;
    

    public boolean isEmpty(){
        return tam == 0;
    }

    public void push(Num n){
        if (!isEmpty())
            n.proximo = topo;

        topo = n;
        tam++;
    }

    public Num pop()throws Exception{
        if (isEmpty())
            throw new Exception("Esta vazia");

        Num res = topo;
        topo = topo.proximo;
        tam--;
        return res;
    }

    public Num top(){
        return topo;
    }

    public int getTamanho(){
        return tam;
    }
}
