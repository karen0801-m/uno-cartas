package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.model.Carta;
import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.model.Mano;
import co.edu.unbosque.model.Mazo;

import javax.swing.JScrollPane;

public class Bots extends JFrame {
	
	 private JTextField input;
	    private JTextArea output;
	    private Mano mano;
	    private Mazo mazo;

	    public void mostrar() {
	        JFrame frame = new JFrame("ChatBot");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 500);
	        frame.setLayout(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
	        
	        mano = new Mano();
	        mazo = new Mazo();

	        input = new JTextField();
	        input.setBounds(10, 400, 360, 30);
	        input.addActionListener(new ActionListener() {
	        	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                sendMessage();
	            }
	        });
	        frame.add(input);

	        output = new JTextArea();
	        output.setEditable(false);
	        output.setLineWrap(true);
	        JScrollPane scrollPane = new JScrollPane(output);
	        scrollPane.setBounds(10, 10, 360, 380);
	        frame.add(scrollPane);

	        frame.setVisible(true);
	    }

	    private void sendMessage() {
	        String inputText = input.getText().toLowerCase();
	        String outputText = getResponse(inputText);

	        output.append("Tú: " + inputText + "\n");
	        output.append("ChatBot: " + outputText + "\n");
	        input.setText("");
	        input.requestFocus();
	    }
	    
	    public String getResponse(String input) {
	        String stringIn = input.toLowerCase();
	        String stringOut = "";

	        if (stringIn.contains("hola")) {
	            stringOut = "¡Hola! ¿En qué puedo ayudarte con el juego de cartas Uno?";
	        } else if (stringIn.contains("como estas") || stringIn.contains("cómo estás")) {
	            stringOut = "Yo soy un chatbot, así que siempre estoy listo para ayudar. ¿Tienes alguna pregunta específica sobre el juego Uno?";
	        } else if (stringIn.contains("reglas")) {
	            stringOut = "El objetivo del juego Uno es quedarse sin cartas en la mano. Para lograrlo, debes ir descartando cartas que coincidan en número, color o símbolo con la carta en la parte superior del mazo. También hay cartas especiales que pueden cambiar el curso del juego. ¿Hay alguna regla en particular que necesites saber?";
	        } else if (stringIn.contains("comprar cartas")) {
	            stringOut = "Cuando no puedas jugar ninguna carta de tu mano, debes comprar una carta del mazo. Si esa carta puede ser jugada inmediatamente, puedes hacerlo. De lo contrario, es el turno del siguiente jugador. Recuerda que puedes acumular cartas para luego jugarlas en turnos posteriores.";
	        } else if (stringIn.contains("cartas especiales")) {
	            stringOut = "Las cartas especiales en Uno son: Reversa, Salto, +2, Cambio de color y +4 Cambio de color. Estas cartas tienen efectos especiales y pueden cambiar el curso del juego. ¿Necesitas más detalles sobre alguna de ellas?";
	        } else if (stringIn.contains("finalizar juego")) {
	            stringOut = "El juego Uno finaliza cuando un jugador se queda sin cartas en la mano. Ese jugador es declarado el ganador y se lleva puntos en función de las cartas que tengan los demás jugadores en sus manos. ¿Tienes alguna otra pregunta?";
	        } else {
	            stringOut = "Lo siento, no tengo información sobre esa pregunta. ¿Hay algo más en lo que pueda ayudarte?";
	        }

	        return stringOut;
	    }

		public boolean haGanado() {
			return mano.isEmpty();
		}

		public void realizarMovimiento() {
		    Carta cartaActual = mazo.getCartaActual();

		    boolean cartaValidaEncontrada = false;
		    for (Carta carta : mano.getCartas()) {
		        if (carta.esCartaValida(cartaActual)) {
		            jugarCarta();
		            cartaValidaEncontrada = true;
		            break;
		        }
		    }

		    if (!cartaValidaEncontrada) {
//		        comprarCartaDelMazo();
		    }
		}
		
		public void jugarCarta() {
//		    Carta cartaTope = mazo.getCartaActual();
//
//		    for (Carta carta : mano.getCartas()) {
//		        if (carta.esCartaValida(carta)) {
//		            if (carta.getColor() == cartaTope.getColor() || carta.getNumero() == cartaTope.getNumero()) {
//		                mazo.agregarCarta(carta);
//		                aplicarEfectoCartaNumero(carta);
//		                break;
//		            }
//		        }
//		    }
//
//		    if (mazo.haGanado()) {
//		      
//		    } else {
//		        
////		        pasarTurno();
//		    }
		}

		private void aplicarEfectoCartaNumero(Carta carta) {
//		    int numero = carta.getNumero();
//		    Jugador siguienteJugador = obtenerSiguienteJugador();
//
//		    switch (numero) {
//		        case 1:
//		            cambiarSentidoJuego();
//		            break;
//		        case 2:
//		            siguienteJugador.robarCartas(2);
//		            break;
//		        case 3:
//		            siguienteJugador = obtenerSiguienteJugador();
//		            break;
//		        default:
//		            break;
//		    }
		}
}
