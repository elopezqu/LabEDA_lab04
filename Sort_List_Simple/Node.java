package LabEDA_lab04.Sort_List_Simple;
public class Node<E> {
	private E data;
	private Node<E> next;
	
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
	public Node(E data) {
		this(data, null);
	}
	public E getData() {
		return this.data;
	}
	public void setData (E data) {
		this.data = data;
	}
	public Node<E> getNextNode() {
		return this.next;
	}
	public void setNextNode(Node<E> next) {
		this.next = next;
	}
	public String toString() {
		return this.data.toString();
	}
	
}