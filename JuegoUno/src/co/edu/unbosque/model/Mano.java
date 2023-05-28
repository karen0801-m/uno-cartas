package co.edu.unbosque.model;

import java.util.Stack;

public class Mano {
    private Stack<Carta> cartas;

    public Mano() {
        cartas = new Stack<>();
    }

    public void agregarCarta(Carta carta) {
        cartas.push(carta);
    }

    public Carta jugarCarta() {
        return cartas.pop();
    }

    public boolean isEmpty() {
        return cartas.isEmpty();
    }

	public Stack<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(Stack<Carta> cartas) {
		this.cartas = cartas;
	}

    
}

