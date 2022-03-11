package com.company;

public class OpradorDeCaixa extends FuncionarioCLT{
    public OpradorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    public OpradorDeCaixa() {
    }



    @Override
    public String toString() {
        return "OpradorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getBairro() +
                '}';
    }
}
