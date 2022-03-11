package com.company;

public class Endereco {
//So são acessados Nessa classe estão Encapsulados. Serão acessador por metodos acessores os Getts e Settres
    private String rua;
    private String complemento;
    private String bairro;
    //constutor
    public Endereco(String rua, String complemento, String bairro) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
    }
    //Construtor Vazio
    public Endereco() {

    }
//Criação do Gets e Sets
//Chamo o metodo rua atraves do get me retorna uma String que é essa da classe
    public String getRua() {
        return rua;
    }
//Atravez dele eu acesso essa classe e ele é quem chama o metodo rua. Não retorna nada e apartir dele aacesso o rua
    public void setRua(String rua) {
// this é a rua dessa clsse que recebe um String rua que é passado por parametro
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    //sobresceve o metodo toString para acessar os dados sem ser por get
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
