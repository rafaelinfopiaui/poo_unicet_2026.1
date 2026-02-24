public class TesteCelular {
    public static void main(String[] args) {
        // 1. Instanciação: Criando o objeto na memória RAM usando 'new'
        Celular meuaparelho = new Celular();
        
        // 2. Atribuições: Definindo o estado do objeto
        meuaparelho.marca = "Samsung";
        meuaparelho.bateria = 85;

        //3. Execução: Enviando uma mensagem ao objeto (chamando o metodo)
        System.out.println("Iniciando o teste no sistema: ");
        meuaparelho.mostrarStatus();
    }
}
