public class ListaEncadeada {
    private No cabeca = new No();
    private No cauda = cabeca;
    private No elemento;
    public int tamanho = 0;


    public void inserirOrdenado(Cliente c) {
        No novo = new No(c, null, null);

        if (tamanho == 0) { 
            cabeca.proximo = novo;
            novo.anterior = cabeca;
            cauda = novo;
        } else {
            No atual = cabeca.proximo;

            while (atual != null && atual.elemento.getCodigo() < c.getCodigo()) {
                atual = atual.proximo;
            }

            if (atual == null) {
                cauda.proximo = novo;
                novo.anterior = cauda;
                cauda = novo;
            } else {
                novo.proximo = atual;
                novo.anterior = atual.anterior;
                atual.anterior.proximo = novo;
                atual.anterior = novo;
            }
        }
        tamanho++;
    }

    public void exibirOrdemCrescente() {
        No atual = cabeca.proximo;
        while (atual != null) {
            System.out.println("Código: " + atual.elemento.getCodigo());
            System.out.println("Nome: " + atual.elemento.getNome());
            System.out.println("Telefone: " + atual.elemento.getTelefone());
            System.out.println("----------------------");
            atual = atual.proximo;
        }
    }

    public void exibirOrdemDecrescente() {
        No atual = cauda;
        while (atual != cabeca) {
            System.out.println("Código: " + atual.elemento.getCodigo());
            System.out.println("Nome: " + atual.elemento.getNome());
            System.out.println("Telefone: " + atual.elemento.getTelefone());
            System.out.println("----------------------");
            atual = atual.anterior;
        }
    }

    public void print(){
        No el = cabeca.proximo;
        while (el!=null){
            System.out.println("Código: " + el.elemento.getCodigo());
            System.out.println("Nome: " + el.elemento.getNome());
            System.out.println("Telefone: " + el.elemento.getTelefone());

            el = el.proximo;
        }
    }
    public int tamanho(){
        return tamanho;
    }
}
