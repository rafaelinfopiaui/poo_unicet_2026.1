class TesteFuncionario {
    public static void main(String[] args) {
        // Execução
        System.out.println("Execução do teste no sistema: ");
        System.out.println(); // Pula uma linha 

        // Instanciando o primeiro funcionário (f1)
        Funcionario f1 = new Funcionario();
        f1.nome = "Rafael";
        f1.cargo = "Engenheiro de Computação";
        f1.salario = 10000.0;

        // Exibindo o primeiro funcionário
        System.out.printf("Funcionário: %s%n", f1.nome);
        System.out.printf("Cargo: %s%n", f1.cargo);
        System.out.printf("Salário atual: %.2f%n", f1.salario);
        System.out.println(); // Pula uma linha 

        // Instanciando o segundo funcionário (f2)
        Funcionario f2 = new Funcionario();
        f2.nome = "Maria";
        f2.cargo = "Programadora";
        f2.salario = 6000.0;

        // Exibindo o segundo funcionário
        System.out.printf("Funcionário: %s%n", f2.nome);
        System.out.printf("Cargo: %s%n", f2.cargo);
        System.out.printf("Salário atual: %.2f%n", f2.salario);
        System.out.println(); // Pula uma linha 

        // Aumentando o salário do primeiro funcionário
        f1.aumentarSalario(10); // Aumento de 10%
        System.out.printf("Salário de %s após aumento de 10%%: %.2f%n", f1.nome, f1.salario);
        System.out.println(); // Pula uma linha 

        // Aumentando o salário do segundo funcionário
        f2.aumentarSalario(15); // Aumento de 15%
        System.out.printf("Salário de %s após aumento de 15%%: %.2f%n", f2.nome, f2.salario);
    }
}
