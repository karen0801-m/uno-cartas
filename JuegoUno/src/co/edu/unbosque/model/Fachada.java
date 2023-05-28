package co.edu.unbosque.model;

import co.edu.unbosque.view.Bots;

public class Fachada {

	private Carta carta;
	private CartaDescarte cartaDescarte;
	private Jugador jugador;
	private Mano mano;
	private Mazo mazo;
	private Turnos turnos;

	public Fachada() {
		carta = new Carta();
		cartaDescarte = new CartaDescarte();
		jugador = new Jugador(0, null, false);
		mano = new Mano();
		mazo = new Mazo();
		turnos = new Turnos();
	}
	
	 public CartaDescarte getCartaDescarte() {
	        return cartaDescarte;
	    }

	    public Jugador getJugador() {
	        return jugador;
	    }

	    public Mano getMano() {
	        return mano;
	    }

	    public Mazo getMazo() {
	        return mazo;
	    }

	    public Turnos getTurnos() {
	        return turnos;
	    }

	    public void realizarMovimientoJugador() {
	        jugador.realizarMovimiento();
	    }

	    public void realizarMovimientoBot(Bots bot) {
	        bot.realizarMovimiento();
	    }

	    public Carta tomarCartaDelMazo() {
	        return mazo.tomarCarta();
	    }

	    public void descartarCarta(String carta) {
	        cartaDescarte.agregarCarta(carta);
	    }

	    public boolean jugadorHaGanado() {
	        return jugador.haGanado();
	    }

	    public boolean botHaGanado(Bots bot) {
	        return bot.haGanado();
	    }

}
