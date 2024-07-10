package model;

import java.text.DecimalFormat;

public class ContaBancaria {

    protected int numero;
    protected String titular;
    protected double saldo;
    protected double taxaJuros;

    public ContaBancaria(int numero, String titular, double saldo, double taxaJuros) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void exibirInformacoes() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(titular);
        System.out.println(numero);
        System.out.println("Saldo: R$ " + decimalFormat.format(saldo));
        System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
    }

}