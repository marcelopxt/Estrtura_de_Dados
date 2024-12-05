public class ListaCidade {
    private No cabeca = new No();
    private No cauda = cabeca;
    private int tamanho = 0;
    private No atual1 = cabeca;

    public void add(Cidade c) {
        No elemento = new No(c, null, null);

        if (tamanho == 0) {

            cabeca.proximo = elemento;
            elemento.anterior = cabeca;
            cauda = elemento;
        } else if (c.getNota() <= cauda.elemento.getNota()) {

            cauda.proximo = elemento;
            elemento.anterior = cauda;
            cauda = elemento;
        } else if (c.getNota() > cabeca.proximo.elemento.getNota()) {

            elemento.proximo = cabeca.proximo;
            cabeca.proximo.anterior = elemento;
            cabeca.proximo = elemento;
            elemento.anterior = cabeca;
        } else {

            No atual = cabeca.proximo;
            while (atual != null && atual.elemento.getNota() >= c.getNota()) {
                atual = atual.proximo;
            }
            elemento.proximo = atual;
            elemento.anterior = atual.anterior;

            if (atual != null) {
                atual.anterior.proximo = elemento;
                atual.anterior = elemento;
            }

        }
        tamanho++;
    }

    public void imprimir(int op) {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }

        if (op == 1) {
            if (atual1.proximo != null) {
                atual1 = atual1.proximo;
            } else {
                System.out.println("Você já está no último elemento.");
            }
        } else if (op == 2) {
            if (atual1.anterior != null && atual1.anterior != cabeca) {
                atual1 = atual1.anterior;
            } else {
                System.out.println("Você já está no primeiro elemento.");
            }
        }
        exibirAtual();
    }

    public void exibirAtual() {
        if (atual1 == cabeca) {
            System.out.println("Nenhum elemento selecionado.");
        } else {
            System.out.println("O nome da Cidade é: " + atual1.elemento.getNome());
            System.out.println("O nome do País é: " + atual1.elemento.getPais());
            System.out.println("Seu ponto turistico é " + atual1.elemento.getPais());
            System.out.println("A nota é: " + atual1.elemento.getNota());
        }
    }

    public void removerCidade(String nome, String pais) {
        No atual = cabeca.proximo;
        boolean achou = false;

        while (atual != null) {
            if (atual.elemento.getNome().equals(nome) && atual.elemento.getPais().equals(pais)) {
                achou = true;

                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                }
                if (atual == cauda) {
                    cauda = atual.anterior;
                }

                tamanho--;
                System.out.println("Cidade removida com sucesso!");
                return;
            }
            atual = atual.proximo;
        }

        if (!achou) {
            System.out.println("Cidade não encontrada.");
        }
    }
}
