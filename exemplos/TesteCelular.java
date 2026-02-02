public class TesteCelular {
    public static void main(String[] args) {
        // Instanciação
        Celular meuaparelho = new Celular();
        
        // Atribuições
        meuaparelho.marca = "Samsung";
        meuaparelho.bateria = 85;

        //Execução
        System.out.println("Iniciando o teste no sistema: ");
        meuaparelho.mostrarStatus();
    }
}
