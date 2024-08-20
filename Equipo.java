package equipo;

import java.util.ArrayList;

class Equipo {
	
	private String nombreEquipo;
    private ArrayList<Jugador> jugadores;
    private Entrenador entrenador;

    public Equipo(String nombreEquipo, ArrayList<Jugador> jugadores, Entrenador entrenador) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombreEquipo);
        entrenador.mostrarRol();
        for (Jugador jugador : jugadores) {
            jugador.mostrarRol();
        }
    }
}


