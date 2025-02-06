public class Parcela {
    private double valor;
    private double jurosP;


    public Parcela(double valor, double jurosP) {
        this.valor = valor;
        this.jurosP = jurosP;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return Double.toString(valor);
    }

    public double getJurosP() {
        return jurosP;
    }

    public void setJurosP(double jurosP) {
        this.jurosP = jurosP;
    }
}
