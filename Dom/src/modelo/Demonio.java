package modelo;

public abstract class Demonio {

	protected int hp;

	public int getHP() {
		return hp;
	}

	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		marine.getArmaSeleccionada().disparar(this, distanciaAMi);
	}

	public void bajarHP(int danio) {
		hp -= danio;
	}

}
