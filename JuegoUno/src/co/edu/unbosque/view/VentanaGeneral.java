package co.edu.unbosque.view;

public class VentanaGeneral {

	private VentanaPrincipal vp;
	private VentanaJuego vj;
	private Bots ventanaChat;

	public VentanaGeneral() {
		vj = new VentanaJuego();
		vp = new VentanaPrincipal();
		ventanaChat = new Bots();
	}
	
	public void mostrarChat() {
		ventanaChat.mostrar();
	}

	public VentanaPrincipal getVp() {
		return vp;
	}

	public void setVp(VentanaPrincipal vp) {
		this.vp = vp;
	}

	public VentanaJuego getVj() {
		return vj;
	}

	public void setVj(VentanaJuego vj) {
		this.vj = vj;
	}

	public Bots getVentanaChat() {
		return ventanaChat;
	}

	public void setVentanaChat(Bots ventanaChat) {
		this.ventanaChat = ventanaChat;
	}

}

