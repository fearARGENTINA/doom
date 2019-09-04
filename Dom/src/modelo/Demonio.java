package modelo;

public abstract class Demonio {

	protected int hp;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		marine.getArmaSeleccionada().disparar(this, distanciaAMi);
		if (estoyMuerto()) {
			marine.recibirPuntos(puntosADar(distanciaAMi));
		}
	}

	public int puntosADar(int distanciaAMi) {
		return 0;
	}

	public void bajarHP(int danio) {
		hp -= danio;
	}

	public Boolean estoyMuerto() {
		return hp <= 0;
	}

	abstract int getDanio();
}
