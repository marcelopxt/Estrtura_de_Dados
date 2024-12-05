public class Cidade {
    private String nome;
    private String pais;
    private String ponto;
    private int nota;
    public Cidade(String nome, String pais, String ponto, int nota) {
        this.nome = nome;
        this.pais = pais;
        this.nota = nota;
    }
    
    public String getPonto() {
        return ponto;
    }
    public void setPonto(String ponto) {
        this.ponto = ponto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
}
