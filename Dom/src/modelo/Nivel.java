package modelo;

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
}