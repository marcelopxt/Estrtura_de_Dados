public class Num{
    Num proximo;
    long n;
    
    public Num(long n, Num proximo){
        this.n = n;
        this.proximo = proximo;
    }

    public Num(long n){
        this.n = n;
    }
}