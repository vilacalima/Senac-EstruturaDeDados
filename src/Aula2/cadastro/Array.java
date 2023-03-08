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
		if(indice == lista.length) {
			lista = alocarNovoArray(); //Metodo para criar um novo array
		}
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
	
	/**
    * Cria um array novo para suprir o anterior
    */
	private static Pessoa[] alocarNovoArray() {
		
		Pessoa[] novaLista = new Pessoa[lista.length+4];
		System.arraycopy(lista, 0, novaLista, 0, lista.length); //Cria um for pegando a lista e aumentando o valor da nova lista
		
		
		return novaLista;
	}
	
	/**
	* busca um indice do objeto Pessoa
	* @param id
	*/
	public static int buscar(int id) {
		
		int inicio = 0, fim = indice - 1, meio;
		
		while(inicio <= fim) { //Busca binária - Divide o Array no meio para realizar a busca
			
			meio = (fim + inicio) / 2;
			if(id == lista[meio].getId()) { //Busca dentro da lista o id
				return meio;
			} else if(id > lista[meio].getId()) { //Se o id for maior que o meio da lista o valor da lista muda sendo o meio + um
				inicio = meio + 1; 
			} else {
				fim = meio -1; //Se o id for menor que o meio muda o valor do fim
			}
		}
		return -1; //Se não achar retorna um erro
	}
	
	/**
	* Remove um indice do objeto Pessoa
	* @param id
	*/
	public static boolean remover(int id) {
		
		int remover = buscar(id); //Chamada do Método Remover
		
		if(remover != -1) {
			
			for(int i = remover; i < indice-1; i++) { // loop para pegar o indice da busca binária
				lista[i] = lista[i+1]; //Grava no indice posterior
			}
			indice--; //Remove o elemento
			return true; //Dentro do if retorna true caso sucesso
		} 
		return false;
	}
}
