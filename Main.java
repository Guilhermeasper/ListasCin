package com.company;

import java.util.Scanner;

class Conta {
    private String numero;
    private double saldo;
    public Conta(String numeroInicial){
        numero = numeroInicial;
        saldo = 0.0;
    }
    public void creditar(double valor){
        saldo = saldo + valor;
    }
    public void debitar(double valor){
        saldo = saldo - valor;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}


class ContaEspecial extends Conta {
    private double bonus;

    public ContaEspecial(String numero){
        super(numero);
    }
    public void creditar(double valor){
        super.creditar(valor);
        bonus += valor * 0.01;
    }
    public double getBonus() {
        return bonus;
    }
}

class Poupanca extends Conta {
    public Poupanca(String numeroInicial) {
        super(numeroInicial);
    }
}

class Banco {
    private Conta[] contas;
    private int indice;
    private double taxa = 0.01;
    public Banco(){
        indice = 0;
    }
    public void cadastrarConta(Conta c){
        contas[indice] = c;
        indice = indice + 1;
    }
    public void renderJuros(String numero){
        double juros = contas[numero].getSaldo()*taxa;
        contas[numero].creditar(juros);
    }
    public void renderBonus(String numero){
        double bonus = procurarConta(numero).getSaldo()*taxa;
        procurarConta(numero).creditar(bonus);
    }
    private Conta procurarConta(String numero) {
        int i = 0;
        boolean achou = false;
        Conta resposta = null;
        while ((!achou) && (i < indice)) {
            if (contas[i].getNumero().equals(numero)) {
                achou = true;
                resposta = contas[i];
            } else {
                i = i + 1;
            }
        }
        if (!achou)
            throw new RuntimeException("Não achou");
        return resposta;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
    }
}
