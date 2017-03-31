
public class Main {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		
		System.out.println(pila.estaVacia());
		
		pila.apilar(5);
		
		System.out.println(pila.estaVacia());
		
		System.out.println(pila.verTope());
		
		pila.apilar(78);
		
		System.out.println(pila.verTope());
		
		pila.desapilar();
		
		System.out.println(pila.verTope());
	}
}