package prova1;

class Produto {
	
	String nomeLoja, descricao;
	double preco;
	
	public Produto(String nomeLoja, double preco)
	{
		setPreco(preco);
		setNomeLoja(nomeLoja);
	}
	
	void setPreco(double preco) {this.preco = preco;}
	void setNomeLoja(String nomeLoja) {this.nomeLoja = nomeLoja;}
	
	double getPreco() {return preco;}
	String getNomeLoja() {return nomeLoja;}
	String getDescricao() {return "Produto de informática";}
}