package Deque.ExemploSlide;

public class Numero{
    int num;

    public Numero(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num = num;
    }
    
    @Override
    public String toString(){
        return Integer.toString(num);
    }
}