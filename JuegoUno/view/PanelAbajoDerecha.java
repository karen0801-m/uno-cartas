package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAbajoDerecha extends JPanel {

	private JButton uno, alerta;

	public PanelAbajoDerecha() {
		setLayout(new GridLayout(2, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		uno = new JButton();
		uno.setText("¡UNO!");
		uno.setActionCommand("uno");
		uno.setBackground(Color.black);
		uno.setForeground(Color.white);

		alerta = new JButton();
		alerta.setText("ALERTA");
		alerta.setActionCommand("alert");
		alerta.setBackground(Color.black);
		alerta.setForeground(Color.white);

		add(uno);
		add(alerta);

	}

	public JButton getUno() {
		return uno;
	}

	public void setUno(JButton uno) {
		this.uno = uno;
	}

	public JButton getAlerta() {
		return alerta;
	}

	public void setAlerta(JButton alerta) {
		this.alerta = alerta;
	}

}
