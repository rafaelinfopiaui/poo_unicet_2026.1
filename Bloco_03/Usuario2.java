public class Usuario2 {
    // Atributos para armazenar o login e a senha
    String login;
    String senha;

    // Mantendo o metodo para consistencia, embora a validacao
    // granular seja feita no TesteUsuario
    public boolean verificarAcesso(
        String loginDigitado, String senhaDigitada
    ) {
        return login.equals(loginDigitado) && senha.equals(senhaDigitada);
    }
}
