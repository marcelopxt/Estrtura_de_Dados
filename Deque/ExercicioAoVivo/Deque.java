public class Deque<T> {
    private int tam;
    NodeDeque<T> cabeca = new NodeDeque<>();
    //NodeDeque<T> cauda = new NodeDeque<>();

    public void addFirst(T element) {
        NodeDeque<T> no = new NodeDeque<>();
        no.setInfo(element);
        if (isEmpty()) {
            cabeca.setProximo(no);
            cabeca.setAnterior(no);
            no.setProximo(cabeca);
            no.setAnterior(cabeca);
        } else {
            no.setProximo(cabeca.getProximo());
            cabeca.getProximo().setAnterior(no);
            no.setAnterior(cabeca);
            cabeca.setProximo(no);
        }
        tam++;
    }

    public void addLast(T element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            NodeDeque<T> no = new NodeDeque<>();
            no.setInfo(element);
            no.setAnterior(cabeca.getAnterior());
            no.setProximo(cabeca);
            cabeca.getAnterior().setProximo(no);
            cabeca.setAnterior(no);
            tam++;
        }
    }

    public T getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Deque vazio");
        }
        T no = cabeca.getAnterior().getInfo();
        return no;
    }

    public T getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Deque vazio");
        }
        T no = cabeca.getProximo().getInfo();
        return no;
    }

    public T removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque vazio");
        }
        T no = cabeca.getProximo().getInfo();
        cabeca.setProximo(cabeca.getProximo().getProximo());
        cabeca.getProximo().setAnterior(cabeca);
        tam--;
        return no;
    }

    public T removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque vazio");
        }
        T no = cabeca.getAnterior().getInfo();
        cabeca.setAnterior(cabeca.getAnterior().getAnterior()
        );
        cabeca.getAnterior().setProximo(cabeca);
        tam--;
        return no;
    }

    public void print() throws Exception {
        NodeDeque<T> no = new NodeDeque<>();
        if(isEmpty()) {
            throw new Exception("Deque vazio");
        }
        no = cabeca.getProximo();
        while (no!=cabeca) {
            System.out.println(no.getInfo());
            no = no.getProximo();
        }
    }

    public int size() {
        return this.tam;
    }

    public boolean isEmpty() {
        return this.tam == 0;
    }
}