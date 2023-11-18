package Modulo_3.Actividad_14;

public class Main {

    public static void main(String[] args) {
    	
    	BinarySearchTree arbol = new BinarySearchTree();
    	
    	arbol.insert(new Node(3));
    	arbol.insert(new Node(18));
    	arbol.insert(new Node(6));
    	arbol.insert(new Node(21));
    	arbol.insert(new Node(9));
    	arbol.insert(new Node(24));
    	arbol.insert(new Node(12));
    	arbol.insert(new Node(27));
    	arbol.insert(new Node(15));
		arbol.insert(new Node(30));
    	
    	arbol.mostrar();
    }
    
}