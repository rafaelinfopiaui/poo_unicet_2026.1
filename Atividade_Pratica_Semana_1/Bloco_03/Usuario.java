public class Usuario {
    // Atributos para armazenar o login e a senha
    String login;
    String senha;

    // Método para verificar se o login e a senha digitados
    // correspondem aos atributos do objeto
    public boolean verificarAcesso(
        String loginDigitado, String senhaDigitada
    ) {
        // Strings em Java devem ser comparadas com .equals()
        return login.equals(loginDigitado) && senha.equals(senhaDigitada);
    }
}
