public class Matrizes {

    private int linhas;
    private int colunas;
    private int[][] elementos;

    public Matrizes(int linhas, int colunas) {
        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException(
                "As dimensoes devem ser positivas."
            );
        }

        this.linhas = linhas;
        this.colunas = colunas;
        elementos = new int[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int getElemento(int linha, int coluna) {
        return elementos[linha][coluna];
    }

    public void setElemento(int linha, int coluna, int valor) {
        elementos[linha][coluna] = valor;
    }

    public boolean Iguais(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (!(objeto instanceof Matrizes)) {
            return false;
        }

         Matrizes outra = (Matrizes) objeto;

         if (linhas != outra.linhas || colunas != outra.colunas) {
            return false;
         }

         for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] != outra.elementos[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

    public int Resultado() {
        int resultado = 1;

        resultado = 31 * resultado + linhas;
        resultado = 31 * resultado + colunas;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado = 31 * resultado + elementos[i][j];
            }
        }

        return resultado;
    }
        
    public Matrizes Transposta() {
        Matrizes resultado = new Matrizes(colunas, linhas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.elementos[j][i] = elementos[i][j];
            }
        }

        return resultado;
    }

    public Matrizes Oposta() {
        Matrizes resultado = new Matrizes(linhas, colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.elementos[i][j] = -elementos[i][j];
            }
        }

        return resultado;
    }

    public Matrizes gerarMatrizNula() {
        return new Matrizes(linhas, colunas);
    }

    public boolean Identidade() {
        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j && elementos[i][j] != 1) {
                    return false;
                }
        if (i != j && elementos[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean Diagonal() {
        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i != j && elementos[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean Singular() {
        if (!Diagonal()) {
            return false;
        }

        int valorDiagonal = elementos[0][0];

        for (int i = 1; i < linhas; i++) {
            if (elementos[i][i] != valorDiagonal) {
                return false;
            }
        }

        return true;
    }

    public boolean Simetrica() {
        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] != elementos[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean AntiSimetrica() {
        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (elementos[i][j] != -elementos[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public void adicionar(Matrizes outra) {
        if (linhas != outra.linhas || colunas != outra.colunas) {
            throw new IllegalArgumentException(
                "As matrizes devem ter as mesmas dimensoes."
            );
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] += outra.elementos[i][j];
            }
        }
    }

    public void subtrair(Matrizes outra) {
        if (linhas != outra.linhas || colunas != outra.colunas) {
            throw new IllegalArgumentException(
                "As matrizes devem ter as mesmas dimensoes."
            );
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] -= outra.elementos[i][j];
            }
        }
    }

    public void multiplicar(Matrizes outra) {
        if (colunas != outra.linhas) {
            throw new IllegalArgumentException( "O numero de colunas da primeira matriz deve ser "
                + "igual ao numero de linhas da segunda."
            );
        }

       Matrizes resultado = new Matrizes(linhas, outra.colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                for (int k = 0; k < colunas; k++) {
                    resultado.elementos[i][j] +=
                        elementos[i][k] * outra.elementos[k][j];
                }
            }
        } 

        linhas = resultado.linhas;
        colunas = resultado.colunas;
        elementos = resultado.elementos;
    }

    public Matrizes copiar() {
        Matrizes copia = new Matrizes(linhas, colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                copia.elementos[i][j] = elementos[i][j];
            }
        }

        return copia;
    }

    public void mostrar() {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(elementos[i][j] + "\t");
            }

            System.out.println();
        }
    }

}

