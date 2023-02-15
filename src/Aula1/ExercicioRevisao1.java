package Aula1;
import java.util.Arrays;
import java.util.Random;

/*
 * Elaborar um projeto java que declare um array para armazenar
 * valores aleatorios e reais de simples precisão. Exiba o conteúdo do array.
 */

public class ExercicioRevisao1 {

	/*
	 * Criando um array com 10 posições
	 */	
	static float[] v = new float[50];
	
	/* Criando uma instancia do Random para gerar aleatórios */
	static Random rd = new Random();
	
	/*
	 * Classe static não precisa de um objeto Void inserimos a instrução 
	 * mas não gera retorno
	 */
	public static void inserir() {
		
		/* Criando um laço para gerar números aleatórios */
		for(int i=0; i < v.length; i++) {
		
			v[i] = rd.nextFloat(120);
			
		}
	}
	
	/* Exibindo no console os numeros aleatórios */
	public static void mostrar() {
		
		//n vai pecorrer o vetor v
		/*
		 * for(float n:v) { System.out.println(n); }
		 */
		
		//Usando outro modo de Arrays.toString()
		System.out.println(Arrays.toString(v));
	}
	
}
