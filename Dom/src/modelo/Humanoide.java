package modelo;

public class Humanoide extends Demonio {

	private static final int DISTANCIA_MAXIMA = 1000;
	private ArmaLargoAlcance arma;
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		super.serAtacadoPor(marine, distanciaAMi);
		if (estoyMuerto()) {
			marine.recibirRegalos(arma);
		}
	}

	@Override
	int getDanio() {
		return arma.getDanio(DISTANCIA_MAXIMA);
	}
	@Override
	public int puntosADar(int distanciaAMi) {
		return 50;
	}
}
