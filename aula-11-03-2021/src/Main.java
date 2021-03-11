import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		NodeList list = new NodeList();
		int opt;
		do {
			String input = JOptionPane.showInputDialog("Menu "
					+ "\n1 - inserir "
					+ "\n2 - retirar "
					+ "\n3 - mostrar normal"
					+ "\n4 - mostrar invertido"
					+ "\n5 - detonar"
					+ "\n6 - procurar"
					+ "\n7 - procurar"
					+ "\n9 - sair");
			opt = Integer.parseInt(input);
			
			switch(opt) {
			case 1:
				//insere um novo elemento na lista
				String newElement = JOptionPane.showInputDialog("Digite o novo elemento da lsita");
				float newfloat = Float.parseFloat(newElement);
				list.insert(newfloat);
				break;
			case 2:
				//remove um elemento da lista
				String removeStr = JOptionPane.showInputDialog("Digite o elemento que deseja remover da lsita");
				float removefloat = Float.parseFloat(removeStr);
				System.out.println("\n*********************");
				if (list.remove(removefloat) == false) {
					System.out.println("Este elemento nao esta na lista.");
				} else {
					System.out.println("O elemento " + removefloat + " foi removido da lista.");
				}
				System.out.println("\n*********************");
				break;
			case 3:
				//mostra a lista na ordem normal
				System.out.println("\n*********************");
				list.showNormal();
				System.out.println("\n*********************");
				break;
			case 4:
				//mostra a lista na ordem invertida
				System.out.println("\n*********************");
				list.showInv();
				System.out.println("\n*********************");
				break;
			
			case 5:
				//zera a lista
				list.explode();
				break;	
			case 6:
				//verifica a existencia de um numero na lista
				String wantedStr = JOptionPane.showInputDialog("Digite o elemento que deseja procurar na lsita");
				float wantedfloat = Float.parseFloat(wantedStr);
				System.out.println("\n*********************");
				list.search(wantedfloat);
				System.out.println("\n*********************");
				break;
			case 7:
				//verifica a media simples da lista
				System.out.println(list.media());
				break;
			
			}
		} while(opt != 9);

		

	}

}
