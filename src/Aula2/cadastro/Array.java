package Aula2.cadastro;

/**
 * Classe Array
 */
public class Array {

	private static Pessoa[] lista = new Pessoa[3];
	private static int indice = 0;
	
	/**
     * Método para inserir um objeto pessoa
     * @param pessoa
     */
	public static void inserir(Pessoa pessoa) {
		pessoa.setId(indice+1);
		lista[indice++]=pessoa; //Incrementando o indice para adicionar um por vez
	}
	
	/**
     * Mostra o conteudo do array
     */
	public static void mostrar() {
		for(int i=0; i < indice; i++) {
			System.out.println(lista[i]);
		}
	}
}
