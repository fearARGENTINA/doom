package modelo;

public class Humanoide extends Demonio {

	private ArmaLargoAlcance arma;
	
	@Override
	public void serAtacadoPor(Marine marine, int distanciaAMi) {
		super.serAtacadoPor(marine, distanciaAMi);
		if (estoyMuerto()) {
			marine.recibirRegalos(arma);
		}
	}

	private boolean estoyMuerto() {
		return getHP() <= 0;
	}

}
