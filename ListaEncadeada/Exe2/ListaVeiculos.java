public class ListaVeiculos {
    private No cabeca = null;
    private int tamanho = 0;

    public void inserir(Veiculo veiculo) {
        No novo = new No(veiculo, null);

        if (cabeca == null) {
            cabeca = novo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public boolean excluirPorPlaca(String placa) {
        if (cabeca == null) {
            return false;
        }

        if (cabeca.veiculo.getPlaca().equals(placa)) {
            cabeca = cabeca.proximo;
            tamanho--;
            return true;
        }

        No atual = cabeca;
        while (atual.proximo != null && !atual.proximo.veiculo.getPlaca().equals(placa)) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
            tamanho--;
            return true;
        }

        return false;
    }

    public void imprimirTodos() {
        if (cabeca == null) {
            System.out.println("Nenhum veículo cadastrado.");
            return;
        }
    
        No atual = cabeca;
        System.out.println("=== Lista de Veículos ===");
        while (atual != null) {
            System.out.println("Placa: " + atual.veiculo.getPlaca());
            System.out.println("Marca: " + atual.veiculo.getMarca());
            System.out.println("Modelo: " + atual.veiculo.getModelo());
            System.out.println("Valor: R$" + atual.veiculo.getValor());
            System.out.println("----------------------");
            atual = atual.proximo; 
    }
}
    

    public int tamanho() {
        return tamanho;
    }
}
