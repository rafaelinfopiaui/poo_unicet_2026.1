public class TesteAgenteSaude {
    public static void main(String[] args) {
        System.out.println("=== Teste do Agente de Saúde ===");
        System.out.println(); // Pula uma linha

        // Cria uma instância de AgenteSaude
        AgenteSaude agente = new AgenteSaude();

        // Executa os testes
        System.out.println("Teste 1 (38.0):");
        agente.diagnosticar(38.0);
        System.out.println(); // Pula uma linha

        System.out.println("Teste 2 (34.0):");
        agente.diagnosticar(34.0);
        System.out.println(); // Pula uma linha

        System.out.println("Teste 3 (36.5):");
        agente.diagnosticar(36.5);
        System.out.println(); // Pula uma linha 

        System.out.println("Teste 4 (37.5):");
        agente.diagnosticar(37.5);
        System.out.println(); // Pula uma linha

        System.out.println("Teste 5 (35.0):");
        agente.diagnosticar(35.0);
        System.out.println(); // Pula uma linha
    }
}
