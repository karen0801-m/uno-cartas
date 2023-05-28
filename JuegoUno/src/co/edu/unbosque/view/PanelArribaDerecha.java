package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelArribaDerecha extends JPanel {

	private JButton historial;

	public PanelArribaDerecha() {
		setLayout(new GridLayout(1, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		historial = new JButton();
		historial.setText("HISTORIAL");
		historial.setActionCommand("history");
		historial.setBackground(Color.black);
		historial.setForeground(Color.white);

		add(historial);

	}

	public JButton getHistorial() {
		return historial;
	}

	public void setHistorial(JButton historial) {
		this.historial = historial;
	}

}
