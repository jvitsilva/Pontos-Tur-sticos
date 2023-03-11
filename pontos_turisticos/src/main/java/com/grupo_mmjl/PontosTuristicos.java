package com.grupo_mmjl;

public abstract class PontosTuristicos {

	private String nome, endereco, dataFundacao, descricao;

    public PontosTuristicos(String nome, String endereco, String dataFundacao, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.descricao = descricao;
    }

    @Override
	public String toString() {
		return "\nNOME: " + nome + "\nLOCALIZAÇÃO: " + endereco + "\nFUNDAÇÃO: " + dataFundacao + "\nDESCRIÇÃO: " + descricao;
	}

    // teste unitários
	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public String getDescricao() {
		return descricao;
	}

    
}
