package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelCentro extends JPanel {

	private PanelCentroIzquierda pci;
	private PanelCentroCentro2 pcc2;
	private PanelCentroDerecha pcd;

	public PanelCentro() {

		setLayout(new GridLayout(1, 3));
		Run();
		setVisible(true);

	}

	private void Run() {
		pci = new PanelCentroIzquierda();
		pcc2 = new PanelCentroCentro2();
		pcd = new PanelCentroDerecha();

		add(pci);
		add(pcc2);
		add(pcd);
	}

	public PanelCentroIzquierda getPci() {
		return pci;
	}

	public void setPci(PanelCentroIzquierda pci) {
		this.pci = pci;
	}

	public PanelCentroCentro2 getPcc2() {
		return pcc2;
	}

	public void setPcc2(PanelCentroCentro2 pcc2) {
		this.pcc2 = pcc2;
	}

	public PanelCentroDerecha getPcd() {
		return pcd;
	}

	public void setPcd(PanelCentroDerecha pcd) {
		this.pcd = pcd;
	}

}
