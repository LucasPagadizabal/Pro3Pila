
public class Pila {
	final static int tope = 0;
	Lista lista = new Lista();
	
	public void apilar(int val){
		lista.addNodo(val);
	}
	
	public void desapilar(){
		if(!lista.esVacia()){
			lista.eliminarNodo(tope);
		}
		
	}
	
	public boolean estaVacia(){
		return lista.esVacia();
	}
	
	public Integer verTope(){
		if(!lista.esVacia()){
			return lista.at(tope);
		}
		return null;
	}
	
	
}
