package prova1;

class Mouse extends Produto {
	
	String tipo;
	
	public Mouse(String nomeLoja, double preco, String tipo, String descricao)
	{
		super(nomeLoja, preco);
		super.descricao = descricao;
		this.tipo = tipo;
	}
	
	@Override
	String getDescricao() {
		return descricao + " " + tipo;
	}
	
}