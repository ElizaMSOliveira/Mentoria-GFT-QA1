package com.company;
//Abastract so vai servir como herança e não posso da new
//Ela ira servir de Herança para criar as outras classes de funcionarios
public abstract class FuncionarioCLT {
    //Protect para que as classes filhas tenham acesso
    protected String nome;
    protected String documento;
    protected double valorSalario;
    //Composição. estou compondo a classe FuncionarioCLT a partir da classe endreço;
    protected Endereco endereco;

    public double getValorSalario() {
        return valorSalario;
    }
    public void setValorSalario(double valorSalario) {
        this.valorSalario = valorSalario;
    }
    public FuncionarioCLT(String nome, String documento,double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.valorSalario = valorSalario;
        this.endereco = endereco;
    }
    public FuncionarioCLT() {
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario='" + valorSalario + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
