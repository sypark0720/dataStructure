package chapter04.Lists;

public class Link<E> {
	
	//field
	private E element;
	private Link<E> next;	//Pointer to next node in list(next는 다음 node 그 자체!)
	
	//Constructors
	public Link(E element, Link<E> next) {
		this.element = element;
		this.next = next;
	}

	public Link(Link<E> next) {
		this.next = next;
	}
	
	
	//methods
	Link<E> next(){
		return next;
	}
	
	Link<E> setNext(Link<E> nextval){
		next = nextval;
		return next;
	}
	
	E element(){
		return element;
	}
	
	E setElement(E elementval){
		return element=elementval;
	}
}
