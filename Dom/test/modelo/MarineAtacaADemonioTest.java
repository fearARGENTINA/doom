package modelo;

import org.junit.Assert;
import org.junit.Test;

public class MarineAtacaADemonioTest {
	
	@Test
	public void atacarA_mataAUnSucuboYRecibePuntos() {
		Marine marine = new Marine();
		marine.setArmaSeleccionada(new ArmaCortoAlcance(100));
		Sucubo sucubo = new Sucubo(100);
		marine.atacarA(sucubo, 50);
		Assert.assertEquals(10*50, marine.getPuntos());
	}
	
	@Test
	public void atacarA_noMataAUnSucuboYNoRecibePuntos() {
		Marine marine = new Marine();
		ArmaCortoAlcance armaSeleccionada = new ArmaCortoAlcance(1);
		marine.setArmaSeleccionada(armaSeleccionada);
		Sucubo sucubo = new Sucubo(100);
		marine.atacarA(sucubo, 50);
		Assert.assertEquals(0, marine.getPuntos());
	}
}
