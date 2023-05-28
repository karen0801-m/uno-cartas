package co.edu.unbosque.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaPartida extends JFrame {

	private PanelArriba pa;
	private PanelCentro pc;
	private PanelAbajo pab;

	public VentanaPartida() {

		setTitle("¡UNO!");
		setSize(1280, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Run();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void Run() {

		getContentPane().setLayout(new BorderLayout());

		pa = new PanelArriba();
		pc = new PanelCentro();
		pab = new PanelAbajo();

		getContentPane().add(pa, BorderLayout.NORTH);
		getContentPane().add(pc, BorderLayout.CENTER);
		getContentPane().add(pab, BorderLayout.SOUTH);
	}

	public PanelArriba getPa() {
		return pa;
	}

	public void setPa(PanelArriba pa) {
		this.pa = pa;
	}

	public PanelCentro getPc() {
		return pc;
	}

	public void setPc(PanelCentro pc) {
		this.pc = pc;
	}

	public PanelAbajo getPab() {
		return pab;
	}

	public void setPab(PanelAbajo pab) {
		this.pab = pab;
	}

}
