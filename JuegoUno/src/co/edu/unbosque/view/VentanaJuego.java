package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class VentanaJuego extends JFrame {

	private JLabel nom1, nom2;
	private JLabel fondo, ficha1, ficha2;
	private JPanel selec;
	private JButton[] selec_colum;
	private JButton xd, xd1;
	private ImageIcon flecha;
	private JMenu menu;
	private JMenuBar barra;
	private JMenuItem volver_menu;

	public VentanaJuego() {
		setSize(900, 800);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

//		flecha = new ImageIcon("src/co/edu/unbosque/vista/fle.jpg");
		selec_colum = new JButton[7];

		selec = new JPanel();
		selec.setBounds(190, 80, 500, 80);

		selec.setLayout(new GridLayout(1, 7, 5, 5));

		nom1 = new JLabel();
		nom1.setBounds(10, 350, 200, 100);
		nom1.setFont(new Font("Nightmare Codehack", Font.BOLD, 37));
		nom2 = new JLabel();
		nom2.setBounds(10, 400, 200, 100);
		nom2.setFont(new Font("Nightmare Codehack", Font.BOLD, 37));

		ficha1 = new JLabel();
		ficha2 = new JLabel();

		barra = new JMenuBar();
		menu = new JMenu("menu");
		volver_menu = new JMenuItem("volver menu");
		volver_menu.setActionCommand("Menu_barra_volver_menu");
		volver_menu.setFont(new Font("Nightmare Codehack", Font.BOLD, 20));
		setJMenuBar(barra);
		menu.add(volver_menu);
		barra.add(menu);

		selec();

	}

	private void selec() {

		for (int i = 0; i < selec_colum.length; i++) {

			selec_colum[i] = new JButton();
			selec_colum[i].setActionCommand("BOTON" + (i + 1) + "PONER");
			selec_colum[i].setLayout(null);
			selec_colum[i].setFocusable(false);
			selec_colum[i].setIcon(flecha);
			selec_colum[i].setBorderPainted(false);
			selec_colum[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			selec_colum[i].setOpaque(false);
			selec_colum[i].setContentAreaFilled(false);
			selec.add(selec_colum[i]);

		}

		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 900);
		fondo.setOpaque(false);

//		BufferedImage bi1 = null;
//		try {
//			bi1 = ImageIO.read(new File("src/co/edu/unbosque/vista/fnd.jpg"));
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);
//
//		fondo.setIcon(new ImageIcon(redimensionado1));

		add(selec);

		add(nom1);
		add(nom2);
//		add(fondo);

	}

	/*
	 * Métodos accesores y modificadores
	 */

	public JLabel getNom1() {
		return nom1;
	}

	public void setNom1(JLabel nom1) {
		this.nom1 = nom1;
	}

	public JLabel getNom2() {
		return nom2;
	}

	public void setNom2(JLabel nom2) {
		this.nom2 = nom2;
	}

	public JLabel getFicha1() {
		return ficha1;
	}

	public void setFicha1(JLabel ficha1) {
		this.ficha1 = ficha1;
	}

	public JPanel getSelec() {
		return selec;
	}

	public void setSelec(JPanel selec) {
		this.selec = selec;
	}

	public JButton[] getSelec_colum() {
		return selec_colum;
	}

	public void setSelec_colum(JButton[] selec_colum) {
		this.selec_colum = selec_colum;
	}

	public JButton getXd() {
		return xd;
	}

	public void setXd(JButton xd) {
		this.xd = xd;
	}

	public JButton getXd1() {
		return xd1;
	}

	public void setXd1(JButton xd1) {
		this.xd1 = xd1;
	}

	public ImageIcon getFlecha() {
		return flecha;
	}

	public void setFlecha(ImageIcon flecha) {
		this.flecha = flecha;
	}

	public JLabel getFicha2() {
		return ficha2;
	}

	public void setFicha2(JLabel ficha2) {
		this.ficha2 = ficha2;
	}

	public JMenu getMenu() {
		return menu;
	}

	public void setMenu(JMenu menu) {
		this.menu = menu;
	}

	public JMenuBar getBarra() {
		return barra;
	}

	public void setBarra(JMenuBar barra) {
		this.barra = barra;
	}

	public JMenuItem getVolver_menu() {
		return volver_menu;
	}

	public void setVolver_menu(JMenuItem volver_menu) {
		this.volver_menu = volver_menu;
	}

}
