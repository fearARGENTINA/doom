package modelo;

public class Sucubo extends Demonio {

	int danio;
	
	public Sucubo(int hp) {
		this.hp = hp;
	}

	@Override
	int getDanio() {
		return 0;
	}

	@Override
	public int puntosADar(int distanciaAMi) {
		return 10 * distanciaAMi;
	}

	@Override
	boolean esGroso() {
		// TODO Auto-generated method stub
		return false;
	}
}
