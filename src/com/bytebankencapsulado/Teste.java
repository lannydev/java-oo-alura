package com.bytebankencapsulado;

public class Teste {
    public static void main(String[] args) {
        FuncionarioTeste f1 = new FuncionarioTeste();
        f1.setTipo(1);
        f1.setSalario(5000.00);

        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

    }
}
