public class Lista<E>{
    private Node<E> inicio,fin;
    private int tamaño;
    public Lista(){
        this.inicio = this.fin = null;
        this.tamaño = 0;
    }
    public boolean isEmty(){
        return (this.inicio==null && this.fin==null);
    }
    public int getTamaño(){
        return tamaño;
    }
    public void agregarAlFinal(E dato){
        
    }
    public void agregarAlInicio(E dato) {

    }

    public Node<E> getInicio(int p) {
        Node<E> aux = this.inicio;
        for (int i = 0; i < p; i++) {
            aux = aux.getNext();
        }
        return aux;
    }

    public Node<E> getAtras(int p) {
        Node<E> aux = this.fin;
        for (int i = this.tamaño - 1; i > p; i--) {
            aux = aux.getPrevious();
        }
        return aux;
    }

    public String toString() {
        String aux = "";
        if (!isEmty()) {
            Node<E> aux2 = this.inicio;
            while (aux2 != null) {
                aux += aux2.getData() + " ";
                aux2 = aux2.getNext();
            }
        }
        return aux;
    }
}
