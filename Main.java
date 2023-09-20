package prova1;

import java.util.ArrayList;

class Main {
	
	static ArrayList<Produto> carrinho = new ArrayList<Produto>();
	
	public static void main(String args[])
	{	
		carrinho.add(new Livro("Como fazer paçoca", 20, "Bob", "3 simples passos"));
		carrinho.add(new Livro("Como desfazer paçoca", 40, "Bo", "1 simples passo"));
		carrinho.add(new Livro("Jardinagem", 64, "Jão", "Tudo sobre Jardinagem"));
		
		carrinho.add(new Mouse("mouse1", 128, "tipo 1", "Mega Mouse Legal"));
		carrinho.add(new Mouse("mouse2", 25.6, "tipo 2", "Mouse com o melhor preço"));
		carrinho.add(new Mouse("mouse3", 51.2, "tipo 3", "Não compre esse mouse"));
		
		for (int i = 0;i < carrinho.size();i ++)
		{
			System.out.println(carrinho.get(i).getDescricao());
		}
		
	}
	
}