public class Conta2 {
    // Atributos privados
    private Integer numero;
    private Double saldo = 0.0;

    // Métodos públicos
    public Integer getNumero() {
        return this.numero;
    }

    // Método para definir o número da conta
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    // Método para depositar valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para obter o saldo da conta
    public Double getSaldo() {
        return this.saldo;
    }
}
