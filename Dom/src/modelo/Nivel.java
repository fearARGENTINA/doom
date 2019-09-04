package modelo;

import java.util.Collection;
import java.util.List;

public class Nivel {

	private List<Demonio> demonios;

	public Demonio demonioMasDuro() {
		Demonio demonioMasDuro = demonios.get(0);
		for (Demonio demonio : demonios) {
			if (demonio.getHP() > demonioMasDuro.getHP()) {
				demonioMasDuro = demonio;
			}
		}
		return demonioMasDuro;
	}
	
	public void limpiar() {
		demonios.removeIf(demonio -> demonio.estoyMuerto());
	}
	
	public boolean estaCompletado() {
		return demonios.stream().allMatch(demonio -> demonio.estoyMuerto());
	}
	
	public Demonio demonioMasPeligroso() {
		Demonio demonioMasDuro = demonios.get(0);
		for (Demonio demonio : demonios) {
			if (demonio.getDanio() > demonioMasDuro.getDanio()) {
				demonioMasDuro = demonio;
			}
		}
		return demonioMasDuro;
	}
}