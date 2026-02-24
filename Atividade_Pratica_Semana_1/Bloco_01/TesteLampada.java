public class TesteLampada {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando a lampada
        Lampada lampada = new Lampada();

        // Exibe estado inicial da lampada
        System.out.println("Estado inicial da lampada: " + (lampada.isEstaLigada() ? "ligada" : "desligada"));
        System.out.println(); // Pula uma linha 

        // Liga a lampada
        System.out.println("Ligando a lampada...");
        lampada.ligar();
        System.out.println("Estado da lampada: " + (lampada.isEstaLigada() ? "ligada" : "desligada"));
        System.out.println(); // Pula uma linha 

        // Desliga a lampada
        System.out.println("Desligando a lampada...");
        lampada.desligar();
        System.out.println("Estado da lampada: " + (lampada.isEstaLigada() ? "ligada" : "desligada"));
        System.out.println(); // Pula uma linha 

        // Exibe estado final da lampada
        System.out.println("Estado final da lampada: " + (lampada.isEstaLigada() ? "ligada" : "desligada"));
    }
}
