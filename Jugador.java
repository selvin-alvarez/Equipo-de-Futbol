package equipo;

class Jugador extends Persona {
	
	private String posicion;

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void mostrarRol() {
        System.out.println(getNombre() + " es un jugador que juega en la posición de " + posicion);
    }
}



