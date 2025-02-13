import java.util.ArrayList;
import java.util.Iterator;

public class HashTale {
    public static int M = 17;
    private ArrayList<Times>[] tabela;
    @SuppressWarnings("unchecked")
    public HashTale(){
        tabela = (ArrayList<Times>[]) new ArrayList[M];
    }

    public int hash(String chave){
        int h = 0;
        for (int i = 0; i < chave.length(); i++) {
            h = (31 * h + chave.charAt(i)) % M;
        }
        return h;
    }

    public void put(Times time){
        int hash = hash(time.getCodigo());
        ArrayList<Times> times = tabela[hash];
        if(times == null){
            times = new ArrayList<Times>();
            times.add(time);
            tabela[hash] = times;
        }else{
           boolean achei = false;
           for (Times t : times) {
                if(t.getCodigo().equals(t.getCodigo())){
                    achei = true;
                    break;
                }
           }
           if(achei != true){
            times.add(time);
           }
        }
    }

    public Times get(String chave){
        int hash = hash(chave);
        ArrayList<Times> times = tabela[hash];
        if(times == null){
            return null;
        }else{
            for (Times time : times) {
                if(time.getCodigo().equals(chave)){
                    return time;
                }
            }
        }
        return null; 
    }

    public Times remove(String chave){
        int hash = hash(chave);
        ArrayList<Times> times = tabela[hash];

        if(times == null){
            return null;
        }else{
            // for (Times time : times) {
            //     if (time.getCodigo().equals(chave)) {
            //         time = null;
            //     }
            // }
            Iterator<Times> it = times.iterator();
            Times atual = null;

            while (it.hasNext()) {
                atual = it.next();
                if(atual.getCodigo().equals(chave)){
                    it.remove();
                    return atual;
                }
            }
        }
        return null;
    }

    public void status(){
        for (int i = 0; i < tabela.length; i++) {
            if(tabela[i]!= null){
                ArrayList<Times> ts = tabela[i];
                System.out.println("Linha " + i + ": " + "Tem " + ts.size() + " Times" );
            }else{
                System.out.println("Essa linha está vazia.");
            }
        }
    }


}
