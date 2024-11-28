public class Candidato {
    private int inscricao;
    private String nome;
    private String nota;

    public Candidato(int Inscr, String name, String not){
        this.inscricao = Inscr;
        this.nome = name;
        this.nota = not;

    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(String nota){
        this.nota = nota;
    }

    public void setInscricao(int cod){
        this.inscricao = cod;
    }

    public int getInscricao(){
        return this.inscricao;
    }

    public String getNome(){
        return this.nome;
    }

    public String getNota(){
        return this.nota;
    }
}
