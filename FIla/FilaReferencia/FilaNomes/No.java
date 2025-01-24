package SemGenerics;

public class No {
    No proximo;
    String nome;
    Pessoa pessoa;

    public No() {
    }

    public No(No proximo, Pessoa pessoa) { // na fila Q
        this.proximo = proximo;
        this.pessoa = pessoa;
    }
    public No(No proximo, String nome) { // nas filas A e B
        this.proximo = proximo;
        this.nome = nome;
    }

    
}
