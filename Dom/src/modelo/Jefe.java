package modelo;

import java.util.List;


public class Jefe extends Demonio {
	private static final int MAXIMA_DISTANCIA = 1000;
	private List<Arma> armas;
	private int cantidadAtaquesParaEliminarme;
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		if (marine.getArmaSeleccionada().puedeAtacarJefe()) {
			cantidadAtaquesParaEliminarme--;
		}
	}
	
	@Override
	public Boolean estoyMuerto() {
		return cantidadAtaquesParaEliminarme <= 0;
	}

	@Override
	int getDanio() {
		Arma armaMasPotente = armas.get(0);
		for (Arma arma : armas) {
			if (armaMasPotente.getDanio(MAXIMA_DISTANCIA) > arma.getDanio(MAXIMA_DISTANCIA)) {
				armaMasPotente = arma;
			}
		}
		return armaMasPotente.getDanio(MAXIMA_DISTANCIA);
	}
}
