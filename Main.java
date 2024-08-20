package equipo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Lamine", 17, "Delantero"));
        jugadores.add(new Jugador("Cubarsi", 17, "Defensa"));
        jugadores.add(new Jugador("Ter Stegen", 32, "Portero"));

        Entrenador entrenador = new Entrenador("Hansi Flick", 59, "Ofensiva");

        Equipo equipo = new Equipo("FC Barcelona", jugadores, entrenador);
        equipo.mostrarEquipo();
    }
}
		

