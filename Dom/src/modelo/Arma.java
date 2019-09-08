package modelo;

public abstract class Arma {

	public void recargar(Marine marine) {

	}

	abstract int getDanio(int distanciaAlObjetivo);

	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		demonio.bajarHP(this.getDanio(distanciaAlObjetivo));
	}

	public boolean puedeAtacarJefe() {
		return false;
	}
	
	public boolean puedeAtacarGroso() {
		return false;
	}
}
