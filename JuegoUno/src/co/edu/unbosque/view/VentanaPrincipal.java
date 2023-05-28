package co.edu.unbosque.view;

import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
	private JButton chatButton;

	public VentanaPrincipal() {
		initialize();
	}

	private void initialize() {
		setTitle("Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);

		chatButton = new JButton("Abrir Chat");
		chatButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openChatWindow();
			}
		});
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(chatButton);

		setContentPane(contentPane);
	}

	private void openChatWindow() {
		Bots chatWindow = new Bots();
		chatWindow.show();
	}

	public JButton getChatButton() {
		return chatButton;
	}

	public void setChatButton(JButton chatButton) {
		this.chatButton = chatButton;
	}

	public void mostrar() {
		setVisible(true);

	}

}
