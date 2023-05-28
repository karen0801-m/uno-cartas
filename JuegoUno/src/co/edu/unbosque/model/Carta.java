package co.edu.unbosque.model;


public class Carta {
	private Color color;
	private int numero;
	private Simbolo simbolo;
	public Mazo mazo;
	private String tipo;

	public Carta() {
		mazo = new Mazo();
	}

	public enum Color {
		ROJO, AMARILLO, VERDE, AZUL
	}

	public enum Simbolo {
		NUMERO, REVERSA, SALTO, MAS2, CAMBIO_COLOR, MAS4
	}

	public Carta(Color color, int numero, Simbolo simbolo) {
		this.color = color;
		this.numero = numero;
		this.simbolo = simbolo;
	}

	public Color getColor() {
		return color;
	}

	public int getNumero() {
		return numero;
	}

	public Simbolo getSimbolo() {
		return simbolo;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSimbolo(Simbolo simbolo) {
		this.simbolo = simbolo;
	}

	public boolean esCartaValida(Carta cartaActual) {
	    Carta cartaTope = mazo.getCartaActual();
	    if (cartaTope.getColor() == cartaActual.getColor() || cartaTope.getNumero() == cartaActual.getNumero()
	            || cartaTope.getTipo().equals(cartaActual.getTipo())) {
	        return true; 
	    } else if (cartaTope.getTipo().equals("COMODIN") || cartaTope.getTipo().equals("COMODIN_ROBA4")) {
	        return true;
	    }

	    return false;
	}

	public Mazo getMazo() {
		return mazo;
	}

	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
