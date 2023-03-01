package Aula2.cadastro;

/**
 * Classe Pessoa
 */
public class Pessoa {

	/**
     * Atributos
     */
	private String nome;
	private int idade;
	private int id;
	
	/**
     * Construtor do Objeto Pessoa
     */
	public Pessoa() {
		
	}
	
	/**
     * Construtor do Objeto Pessoa
     * @param nome
     * @param idade
     */
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	/**
     * Get e Set
     */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/**
     * Método para retornar o atributo como string
     */
	@Override
	public String toString() {
		return "Nome: " + nome + " Idade: " + idade + " ID: " + id; 
	}
}
