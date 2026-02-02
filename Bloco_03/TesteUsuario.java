public class TesteUsuario {
    public static void main(String[] args) {
        System.out.println("=== Teste do Usuario ===");
        System.out.println(); // Pula uma linha

        // Criando instância de Usuario
        Usuario u = new Usuario();
        u.login = "admin";
        u.senha = "123456";
        System.out.println("Login: " + u.login);
        System.out.println("Senha: " + u.senha);
        System.out.println(); // Pula uma linha

        // Teste 1: Credenciais corretas
        System.out.println("Tentativa de login: admin / 123456");
        if (u.verificarAcesso("admin", "123456")) {
            System.out.println("Resultado: Acesso permitido!");
        } else {
            System.out.println("Resultado: Acesso negado!");
        }

        System.out.println("-----------------------------");

        // Teste 2: Senha incorreta
        System.out.println("Tentativa de login: admin / 0000");
        if (u.verificarAcesso("admin", "0000")) {
            System.out.println("Resultado: Acesso permitido!");
        } else {
            System.out.println("Resultado: Acesso negado!");
        }

        System.out.println("-----------------------------");

        // Teste 3: Login incorreto
        System.out.println("Tentativa de login: usuario / 123456");
        if (u.verificarAcesso("usuario", "123456")) {
            System.out.println("Resultado: Acesso permitido!");
        } else {
            System.out.println("Resultado: Acesso negado!");
        }
    }
}
