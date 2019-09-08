package modelo;

public class ArmaPlasma extends Arma {

	@Override
	int getDanio(int distanciaAlObjetivo) {
		return 0;
	}
	
	@Override
	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		if( demonio.esGroso() )
			demonio.bajarHP(demonio.getHp());
		else
			demonio.bajarHP(demonio.getHp()/2);
	}
	
	@Override
	public boolean puedeAtacarJefe() {
		return true;
	}
	
	@Override
	public boolean puedeAtacarGroso() {
		return true;
	}
}
