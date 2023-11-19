package Modulo_3.Actividad_14;

public class BinarySearchTree {

	Node root;
	
	public void insert(Node node) {
		
		root = insertHelper(root, node);
	}

	private Node insertHelper(Node root, Node node) {
		
		int dato = node.dato;
		
		if(root == null) {

			root = node;
			return root;
		}

		else if(dato < root.dato) {

			root.izquierda = insertHelper(root.izquierda, node);

		}
		else {

			root.derecha = insertHelper(root.derecha, node);

		}
		
		return root;

	}

	public void mostrar() {

		displayHelper(root);
	}

	private void displayHelper(Node root) {
		
		if(root != null) {

			displayHelper(root.izquierda);
			System.out.println(root.dato);
			displayHelper(root.derecha);
			
		}

	}

	public boolean search(int dato) {

		return searchHelper(root, dato);
	}

	private boolean searchHelper(Node root, int dato) {
		
		if(root == null) {

			return false;

		}

		else if(root.dato == dato) {

			return true;

		}

		else if(root.dato > dato) {

			return searchHelper(root.izquierda, dato);
		}

		else {

			return searchHelper(root.derecha, dato);
		}
	}

	public void remove(int dato) {
		
		if(search(dato)) {

			removeHelper(root, dato);
		}
		else {

			System.out.println(dato + " No se hallo");
		}

	}

	private Node removeHelper(Node root, int dato) {
		
		if(root == null) {

			return root;
		}
		else if(dato < root.dato) {

			root.izquierda = removeHelper(root.izquierda, dato);
		}
		else if(dato > root.dato) {

			root.derecha = removeHelper(root.derecha, dato);
		}

		else { 

			if(root.izquierda == null && root.derecha == null) {

				root = null;
			}

			else if(root.derecha != null) { 
				
				root.dato = successor(root);
				root.derecha = removeHelper(root.derecha, root.dato);
			}

			else {

				root.dato = predecessor(root);
				root.izquierda = removeHelper(root.izquierda, root.dato);
			}

		}

		return root;
	}

	private int successor(Node root) {
		
		while(root.izquierda != null){

			root = root.izquierda;
		}

		return root.dato;
	}

	private int predecessor(Node root) {

		root = root.izquierda;
		while(root.derecha != null){

			root = root.derecha;
		}

		return root.dato;
	}

}