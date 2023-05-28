package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelArribaIzquierda extends JPanel {

	private JButton turnos;

	public PanelArribaIzquierda() {
		setLayout(new GridLayout(1, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		turnos = new JButton();
		turnos.setText("TURNO");
		turnos.setActionCommand("turn");
		turnos.setBackground(Color.black);
		turnos.setForeground(Color.white);

		add(turnos);

	}

	public JButton getTurnos() {
		return turnos;
	}

	public void setTurnos(JButton turnos) {
		this.turnos = turnos;
	}

}
