/**
 * 
 */
package listaexercicio;

/**
 * @author guest01
 *
 */
public class listaArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1- criar array que comporta até 10 inteiros
		//
		int[] numeros = new int [10];
		int i = 0;
		int par = 0;
		
		//2- preencher o array
		numeros[0]= 25;
		numeros[1]= 30;
		numeros[2]= 12;
		numeros[3]= 24;
		numeros[4]= 25;
		numeros[5]= 32;
		numeros[6]= 9;
		numeros[7]= 26;
		numeros[8]= 25;
		numeros[9]= 30;
		
		//3- Mostrar no console os valores pares
		//Percorrer todo o Array
		//	para cada item
		//		Se ele for PAR -> Mostrar na tela
		int totalPares = 0;
		for(int indiceArray = 0 ; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros [indiceArray];
			int restoDivisaoPor2 = numeroAtual % 2;
			
			if(numeroAtual > 0 && restoDivisaoPor2 == 0) {
				totalPares++;
				System.out.println("Numero par encontrado: " + numeroAtual);
			}
		}
		System.out.println("Total de Numeros pares: " + totalPares);
	}

}
