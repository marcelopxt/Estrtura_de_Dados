public class Bst{
    Node root = null;
    
    public void insert(Node no, Ano ano){
        if(no != null){
            if(ano.temp > no.ano.temp){
                if (no.direita != null) {
                    insert(no.direita, ano);
                }else
                    no.direita = new Node(ano);
            }else if(no.esquerda != null){
                insert(no.esquerda, ano);
            }else
                no.esquerda = new Node(ano);
        }else{
            root = new Node(ano);
        }
    }

    public boolean verificaAposta(Node no, int aposta){
        try {
            int maior = maiorTemp(no).ano.ano;
            return maior == aposta;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Node maiorTemp(Node no)throws Exception{
        if(no == null)
            throw new Exception("No nulo");
        
        if(no.direita != null)
            return maiorTemp(no.direita);
        return no;   
    }

    public void inOrder(Node no){
        if(no != null){
            inOrder(no.esquerda);
            System.out.println(no.ano.toString());
            inOrder(no.direita);
        }
    }

}