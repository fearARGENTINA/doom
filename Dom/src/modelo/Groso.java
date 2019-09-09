package modelo;

public class Groso extends Demonio {

	@Override
	int getDanio() {
		return 0;
	}

	@Override
	public boolean esGroso() {
		return true;
	}
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		if (marine.getArmaSeleccionada().puedeAtacarGroso()) {
			marine.getArmaSeleccionada().disparar(this, distanciaAMi);
		}
	}
}
