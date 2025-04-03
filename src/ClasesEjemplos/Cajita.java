package ClasesEjemplos;

public class Cajita <T,S,U> {
	
	private T contenido;
	
	public void setContenido(T contenido) {
		this.contenido=contenido;
	}
	
	public T getContenido() {
		return contenido;
	}
}
