public class AgenteSaude2 {
    // Método para diagnosticar a temperatura
    public void diagnosticar(double temperatura) {
        if (temperatura > 37.5) {
            System.out.println("Febre");
        } else if (temperatura < 35.0) {
            System.out.println("Hipotermia");
        } else {
            System.out.println("Saudável");
        }
    }
}
