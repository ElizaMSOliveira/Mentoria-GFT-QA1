package com.company;

public class Main {

    public static void main(String[] args) {
        //instanciar - Dar vida!
        //Criando com construtor vazio
        /*Endereco endereco =new Endereco();
        endereco.setRua("A minha rua");
        System.out.println(endereco.getRua());*/

        //Criando com construtor que tem parametros
        Endereco endereco = new Endereco("Rua Itapoá","239 casa 04", "Nossa Senhora do Ó");
        System.out.println("Acesso só a Memoria: "+ endereco);
        System.out.println("Acesso qualquer atributo atravez do get: "+ endereco.getRua());
        System.out.println("Acesso Total apos sobrescrever o metoro ToString na classe Endereço");
        System.out.println(endereco);
        System.out.println("*__________*");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Eliza Oliveira");
        vendedor.setDocumento("206.954.952-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("*__________*");

        OpradorDeCaixa operador = new OpradorDeCaixa("Maria do Carmo","56.847.963-01", 500,endereco);
        System.out.println(operador);
        System.out.println("*__________*");
//Criei mesmo a classe genrente sem ter o metodos construtor porque por defull ja vem
        Gerente gerente = new Gerente();
        gerente.setNome("Jael Maurino");
        gerente.setDocumento("25484-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        //Chamando o metodo
        gerente.calculaReuneacao();
        //gerente.setValorRemuneracao(25);
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);










    }
}
