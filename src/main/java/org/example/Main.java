package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Conta cc= new ContaCorrente();
        Conta cp= new ContaPoupanca();

        System.out.println(cc.numero);
        System.out.println(cp.numero);

    }
}