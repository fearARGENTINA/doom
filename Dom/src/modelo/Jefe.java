package modelo;


public class Jefe extends Demonio {

	private int cantidadAtaquesParaEliminarme;
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		if (marine.getArmaSeleccionada().puedeAtacarJefe()) {
			cantidadAtaquesParaEliminarme--;
		}
	}
	
}
