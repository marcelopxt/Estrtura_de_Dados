class No {
    Cliente elemento;
    No proximo;
    No anterior;
    
    public No(Cliente elemento, No proximo, No anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }

    public No(){
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
}
