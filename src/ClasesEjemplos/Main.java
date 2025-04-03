package ClasesEjemplos;

public class Main {

	public static void main(String[] args) {
	
		Cajita<String> cajitaString= new Cajita<>();
		cajitaString.setContenido("Hola");
		String letras = cajitaString.getContenido();
		System.out.println("La cajita tiene: "+ letras);
		
		Cajita<Integer> cajitaEnteros= new Cajita<>();
		cajitaEnteros.setContenido(20);
		Integer numeros= cajitaEnteros.getContenido();
		System.out.println("La cajita tiene: "+ numeros);
	}

}
