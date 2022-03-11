package com.company;
// Extender Dizer que filha de funcionarioCLT
public class Vendedor extends FuncionarioCLT implements calculaBonificacao {
    private double valorDeBonificacao;
//Esse metodo vem da Interface calculaBonificacao
    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorDeBonificacao = this.valorSalario *(porcentagemBonificacao/100d);

    }
    //Override = sobrescrever
    //Sobrescrevendo o metodo toString de FuncionarioCLT

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                ", valorSalario=" + valorSalario +
                ", valorDeBonificacao=" + valorDeBonificacao +
                '}';
    }
}
