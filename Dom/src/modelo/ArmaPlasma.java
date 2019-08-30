package modelo;

public class ArmaPlasma extends Arma {

	@Override
	int getDanio(int distanciaAlObjetivo) {
		return 0;
	}
	
	@Override
	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		demonio.bajarHP(demonio.getHP());
	}
	
	@Override
	public boolean puedeAtacarJefe() {
		return true;
	}

}
