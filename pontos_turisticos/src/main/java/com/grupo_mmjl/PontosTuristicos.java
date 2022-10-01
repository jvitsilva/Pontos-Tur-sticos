package com.grupo_mmjl;

public abstract class PontosTuristicos {
    private String nome, endereco, dataFundacao, descricao;

    public PontosTuristicos(String nome, String endereco, String dataFundacao, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
