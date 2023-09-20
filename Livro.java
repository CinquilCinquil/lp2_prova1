package prova1;

class Livro extends Produto {
	
	String autor;
	
	public Livro(String nomeLoja, double preco, String autor, String descricao)
	{
		super(nomeLoja, preco);
		super.descricao = descricao;
		this.autor = autor;
	}
	
	String getDescricao() {return descricao + " " + autor;}
	
}