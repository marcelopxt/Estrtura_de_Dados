public class ListaCandidato {
    private int tamanho = 20000;
    private Candidato[] F;
    private int contadorFunc = 0;

    public ListaCandidato() {
        F = new Candidato[tamanho];
    }

    public int getContador(){
        return contadorFunc;
    }

    public void encontrar(String nome) throws Exception {
        boolean achou = false;
        for (int i = 0; i < contadorFunc; i++) {
            if (nome.equals(F[i].getNome())) {
                achou = true;
                System.out.println("Inscrição: " + F[i].getInscricao());
                System.out.println("Candidato: " + F[i].getNome());
                System.out.println("Nota: " + F[i].getNota());
                System.out.println(" ");

            }
        }

        if (!achou) {
            System.out.println("Esse Candidato nao foi encontrado.");
        }
    }


    public void add(Candidato f) throws Exception {
        if (contadorFunc == F.length) {
            throw new Exception("Não há espaços disponíveis");
        }
        
        F[contadorFunc] = f;
        contadorFunc++;
    }
    

    public Candidato get(int pos) throws Exception {
        if (pos >= contadorFunc) {
            throw new Exception("Posição inválida");
        }
        return F[pos];
    }

    public void imprimir() {
        for (int i = 0; i < contadorFunc; i++) {
            System.out.println(
                    "O nome é: " + F[i].getNome()
                            + "\nA inscrição é: " + F[i].getInscricao()
                            + "\nA Nota é: " + F[i].getNota());
            System.out.println("-------------------------------------------------");
        }
    }

    public void remove(int inscr) throws Exception {
        boolean tem = false;
        int posInscr = 0;
        for (int i = 0; i < contadorFunc; i++) {
            if (inscr == F[i].getInscricao()) {
                tem = true;
                posInscr = i;
            }
        }

        if (!tem) {
           System.out.println("Inscrição não encontrado!");
        }

        for (int i = posInscr; i < contadorFunc; i++) {
            F[i] = F[i + 1];
        }
        contadorFunc--;
    }
}
