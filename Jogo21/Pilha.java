public class Pilha {
    int tam;
    Cards topo;

    public boolean isEmpty() {
        return tam == 0;
    }

    public void push(Cards x) {
        if (!isEmpty())
            x.setProximo(topo);
        topo = x;
        tam++;
    }

    public Cards pop() throws Exception {
        if (isEmpty())
            throw new Exception("A pilha esta vazia!");
        Cards res = topo;
        topo = topo.getProximo();
        tam--;
        return res;
    }

    public Cards top() throws Exception {
        if (isEmpty())
            throw new Exception("A pilha esta vazia!");
        return topo;
    }

}
