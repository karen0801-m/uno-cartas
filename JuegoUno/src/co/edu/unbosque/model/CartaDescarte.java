package co.edu.unbosque.model;
	
	import java.util.Stack;

	public class CartaDescarte {
		private Stack<String> CartaDescarte;

		public CartaDescarte() {
			CartaDescarte = new Stack<>();
	    }

		 public void agregarCarta(String carta) {
		        if (CartaDescarte.size() >= 3) {
		        	CartaDescarte.remove(0); // Elimina la carta más antigua
		        }
		        CartaDescarte.add(carta);
		    }
		    
		    public Stack<String> getCartaDescarte() {
		        return CartaDescarte;
		    }
		}