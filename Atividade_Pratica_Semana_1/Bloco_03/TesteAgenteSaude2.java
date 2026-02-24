import java.util.Scanner;

public class TesteAgenteSaude2 {
    public static void main(String[] args) {
        System.out.println("=== Teste do Agente de Saúde ===");
        System.out.println(); // Pula uma linha

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Cria uma instância de AgenteSaude2
        AgenteSaude2 agente = new AgenteSaude2();

        System.out.println("=== Diagnóstico de Saúde ===");
        System.out.print("Informe a temperatura do paciente: ");

        // Lê a temperatura do paciente
        double temperatura = scanner.nextDouble();

        System.out.print("Resultado: ");
        // Chama o método diagnosticar
        agente.diagnosticar(temperatura);

        scanner.close();
    }
}
