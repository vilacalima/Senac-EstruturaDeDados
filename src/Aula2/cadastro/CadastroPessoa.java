package Aula2.cadastro;

public class CadastroPessoa {
	
	public static void main(String[] args) {
		
		/**
	     * Instânciando o objeto da classe Pessoa
	     */		
		Array.inserir(new Pessoa("Robson Teste 1", 25)); // Como o array está static não preciso criar um objeto do Array para instânciar a classe
		Array.inserir(new Pessoa("Robson Teste 2", 26));
		
		Array.mostrar(); //Mostrar na tela o Array
	}
}
