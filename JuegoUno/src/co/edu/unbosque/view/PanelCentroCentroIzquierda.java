package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelCentroCentroIzquierda extends JPanel {
	
	private JButton turnos;

	public PanelCentroCentroIzquierda() {
		setLayout(new GridLayout(1, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		turnos = new JButton();
		turnos.setText("Mazo Robos");
		turnos.setActionCommand("MaRo");
		turnos.setBackground(Color.black);
		turnos.setForeground(Color.white);

		add(turnos);

	}

}
