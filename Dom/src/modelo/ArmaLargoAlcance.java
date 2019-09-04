package modelo;

public class ArmaLargoAlcance extends Arma {
	
	private static final int MUNICIONES_INICIALES = 100;
	
	private int municiones = MUNICIONES_INICIALES;
	private int municionesPorSegundo;
	@Override
	public void recargar(Marine marine) {
		if (marine.tieneCartuchos()) {
			municiones = MUNICIONES_INICIALES;
			marine.usarCartucho();
		}
	}
	
	@Override
	int getDanio(int distanciaAlObjetivo) {
		if (tieneMuniciones()) {
			return 10 * municionesPorSegundo / distanciaAlObjetivo;
		} else {
			return 0;
		}
	}

	private boolean tieneMuniciones() {
		return municiones > 0;
	}
	
	@Override
	public void disparar(Demonio demonio, int distanciaAlObjetivo) {
		super.disparar(demonio, distanciaAlObjetivo);
		municiones -= municionesPorSegundo;
	}

	public int getMuniciones() {
		return municiones;
	}

	public void setMuniciones(int municiones) {
		this.municiones = municiones;
	}

	public void setMunicionesPorSegundo(int municionesPorSegundo) {
		this.municionesPorSegundo = municionesPorSegundo;
	}
}
