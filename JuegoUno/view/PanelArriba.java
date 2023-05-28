package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelArriba extends JPanel {

	private PanelArribaIzquierda pai;
	private PanelArribaDerecha pad;

	public PanelArriba() {
		setLayout(new GridLayout(1, 2));
		Run();
		setVisible(true);
	}

	private void Run() {
		pai = new PanelArribaIzquierda();
		pad = new PanelArribaDerecha();

		add(pai);
		add(pad);
	}

	public PanelArribaIzquierda getPai() {
		return pai;
	}

	public void setPai(PanelArribaIzquierda pai) {
		this.pai = pai;
	}

	public PanelArribaDerecha getPad() {
		return pad;
	}

	public void setPad(PanelArribaDerecha pad) {
		this.pad = pad;
	}

}
