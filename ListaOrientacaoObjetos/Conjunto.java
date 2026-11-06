public class Conjunto {

    private String[] elementos;
    private int quantidade;

    public Conjunto() {
        elementos = new String[2];
        quantidade = 0;
    }

    
    public boolean pertence(String elemento) {
        for (int i = 0; i < quantidade; i++) {
            if (elementos[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }

    
    public boolean adicionar(String elemento) {

        if (pertence(elemento)) {
            return false;
        }

    
        if (quantidade == elementos.length) {
            String[] novoArray = new String[elementos.length * 2];

            for (int i = 0; i < quantidade; i++) {
                novoArray[i] = elementos[i];
            }

            elementos = novoArray;
        }

        elementos[quantidade] = elemento;
        quantidade++;

        return true;
    }

    
    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < quantidade; i++) {
            resultado.adicionar(elementos[i]);
        }

        for (int i = 0; i < outro.quantidade; i++) {
            resultado.adicionar(outro.elementos[i]);
        }

        return resultado;
    }

    
    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < quantidade; i++) {
            if (outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }

        return resultado;
    }

    // Retorna os elementos deste conjunto que nao estao no outro
    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < quantidade; i++) {
            if (!outro.pertence(elementos[i])) {
                resultado.adicionar(elementos[i]);
            }
        }

        return resultado;
    }

    // Mostra os elementos do conjunto
    public void mostrar() {
        System.out.print("{");

        for (int i = 0; i < quantidade; i++) {
            System.out.print(elementos[i]);

            if (i < quantidade - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}