
public class NodeList {
	//declaracao do incio e fim da lista
	Node head = null;
	Node tail = null;
	
	//declaracao do novo nó que será inserido
	Node newNode;
	
	public void insert(float data) {
		newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public boolean remove(float data) {
		Node current = head;
		while(current != null) {
			current = current.next;
			if(current.data == data) {
				Node prevAux = current.prev;
				Node nextAux = current.next;
				prevAux.next = nextAux;
				nextAux.prev = prevAux;				
				return true;
			}
		}
		return false;
	}
	
	public void showNormal() {
		if(head == null) {
			System.out.println("A lista esta vazia.");
			return;
		}
		
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
	}
	
	public void showInv() {
		if(head == null) {
			System.out.println("A lista esta vazia.");
			return;
		}
		
		Node current = tail;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.prev;
		}
	}
	
	public void search(float data) {
		if(head == null) {
			System.out.println("A lista esta vazia.");
			return;
		}
		
		Node current = head;
		float cont = 0;
		while(current != null) {
			current = current.next;
			cont ++;
			if(current.data == data) {
				System.out.println("O elemento " + data + " foi encontrado na posicao " + cont + ".");
				return;
			}
		}
		System.out.println("O elemento " + data + " nao foi encontrado na lista.");
	
	}
	
	public void explode() {
		head = null;
		tail = null;
	}
	
	public float media() {
		float media = 0;
		float cont = 0;
		Node current = head;
		while(current != null) {
			media += current.data;
			cont ++;
			current = current.next;
		}
		return media / cont;
	}
	

}








