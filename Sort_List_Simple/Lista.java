package LabEDA_lab04.Sort_List_Simple;
public class Lista<E>{
	
	private Node<E> raiz;
	private int tamaño;
	public Lista() {
		this.raiz = null;
	}
	public void insert(E x) {
		if(isEmpty())
			this.raiz = new Node<E>(x, this.raiz);
		else {
			Node<E>aux = this.raiz;
			for(;aux.getNextNode() !=null; aux = aux.getNextNode());
			aux.setNextNode(new Node<E>(x));
		}
		tamaño++;
	}
	public boolean isEmpty() {
		if(raiz==null)
			return true;
		return false;
	}
	
	public int size() {
		return tamaño;
	}
	public Node<E> get(int indice) {
	    Node<E> aux=raiz;
	    for(int i=0;i<indice;i++)
	        aux=aux.getNextNode();
	    return aux;
	}
	public void remove(int indice) {
	    if(indice<tamaño) {
	        if(indice==0)
	            raiz=raiz.getNextNode();
	        else {
	            Node<E> anterior=this.get(indice-1);
	            anterior.setNextNode(this.get(indice+1));
	        }
	        tamaño--;
	    }
	}
}