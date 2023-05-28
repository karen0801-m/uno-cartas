package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.view.Bots;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {
	
    private VentanaPrincipal ventanaPrincipal;
    private Bots ventanaChat;
    private Jugador jugador;
    private Bots[] bots;
    private Fachada fachada;

    public Controller() {
        ventanaPrincipal = new VentanaPrincipal();
        asignarOyentes();
        fachada = new Fachada();
        bots = new Bots[2];
        bots[0] = new Bots();
        bots[1] = new Bots();

    }

    public void iniciar() {
        ventanaPrincipal.mostrar();
    }

    public void asignarOyentes() {
        ventanaPrincipal.getChatButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaPrincipal.getChatButton()) {
            abrirVentanaChat();
        }
    }

    private void abrirVentanaChat() {
        ventanaChat = new Bots();
        for (Bots bot : bots) {
        ventanaChat.mostrar();
    }
        while (!fachada.jugadorHaGanado() && !fachada.botHaGanado(fachada.getBots()[0]) && !fachada.botHaGanado(fachada.getBots()[1])) {
            for (Bots bot : fachada.getBots()) {
                fachada.realizarMovimientoBot(bot);
            }
            fachada.realizarMovimientoJugador();
        }
}
}

