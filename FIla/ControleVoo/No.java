package ControleVoos;

public class No {
    No proximo;
    Aviao elemento;

    public No(No proximo, Aviao elemento){
        this.proximo = proximo;
        this.elemento = elemento;
    }
    
    public No(){
        this.proximo = null;
        this.elemento = null;
    }
}
