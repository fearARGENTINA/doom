package modelo;

public class ArmaCortoAlcance extends Arma {
	private int danio;
	
	public ArmaCortoAlcance(int danio) {
		this.danio = danio;
	}

	public int getDanio(int distanciaAlObjetivo) {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}
}
