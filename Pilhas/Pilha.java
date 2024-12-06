public class Pilha {
    static final int tamMax = 1000;
    Vagao[] pilha = new Vagao[tamMax];
    int topo = -1;

    public boolean isVazia() {
        return topo == -1;
    }

    public int getTamanho() {
        return topo + 1;
    }

    public void push(Vagao v) throws Exception {
        if (topo == tamMax - 1) {
            throw new Exception("A pilha já está cheia");
        }
        pilha[++topo] = v;
    }

    public Vagao pop() throws Exception {
        if (this.isVazia()) {
            throw new Exception("A pilha está vazia");
        }
        return pilha[topo--];
    }

    public Vagao top() throws Exception {
        if (this.isVazia()) {
            throw new Exception("A pilha está vazia");
        }
        return pilha[topo];
    }

    public boolean verificarOrdem(Pilha resultado) throws Exception {
        if (resultado.isVazia()) {
            throw new Exception("A pilha resultado está vazia!");
        }

        boolean achou = false;
        Pilha aux = new Pilha();
        int x = 1;
        int querQsaia = resultado.top().getNum();
        while (!resultado.isVazia()) {
            if (!aux.isVazia() && aux.top().getNum() == querQsaia) {

                aux.pop();
                resultado.pop();
                if (!resultado.isVazia()) {
                    querQsaia = resultado.top().getNum();
                }
                achou = true;
            } else if (x <= tamMax) {
                aux.push(new Vagao(x));
                x++;
            } else {
                return false;
            }
        }
        
        return achou;
    }

}