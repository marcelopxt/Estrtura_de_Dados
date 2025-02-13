public class Times{
    private String codigo;
    private String nome;
    private String anoFundacao;
    private String presidente;
    private String tecnico;
    public Times
    (String codigo, String nome, String anoFundacao, String presidente, String tecnico) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
        this.presidente = presidente;
        this.tecnico = tecnico;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(String anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    public String getPresidente() {
        return presidente;
    }
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
    public String getTecnico() {
        return tecnico;
    }
    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

}
