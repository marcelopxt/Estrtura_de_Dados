import java.util.ArrayList;
import java.util.Iterator;

public class HashTable {
    public static int M = 13;
    private Livro[] tabela;

    public HashTable() {
        tabela = new Livro[M];
    }

    public int hash(String chave) {
        int h = 0;
        for (int i = 0; i < chave.length(); i++) {
            h = (31 * h + chave.charAt(i)) % M;
        }
        return h;
    }

    public void put(Livro l) {
        int salto;
        int hash;
        for (salto = 0; salto < tabela.length; salto++) {
            hash = (hash(l.getIsbn()) + salto) % M;
            if (tabela[hash] == null || tabela[hash].getIsbn().equals(l.getIsbn())) {
                tabela[hash] = l;
                break;
            }
        }
        if (salto == tabela.length) {
            System.out.println("Ta cheio");
        }
    }

    public Livro get(String chave) {
        int salto;
        int hash;
        for (salto = 0; salto < tabela.length; salto++) {
            hash = (hash(chave) + salto) % M;
            if (tabela[hash].getIsbn().equals(chave)) {
                return tabela[hash];
            }
        }
        return null;
    }

    public Livro remove(String chave) {
        int salto;
        int hash;
        Livro livro = null;
        for (salto = 0; salto < tabela.length; salto++) {
            hash = (hash(chave) + salto) % M;
            if (tabela[hash] != null && tabela[hash].getIsbn().equals(chave)) {
                livro = tabela[hash];
                tabela[hash] = null;
            }
        }
        return livro;
    }

    public void status(){
        for (int i = 0; i < tabela.length; i++) {
            if(tabela[i] != null){
                System.out.println("Linha " + i +": " + tabela[i].getTitulo() + " está nessa linha");
            }else{
                System.out.println("Nada aqui");
            }
        }
    }

}
