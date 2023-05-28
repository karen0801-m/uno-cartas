package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelCentroCentro2 extends JPanel {

	private PanelCentroCentro1 pcc1;
	private PanelCentroInferior pcci;

	public PanelCentroCentro2() {
		setLayout(new GridLayout(2, 1));
		Run();
		setVisible(true);
	}

	private void Run() {
		pcc1 = new PanelCentroCentro1();
		pcci = new PanelCentroInferior();

		add(pcc1);
		add(pcci);
	}

	public PanelCentroCentro1 getPcc1() {
		return pcc1;
	}

	public void setPcc1(PanelCentroCentro1 pcc1) {
		this.pcc1 = pcc1;
	}

	public PanelCentroInferior getPcci() {
		return pcci;
	}

	public void setPcci(PanelCentroInferior pcci) {
		this.pcci = pcci;
	}

}
