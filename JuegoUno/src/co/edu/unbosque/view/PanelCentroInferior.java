package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCentroInferior extends JPanel {

	private JButton turnos;

	public PanelCentroInferior() {
		setLayout(new GridLayout(1, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		turnos = new JButton();
		turnos.setText("Mazo j1");
		turnos.setActionCommand("Maj1");
		turnos.setBackground(Color.black);
		turnos.setForeground(Color.white);

		add(turnos);

	}

}
