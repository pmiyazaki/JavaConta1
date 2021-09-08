package Dados;

public class Conta {
    private String numeroDaConta;
    private double saldo;
    private Cliente titular;

    public Conta(){
        this.setNumeroDaConta("");
        this.setSaldo(0);
        this.setTitular(null);

    }

    public Conta(String numero, Cliente titular){
        this.setNumeroDaConta(numero);
        this.setSaldo(50);
        this.setTitular(titular);
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Valor a depositar: " + valor);
            this.setSaldo(getSaldo() + valor);
            System.out.println("Novo saldo: " + getSaldo());
        } else {
            System.out.println("Não é possível depositar um valor negativo");
        }
    }

    public void sacar(double valor) {
        if (valor>0 && getSaldo() >= valor) {
            System.out.println("Saldo atual: " + getSaldo());
            System.out.println("Valor a sacar: " + valor);
            this.setSaldo(getSaldo() - valor);
            System.out.println("Novo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Operação cancelada!");

        }
    }
}
