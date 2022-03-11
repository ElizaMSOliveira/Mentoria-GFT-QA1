package com.company;

public class Gerente extends FuncionarioPJ implements calculaBonificacao {
    private double valorBonificacao;

    @Override
    public void calculaBonificacao(double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d ;

    }
    //Sobrescrevendo o toStrig usado uma gambiarra

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getComplemento() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
}
