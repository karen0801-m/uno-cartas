package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelCentroCentro1 extends JPanel {

	private PanelCentroCentroIzquierda pcci;
	private PanelCentroCentroDerecha pccd;

	public PanelCentroCentro1() {
		setLayout(new GridLayout(1, 2));
		Run();
		setVisible(true);
	}

	private void Run() {
		pcci = new PanelCentroCentroIzquierda();
		pccd = new PanelCentroCentroDerecha();

		add(pcci);
		add(pccd);
	}

	public PanelCentroCentroIzquierda getPcci() {
		return pcci;
	}

	public void setPcci(PanelCentroCentroIzquierda pcci) {
		this.pcci = pcci;
	}

	public PanelCentroCentroDerecha getPccd() {
		return pccd;
	}

	public void setPccd(PanelCentroCentroDerecha pccd) {
		this.pccd = pccd;
	}

}
