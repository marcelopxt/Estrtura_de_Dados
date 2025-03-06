public class Node{
    Ano ano;
    Node direita;
    Node esquerda;
    public Node(Ano ano) {
        this.ano = ano;
    }
    public Node(Ano ano, Node direita, Node esquerda) {
        this.ano = ano;
        this.direita = direita;
        this.esquerda = esquerda;
    }
    

}