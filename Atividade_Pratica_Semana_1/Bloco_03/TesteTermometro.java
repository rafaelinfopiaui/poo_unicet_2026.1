public class TesteTermometro {
    public static void main(String[] args) {
        System.out.println("=== Teste do Termometro ===");
        System.out.println(); // Pula uma linha

        // Criando um objeto Termometro
        Termometro t = new Termometro();

        // Teste temperatura válida
        System.out.println("Tentando ajustar para 35.0°C...");
        t.ajustarTemperatura(35.0);
        System.out.println("Temperatura atual: " + t.getTemperatura() + "°C");

        // Teste temperatura inválida
        System.out.println("\nTentando ajustar para -150.0°C...");
        t.ajustarTemperatura(-150.0);
        System.out.println("Temperatura atual: " + t.getTemperatura() + "°C");

        // Teste temperatura limite
        System.out.println("\nTentando ajustar para -100.0°C...");
        t.ajustarTemperatura(-100.0);
        System.out.println("Temperatura atual: " + t.getTemperatura() + "°C");
    }
}
