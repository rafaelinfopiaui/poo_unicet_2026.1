public class TesteCarro {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando os carros
        Carro carro1 = new Carro();
        carro1.modelo = "Fiat Uno Way";
        carro1.ano = 2018;

        Carro carro2 = new Carro();
        carro2.modelo = "Mitsubishi ASX";
        carro2.ano = 2019;

        // Exibe os carros
        System.out.println("Carro 1: Modelo " + carro1.modelo + ", Ano " + carro1.ano);
        System.out.println("Carro 2: Modelo " + carro2.modelo + ", Ano " + carro2.ano);
        System.out.println(); // Pula uma linha 
    }
}
