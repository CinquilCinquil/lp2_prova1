package prova1;

class Produto {
	
	String nomeLoja, descricao = "Produto de informática";
	double preco;
	
	public Produto(String nomeLoja, double preco, String descricao)
	{
		setPreco(preco);
		setNomeLoja(nomeLoja);
		this.descricao = descricao;
	}
	
	void setPreco(double preco) {
		this.preco = preco;
	}
	void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	double getPreco() {
		return preco;
	}
	String getNomeLoja() {
		return nomeLoja;
	}
	String getDescricao() {
		return descricao;
	}
}