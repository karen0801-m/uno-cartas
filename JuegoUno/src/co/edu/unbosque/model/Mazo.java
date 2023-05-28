package co.edu.unbosque.model;

import java.util.Collections;
import java.util.Stack;

public class Mazo {
    private Stack<Carta> cartas;

    public Mazo() {
        cartas = new Stack<>();
        inicializarMazo();
        barajar();
    }

    private void inicializarMazo() {
		Carta.Color[] colores = { Carta.Color.ROJO, Carta.Color.AMARILLO, Carta.Color.VERDE, Carta.Color.AZUL };
		Carta.Simbolo[] simbolos = { Carta.Simbolo.NUMERO, Carta.Simbolo.REVERSA, Carta.Simbolo.SALTO,
				Carta.Simbolo.MAS2, Carta.Simbolo.CAMBIO_COLOR, Carta.Simbolo.MAS4 };

		for (Carta.Color color : colores) {
			for (int numero = 0; numero <= 9; numero++) {
				Carta carta = new Carta(color, numero, Carta.Simbolo.NUMERO);
				agregarCarta(carta);

				if (numero != 0) {
					agregarCarta(carta);
				}

			}

			for (Carta.Simbolo simbolo : simbolos) {
				if (simbolo != Carta.Simbolo.NUMERO && simbolo != Carta.Simbolo.CAMBIO_COLOR
						&& simbolo != Carta.Simbolo.MAS4) {
					Carta carta = new Carta(color, -1, simbolo);
					agregarCarta(carta);
					agregarCarta(carta);
				}
			}
		}

		// Agregar las cartas especiales
		for (int i = 0; i < 4; i++) {
			Carta cartaCambioColor = new Carta(null, -1, Carta.Simbolo.CAMBIO_COLOR);
			agregarCarta(cartaCambioColor);

			Carta cartaMas4 = new Carta(null, -1, Carta.Simbolo.MAS4);
			agregarCarta(cartaMas4);
		}

	}

    public void barajar() {

		Collections.shuffle(cartas);

	}
	
	public Stack<Carta> repartirCartas() {
		Stack<Carta> temp = new Stack<>();
		for(int i =0; i<7;i++) {
			temp.push(tomarCarta());
		}
		
		return temp;
	}
	
    public Carta tomarCarta() {
        if (cartas.isEmpty()) {
        	inicializarMazo();
            tomarCarta();
        }

        int index = cartas.size();
        Carta carta = cartas.get(index);
        cartas.remove(index);

        return carta;
    }

    public Stack<Carta> toma2() {
		Stack<Carta> toma2 = new Stack<>();
		toma2.push(tomarCarta());
		toma2.push(tomarCarta());
		
		return toma2;
	}
    
    public Stack<Carta> toma4() {
		Stack<Carta> toma4 = new Stack<>();
		toma4.push(tomarCarta());
		toma4.push(tomarCarta());
		toma4.push(tomarCarta());
		toma4.push(tomarCarta());
		
		return toma4;
	}

    public Carta obtenerCarta() {
        if (cartas.isEmpty()) {
            return null; 
        }
        return cartas.pop();
    }

    public void agregarCarta(Carta carta) {
        cartas.push(carta); 
    }

    public Carta getCartaActual() {
        if (cartas.isEmpty()) {
            return null; 
        }
        return cartas.peek(); 
    }

    public int getSize() {
        return cartas.size(); 
    }
}

