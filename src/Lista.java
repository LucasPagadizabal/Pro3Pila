public class Lista {

	Nodo first;
	int contador;

	public Lista() {
		first = null;
		contador = 0;
	}

	public void addNodo(int s) {// inserta un Nodo al principio-- el ult Nodo
		// tiene el next null
		Nodo tmp = new Nodo(s);
		tmp.setNext(first);
		first = tmp;
		contador++;
	}

	public void eliminarNodo(int i) {// elimina por posicion
		int auxContador = 0;
		if (i == 0) {// si quiero eliminar el primero
			first = first.getNext();

		}			
		Nodo aux = first;
		while (auxContador < this.size()){//recorro hasta llegar al nodo que quiero borrar
			if (auxContador == i-1){					
				aux = aux.getNext();
				if (aux.getNext() != null) {//preg si tengo un nodo sig para borrar
					aux.setNext(aux.getNext().getNext());
					this.contador--;//al borrar la referencia descuento el contador de la lista
				}
			}
			auxContador++;
		}

	}

	public int at(int i){//al darme una posicion devuelvo el dato
		int cont = 0;
		Nodo aux = first;
		while(i<this.size()){
			if(cont == i){
				return aux.getInfo();
			}else{
				aux = aux.getNext();
				cont++;
			}
		}
		return -1;
	}

	public boolean esVacia() {
		return (first == null);
	}

	public int size() {
		return contador;
	}

	public int numeroMax(){
		int max = first.getInfo();
		int pos = 0;
		Nodo aux = first;
		for (int i = 0; i < this.size(); i++) {
			if(aux.getNext() != null){
				if(max < aux.getNext().getInfo()){
					max = aux.getNext().getInfo();
					pos = i;
				}
			}
		}
		return max;
	}

	public boolean buscarIguales(int elem){

		Nodo cursor = first;

		while(cursor != null){
			if(cursor.getInfo() == elem){
				return true;
			}
			cursor = cursor.getNext();
		}
		return false;
	}

	public void addNodoOrde(int info){
		if (this.esVacia() || first.getInfo() > info){//chequeo si la lista no esta vacia o si la info va al principio
			this.addNodo(info);
		}else{
			Nodo puntero = first;
			
			if(puntero.getNext() == null){//chequea que el sig de primero no sea null
				
				if(puntero.getInfo()< info){				
					puntero.setNext(new Nodo(info));
				}else{
					this.addNodo(info);
				}
			}else{
				
				while(puntero.getNext()!=null && info > puntero.getNext().getInfo()){//busca donde va el nuevo nodo
					
					puntero = puntero.getNext();
				}
				Nodo nuevo = new Nodo(info);
				nuevo.setNext(puntero.getNext());
				puntero.setNext(nuevo);
			}
			
			contador++;
		}	
		
	}
	
	
}
