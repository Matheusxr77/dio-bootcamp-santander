package model;

public class ContaBancaria {
    
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito feito.");
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque feito.");
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

}