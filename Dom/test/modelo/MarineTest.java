package modelo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;

public class MarineTest {

	@Test
	public void atacarA_DemonioGrosoConArmaCortoAlcanceYNoDisminuyeSuHP() {
		Marine marine = new Marine();
		
		ArmaCortoAlcance arma = new ArmaCortoAlcance(5);
		marine.setArmaSeleccionada(arma);
		
		Groso groso = new Groso();
		groso.setHp(100);
		
		marine.atacarA(groso, 100);
		
		Assert.assertEquals(100, groso.getHp());
	}
	
	@Test
	public void atacarA_DemonioGrosoConArmaLargoAlcanceYDisminuyeHP() {
		Marine marine = new Marine();
		
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMunicionesPorSegundo(100);
		marine.setArmaSeleccionada(arma);
		
		Groso groso = new Groso();
		groso.setHp(100);
		
		marine.atacarA(groso, 100);
		
		Assert.assertEquals(90, groso.getHp());
	}
	
	@Test
	public void atacarA_DemonioGrosoConArmaPlasmaYDisminuyeHPALaMitad() {
		Marine marine = new Marine();
		
		ArmaPlasma arma = new ArmaPlasma();
		marine.setArmaSeleccionada(arma);
		
		Groso groso = new Groso();
		groso.setHp(100);
		
		marine.atacarA(groso, 100);
		
		Assert.assertEquals(50, groso.getHp());
	}

}
