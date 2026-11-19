import java.util.Scanner;

public class Ex10 {

    public static String lerUsuario(Scanner scanner) {
        System.out.print("Usuário: ");
        return scanner.nextLine();
    
    }
    
    public static String lerSenha(Scanner scanner) {
        System.out.print("Senha: ");
        return scanner.nextLine();
    
    }
    
    public static boolean validarLogin(String usuario, String senha) {
    
    return usuario.equals("admin") && senha.equals("123");
 
    }
 
    public static void mostrarResultado(boolean valido) {
        
        if (valido) {
            System.out.println("Login realizado com sucesso.");
        
        } else {
            System.out.println("Usuário ou senha inválidos.");
        
        }
        }
 }

