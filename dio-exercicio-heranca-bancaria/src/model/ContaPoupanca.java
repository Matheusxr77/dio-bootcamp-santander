package model;

import java.text.DecimalFormat;

public class ContaPoupanca {

    private int numeroConta;
    private String titular;
    private double saldo;
    private double taxaJuros;

    public ContaPoupanca(int numeroConta, String titular, double saldo, double taxaJuros) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numeroConta);
        System.out.println("Saldo: R$ " + df.format(saldo));
        System.out.println("Taxa de juros: " + df.format(taxaJuros) + "%");
    }
    
}