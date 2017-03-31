
public class Nodo{

	int info;
	Nodo next;

	public Nodo(){
		next = null;
	}

	public Nodo(int s){
		next = null;
		info = s;
	}

	public Nodo(Nodo n, int _info) {
		next = n;
		info = _info;
	}

	public void setInfo(int _info){
		info=_info;
	}

	public int getInfo(){
		return info;
	}

	public Nodo getNext(){
		return next;
	}

	public void setNext(Nodo n){
		next = n;
	}

}
