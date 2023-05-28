package co.edu.unbosque.model;

public class Jugador {
	private int id;
    private String nombre;
    private Mano mano;
     boolean desactivado;


    public Jugador(int id, String nombre, boolean desactivado) {
        this.nombre = nombre;
        this.mano = new Mano();
        this.desactivado = desactivado;
    }

    public void realizarMovimiento() {
     
    }

    public boolean haGanado() {
        return mano.isEmpty();
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mano getMano() {
		return mano;
	}

	public void setMano(Mano mano) {
		this.mano = mano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}