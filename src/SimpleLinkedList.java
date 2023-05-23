
public class SimpleLinkedList {
	protected Node head;
    protected Node tail; 
	int size=0;
	
	
	
	public String toString(){
		//for da cabeça até o último nó
		Node elemento = head;
		
		String returnString = "";
		do {
			returnString += elemento.getValue() + ""; 
			returnString += " ";
			elemento = elemento.getNext();
		} while (elemento != null);

		return returnString;
	}
	public int getSize() {
		return size;
	}
	public SimpleLinkedList() {
		super();
	}
	public SimpleLinkedList(Node head, Node tail) {
		this.head = head;
		this.tail = tail;
	}
	void addFirst(Node newNode) {
		if (size == 0) 
			tail = newNode;
		newNode.setNext(head);
		head = newNode;
		size++; 
	}
	void addLast(Node newNode) {
		if (size ==0) 
			head = newNode;
		else 
			tail.setNext(newNode);
		tail = newNode;
		size++;	
	}
	void addAfter(Node newNode, Node n) {
		//inserir após o n
		if (size == 1)
			tail = newNode;
		n.setNext(newNode);
		size++;
		if (n == tail) 
			tail = newNode;
	}
	
	Node getPreviousNode(Node n) {
		//achando o anterior do n
		Node nodeAnterior = head;
		while(nodeAnterior .getNext()!=n ) {
			nodeAnterior = nodeAnterior.getNext();
		}
		return nodeAnterior;
	}
	void addBefore(Node newNode, Node n) {
		//inserir após o n
		if (size == 1)
			head = newNode;
		
		newNode.setNext(n);
		if (n == head) 
			head = newNode;
		else 
		{	
			Node noAnterior = getPreviousNode(n);
			noAnterior.setNext(newNode);
		}	
		
		size++;
		
		if (n == tail) 
			tail = newNode;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void removeFirst() {
		Node elemento = head;
		head = head.getNext();
		elemento.setNext(null);
		size--;
	}
	public void removeLast() {
		Node anterior = getPreviousNode(tail);
		tail = anterior;
		anterior.setNext(null);
		size--;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	public Node getTail() {
		return tail;
	}
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	
}
