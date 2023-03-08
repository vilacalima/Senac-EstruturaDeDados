package Aula2.cadastro;

public class CadastroPessoa {
	
	public static void main(String[] args) {
		
		/**
	     * Instânciando o objeto da classe Pessoa
	     */		
		Array.inserir(new Pessoa("Robson Teste 1", 25)); // Como o array está static não preciso criar um objeto do Array para instânciar a classe
		Array.inserir(new Pessoa("Robson Teste Remover", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		Array.inserir(new Pessoa("Robson Teste 3", 27));
		Array.inserir(new Pessoa("Robson Teste 4", 28));
		
		
		Array.mostrar(); //Mostrar na tela o Array
		
		System.out.println("*** Remoção ***");
		int id=2;
		Array.remover(id);
				
		Array.mostrar(); 
	}
}
