import java.util.Scanner;

public class TesteUsuario2 {
    public static void main(String[] args) {
        System.out.println("=== Teste do Usuario2 ===");
        System.out.println(); // Pula uma linha
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância de Usuario2
        Usuario2 u = new Usuario2();

        // Define as credenciais corretas
        u.login = "admin";
        u.senha = "123456";

        System.out.println("=== Sistema de Login ===");

        System.out.print("Digite o usuário: ");
        String loginInput = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaInput = scanner.nextLine();

        // Validação granular
        if (u.login.equals(loginInput)) {
            if (u.senha.equals(senhaInput)) {
                System.out.println("Acesso permitido!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Usuário(a) incorreto(a)!");
        }

        scanner.close();
    }
}
