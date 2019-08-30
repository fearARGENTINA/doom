package modelo;

import java.util.List;

public class Marine {
	private List<Arma> inventario;
	private Arma armaSeleccionada;
	private int cartuchos = 0;
	
	public void equipaArma(int atajo) {
		armaSeleccionada = obtenerArma(atajo);
	}

	private Arma obtenerArma(int atajo) {
		return inventario.get(atajo);
	}
	
	public void recargarArma(int atajo) {
		obtenerArma(atajo).recargar(this);
	}

	public boolean tieneCartuchos() {
		return cartuchos > 0;
	}

	public void usarCartucho() {
		cartuchos--;
	}
	
	public void atacarA(Demonio demonio, int distanciaAlDemonio){
		demonio.serAtacadoPor(this, distanciaAlDemonio);
	}

	public Arma getArmaSeleccionada() {
		return armaSeleccionada;
	}

	public void recibirRegalos(ArmaLargoAlcance arma) {
		cartuchos++;
		if (!inventario.contains(arma)) {
			inventario.add(arma);
		}
	}
	
	
	
	
	
	
	
	
}
