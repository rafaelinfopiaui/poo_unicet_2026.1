class TestePaciente {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando o primeiro paciente (p1)
        Paciente p1 = new Paciente();
        p1.peso = 70.0;
        p1.altura = 1.75;

        // Exibindo o primeiro paciente
        System.out.printf("Paciente com peso %.2f kg e altura %.2f m%n", p1.peso, p1.altura);
        System.out.printf("IMC Calculado: %.2f%n", p1.calcularIMC());
        System.out.println(); // Pula uma linha 

        // Instanciando o segundo paciente (p2)
        Paciente p2 = new Paciente();
        p2.peso = 130.0;
        p2.altura = 1.80;

        // Exibindo o segundo paciente
        System.out.printf("Paciente com peso %.2f kg e altura %.2f m%n", p2.peso, p2.altura);
        System.out.printf("IMC Calculado: %.2f%n", p2.calcularIMC());
    }
}
