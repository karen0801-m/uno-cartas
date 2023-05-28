package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelAbajoIzquierda extends JPanel {

	private JButton chat;

	public PanelAbajoIzquierda() {
		setLayout(new GridLayout(1, 1));
		Run();
		setBackground(null);
		setVisible(true);
	}

	public void Run() {

		chat = new JButton();
		chat.setText("CHAT");
		chat.setActionCommand("chat");
		chat.setBackground(Color.black);
		chat.setForeground(Color.white);

		add(chat);

	}

	public JButton getChat() {
		return chat;
	}

	public void setChat(JButton chat) {
		this.chat = chat;
	}

}
