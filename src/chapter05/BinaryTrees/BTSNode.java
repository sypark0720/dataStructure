package chapter05.BinaryTrees;

public class BTSNode<Key, E> implements BinNode<E> {
	
	//field
	private Key key; //key for this node
	private E element;	
	private BTSNode<Key, E> left;	//pointer to left child
	private BTSNode<Key, E> right;  //pointer to right child
	
	//Constructors
	public BTSNode(){
		left = right = null;
	}
	
	
	public BTSNode(Key key, E element) {
		this.key = key;
		this.element = element;
		left = right = null;
	}
	
	public BTSNode(Key key, E element, BTSNode<Key, E> left, BTSNode<Key, E> right) {
		this.key = key;
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	//methods	
	public Key key(){return key;}
	public void setKey(Key k){this.key = k; return;}
	
	
	@Override
	public E element() { return element;}
	@Override
	public void setElement(E v) { this.element = v;	return;}
	
	
	@Override
	public BinNode<E> left() { return this.left; }
	public void setLeft(BTSNode<Key, E> v) { this.left = v;	return;}
	
	@Override
	public BinNode<E> right() {return this.right();	}
	public void setRight(BTSNode<Key, E> v) { this.right = v;	return;}
	
	@Override
	public boolean isLeaf() {
		return (left == null)&&(right == null); 
	}
}
