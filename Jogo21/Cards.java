public class Cards {
    private Cards proximo;
    private int num;

    public Cards(int num) {
        this.num = num;
    }

    public Cards(Cards proximo, int num) {
        this.proximo = proximo;
        this.num = num;
    }

    public Cards getProximo() {
        return proximo;
    }

    public void setProximo(Cards proximo) {
        this.proximo = proximo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
