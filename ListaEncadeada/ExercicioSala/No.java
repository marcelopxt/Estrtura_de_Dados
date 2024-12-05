public class No {
    public No proximo;
    public No anterior;
    public Cidade elemento;
    
    public No(Cidade elemento, No proximo, No anterior) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public No() {
        this.proximo = null;
        this.anterior = null;
        this.elemento = null;
    }

}
