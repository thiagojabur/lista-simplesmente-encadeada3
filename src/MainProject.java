import java.util.Random;

public class MainProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Criando uma lista encadeada");
		SimpleLinkedList listaTeste = new SimpleLinkedList();
		Node no3 = new Node(3);
		listaTeste.addFirst(no3);
		listaTeste.addLast(new Node(4));
		Node noExemplo = new Node(5);
		listaTeste.addLast(noExemplo);
		Node no6 = new Node(6);
		listaTeste.addFirst(no6);
		listaTeste.addAfter(new Node(10), noExemplo); 
		System.out.println("Tamanho da lista: " +listaTeste.getSize());
		System.out.println(listaTeste);
		listaTeste.addBefore(new Node(11), noExemplo );
		int numeroAleatorio;
		Random random = new Random();
		
		for (int i = 1; i <= 3; i++) {
			numeroAleatorio = random.nextInt(100000);
			listaTeste.addLast(new Node(numeroAleatorio));
		}
		System.out.println(listaTeste);
		listaTeste.removeFirst();
		listaTeste.removeLast();
		listaTeste.removeLast();
		System.out.println(listaTeste);
	}

}
