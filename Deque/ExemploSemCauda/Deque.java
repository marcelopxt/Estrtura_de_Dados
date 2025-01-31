package Deque.ExemploSlide;

public class Deque<T>{
    private int tam;
    NoDeDeque<T> cabeca =  new NoDeDeque<>();



    public void addFirst(T elemento){
        NoDeDeque<T> no = new NoDeDeque<>();
        no.setInfo(elemento);
        if (isEmpty()) {
            cabeca.setProximo(no);
            cabeca.setAnterior(no);
            no.setProximo(cabeca);
            no.setAnterior(cabeca);
        }else{
            no.setProximo(cabeca.getProximo());
            no.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(no);
            cabeca.setProximo(no);
        }
        tam++;
    }

    public void addLast(T elemento){
        if(isEmpty()) addFirst(elemento);
        else{
            NoDeDeque<T> no = new NoDeDeque<>();
            no.setInfo(elemento);
            no.setProximo(cabeca);
            no.setAnterior(cabeca.getAnterior());
            cabeca.getAnterior().setProximo(no);
            cabeca.setAnterior(no);
        }
        tam++;
    }

    public T removeFirst() throws Exception{
        if(isEmpty())
        throw new Exception("Está vazia.");

        T no = cabeca.getProximo().getInfo();
        cabeca.setProximo(cabeca.getProximo().getProximo());
        cabeca.getProximo().setAnterior(cabeca);
        tam--;
        return no;
    }

    public T removeLast() throws Exception{
        if(isEmpty())
        throw new Exception("Está vazia.");


        T no = cabeca.getAnterior().getInfo();
        cabeca.setAnterior(cabeca.getAnterior().getAnterior());
        cabeca.getAnterior().setProximo(cabeca);;
        tam--;
        return no;
    }

    public void print()throws Exception{
        if(isEmpty())
        throw new Exception("Esta vazia.");
        NoDeDeque<T> no = new NoDeDeque<>();
        no = cabeca.getProximo();
        while (no != cabeca) {
            System.out.println(no.getInfo());
            no = no.getProximo();
        }


    }



    public int size(){return this.tam;}
    public boolean isEmpty(){ return tam == 0;}
}
