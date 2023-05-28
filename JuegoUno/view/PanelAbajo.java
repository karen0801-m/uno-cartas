package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelAbajo extends JPanel {

	private PanelAbajoIzquierda pai;
	private PanelAbajoDerecha pad;

	public PanelAbajo() {
		setLayout(new GridLayout(1, 2));
		Run();
		setVisible(true);
	}

	private void Run() {
		pai = new PanelAbajoIzquierda();

		pad = new PanelAbajoDerecha();

		add(pai);

		add(pad);
	}

	public PanelAbajoIzquierda getPai() {
		return pai;
	}

	public void setPai(PanelAbajoIzquierda pai) {
		this.pai = pai;
	}

	public PanelAbajoDerecha getPad() {
		return pad;
	}

	public void setPad(PanelAbajoDerecha pad) {
		this.pad = pad;
	}

}
