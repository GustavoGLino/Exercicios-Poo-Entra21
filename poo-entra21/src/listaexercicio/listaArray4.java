/**
 * 
 */
package listaexercicio;

/**
 * @author guest01
 *
 */
public class listaArray4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numeros = new int[10];
		numeros[0] = 1;
		numeros[1] = 13;
		numeros[2] = 15;
		
		int mediaAritmeticaImpares = 0;
		int somaImpares = 0 ;
		int totalImpares = 0;
		for(int indiceArray = 0; indiceArray < numeros.length; indiceArray++) {
			int numeroAtual = numeros[indiceArray];
			int restoDivisaoPor2 = numeroAtual % 2;
			
			if(restoDivisaoPor2 == 1) {
				somaImpares = somaImpares + numeroAtual;
				totalImpares++;
					
			}
		}
			
		mediaAritmeticaImpares = (somaImpares / totalImpares);
		
		System.out.println("Media aritmética dos impares: " + mediaAritmeticaImpares);

	}

}
