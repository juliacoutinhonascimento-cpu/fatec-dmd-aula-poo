public class Ex7 {

    public static void mostrarNumeros() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
    
        }
    }

    public static void mostrarPares() {
        for (int i = 1; i <= 100; i++) {
            
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
    }

    public static void mostrarImpares() {
        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
 
            }

        }
    }
 }


