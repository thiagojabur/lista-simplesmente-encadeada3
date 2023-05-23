
public class Node {
	int value;
	Node next;
	
	@Override
	public String toString() {
		return value + "";
	}
	public Node(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	

}
