public class MainMatriz {

    public static void main(String[] args) {

        Matrizes a = new Matrizes(2, 2);
        Matrizes b = new Matrizes(2, 2);

        a.setElemento(0, 0, 1);
        a.setElemento(0, 1, 2);
        a.setElemento(1, 0, 3);
        a.setElemento(1, 1, 4);

        b.setElemento(0, 0, 5);
        b.setElemento(0, 1, 6);
        b.setElemento(1, 0, 7);
        b.setElemento(1, 1, 8);

        System.out.println("Matriz A:");
        a.mostrar();

        System.out.println("\nTransposta de A:");
        a.Transposta().mostrar();

        System.out.println("\nOposta de A:");
        a.Oposta().mostrar();

        System.out.println("\nMatriz nula:");
        a.gerarMatrizNula().mostrar();

        System.out.println("\nSoma de A com B:");
        Matrizes soma = new Matrizes(2, 2);
        soma.setElemento(0, 0, 1 + 5);
        soma.setElemento(0, 1, 2 + 6);
        soma.setElemento(1, 0, 3 + 7);
        soma.setElemento(1, 1, 4 + 8);
        soma.mostrar();

        System.out.println("\nSubtracao de A por B:");
        Matrizes subtracao = a.copiar();
        subtracao.subtrair(b);
        subtracao.mostrar();

        System.out.println("\nMultiplicacao de A por B:");
        Matrizes multiplicacao = a.copiar();
        multiplicacao.multiplicar(b);
        multiplicacao.mostrar();

        System.out.println("\nA e igual a B? " + a.equals(b));
        System.out.println("A e identidade? " + a.Identidade());
        System.out.println("A e diagonal? " + a.Diagonal());
        System.out.println("A e singular? " + a.Singular());
        System.out.println("A e simetrica? " + a.Simetrica());
        System.out.println("A e anti-simetrica? " + a.AntiSimetrica());

        System.out.println("\nCopia de A:");
        Matrizes copia = a.copiar();
        copia.mostrar();
    }

}
