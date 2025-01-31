package Deque.ExemploSlide;

public class NoDeDeque<T>{
    private NoDeDeque<T> proximo;
    private NoDeDeque<T> anterior;
    private T info;


    public NoDeDeque(T info){
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public NoDeDeque(){
        this(null);
    }

    public NoDeDeque<T> getProximo(){
        return proximo;
    }

    public NoDeDeque<T> getAnterior(){
        return anterior;
    }

    public T getInfo(){
        return info;
    }

    public void setProximo(NoDeDeque<T> proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(NoDeDeque<T> anterior) {
        this.anterior = anterior;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    
}