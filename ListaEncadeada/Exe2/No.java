class No {
    Veiculo veiculo;
    No proximo;

    public No(Veiculo veiculo, No proximo) {
        this.veiculo = veiculo;
        this.proximo = proximo;
    }

    public No(){
        this.veiculo = null;
        this.proximo = null;
    }
}
