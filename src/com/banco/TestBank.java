package com.banco;

public class TestBank {

    public static void main(String[] args) {

        Account contaElaine = new Account(1425, 73338);
        //contaElaine.setAgencia(1425);
        //contaElaine.setNumero(1073338);

        Client elaineCruz = new Client();
        elaineCruz.setName("Elaine Cruz");
        elaineCruz.setCpf("123.456.789-10");
        elaineCruz.setWork("Systems Analyst");


        contaElaine.setTitular(elaineCruz);
        //contaElaine.saldo = 300.00; - O saldo não deve ser setado, ele só poderá ser manuseado através dos métodos de depositar, sacar e transferir.

        contaElaine.deposita(1500.75);
        System.out.println("Novo saldo da conta é: " + contaElaine.getSaldo());

        //essa linha representa composição de Objetos.
        System.out.println("O titular da conta é: " + contaElaine.getTitular().getName());




    }
}
