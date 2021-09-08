package Principal;

import Dados.Conta;
import Dados.Cliente;

public class Main {

    public static void main(String[] args) {

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Eric");
        novoCliente.setSobrenome("Tomson");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Alison");
        cliente2.setSobrenome("Teacher");

        Conta novaConta = new Conta();
        novaConta.depositar(100);
        novaConta.sacar(200);

        Conta contaPlus = new Conta("1234", novoCliente);
        contaPlus.depositar(800);
        contaPlus.sacar(200);

    }
}

