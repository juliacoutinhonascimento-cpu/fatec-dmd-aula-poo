
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        boolean acessoPermitido = false;

        for (int tentativa = 1; tentativa <= 3 && !acessoPermitido; tentativa++) {
            System.out.print("Usuário: ");
            String usuario = scan.nextLine();
            System.out.print("Senha: ");
            String senha = scan.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido.");

            } else {
                System.out.println("Usuário ou senha incorretos.");
            }
        }

        if (!acessoPermitido) {
            System.out.println("Acesso bloqueado.");
        }

        scan.close();
    }
}

