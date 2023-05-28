package co.edu.unbosque.model;


import java.util.Stack;

public class Turnos {

	Stack<Jugador> jugadores = new Stack<>();
	boolean ordenAscendente = true;
	
	public Turnos() {
		jugadores.add(new Jugador(1, "jugador1", true));
		jugadores.add(new Jugador(2, "jugador2", true));
		jugadores.add(new Jugador(3, "jugador3", true));


	}
	
	public void cambiarTurno(int id) {
		Jugador elemento = getJugadorPorId(id);
		Jugador primerElemento = ordenAscendente ? getJugadorPorId(1) : getJugadorPorId(3);
		int siguienteId = ordenAscendente ? id + 1 : id - 1;
		Jugador siguienteElemento = getJugadorPorId(siguienteId);
		Jugador bloqueoElemento = getJugadorPorId(id);
		Jugador primerBloqueoElemento = ordenAscendente ? getJugadorPorId(1) : getJugadorPorId(3);
		Jugador siguienteBloqueoElemento = ordenAscendente ? getJugadorPorId((id + 1)) : getJugadorPorId((id - 1));

		elemento.desactivado = true;
		bloqueoElemento.desactivado = true;

		if ((id == 3 && ordenAscendente) || (id == 1 && !ordenAscendente)) {
			primerElemento.desactivado = false;
			primerBloqueoElemento.desactivado = false;
		} else {
			siguienteElemento.desactivado = false;
			siguienteBloqueoElemento.desactivado = false;
		}
	}

	public void bloquearJugador(int id) {
		Jugador elemento = getJugadorPorId(id);
		// System.out.println(element.toString());
		Jugador siguienteElemento = null;
		Jugador elementoTierra = null;
		Jugador antes = null;

		elemento.desactivado = true;

		switch (id) {
		case 1:
			id = 2;
			siguienteElemento = getJugadorPorId(id);
			siguienteElemento.desactivado = true;
			antes = getJugadorPorId(1);
			antes.desactivado = true;
			elementoTierra = getJugadorPorId(3);
			elementoTierra.desactivado = false;
			elemento = getJugadorPorId(3);
			elemento.desactivado = false;
			break;
		case 2:
			id = 3;
			siguienteElemento = getJugadorPorId(id);
			siguienteElemento.desactivado = true;
			antes = getJugadorPorId(2);
			antes.desactivado = true;
			elementoTierra = getJugadorPorId(1);
			elementoTierra.desactivado = false;
			elemento = getJugadorPorId(1);
			elemento.desactivado = false;
			break;
		case 3:
			id = 2;
			siguienteElemento = getJugadorPorId(id);
			siguienteElemento.desactivado = true;
			antes = getJugadorPorId(3);
			antes.desactivado = true;
			elementoTierra = getJugadorPorId(2);
			elementoTierra.desactivado = false;
			elemento = getJugadorPorId(2);
			elemento.desactivado = false;
			break;
		default:
			break;
		}
	}

	public void cambiarOrden() {
		ordenAscendente = !ordenAscendente;
	}

	public  Jugador getJugadorPorId(int id) {
		for (Jugador jugador : jugadores) {
			if (jugador.getId() == id) {
				return jugador;
			}
		}
		return null;
	}

}
