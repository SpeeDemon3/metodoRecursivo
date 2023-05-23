package repasoM03.ejemploPackage;

public class ac1 {

	/**
	 * Antonio Ruiz Benito
	 * @param args
	 */
	public static void main(String[] args) {
		
		recursiva(0);
		
	}
	
	/**
	 * Metodo recursivo que se llama a si mismo
	 * @param cont -> Variable numerica de tipo int
	 */
	public static void recursiva(int cont) {
		// Imprimo el valor de cont
		System.out.println(cont);
		// Sumo 1 al valor de cont
		cont++;
		// Si el valor es menor o igual a 20
		if (cont <= 20) {
			// Invocamos a la funcion pasando por parametro el valor actual de la variable contador
			recursiva(cont); // Se seguira llamando hasta que contador valga 21
			
		}
		
		
	}
	
	
	
}
