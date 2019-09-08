package modelo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ArmaLargoAlcanceTest {

	@Test
	public void getDanio_armaConMunicionesSuDanioNoEs0() {
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMuniciones(40);
		arma.setMunicionesPorSegundo(3);
		Assert.assertEquals(10*3/10, arma.getDanio(10));
	}
	
	@Test
	public void getDanio_armaSinMunicionesSuDanio0() {
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMuniciones(0);
		arma.setMunicionesPorSegundo(3);
		Assert.assertEquals("Un arma sin municiones debe tener danio 0", 0, arma.getDanio(10));
	}
	
	@Test
	public void recargar_marineConCartuchosAlRecargarSusMunicionesVuelvenASerLasIniciales() {
		Marine marineMock = mock(Marine.class);
		when(marineMock.tieneCartuchos()).thenReturn(true);
		
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMuniciones(10);
		arma.recargar(marineMock);
		Assert.assertEquals(100, arma.getMuniciones());
		
		verify(marineMock).usarCartucho();
	}
	
	@Test
	public void recargar_marineSinCartuchosNoRecargaSusMuniciones() {
		Marine marineMock = mock(Marine.class);
		when(marineMock.tieneCartuchos()).thenReturn(false);
		
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMuniciones(10);
		arma.recargar(marineMock);
		
		Assert.assertEquals(10, arma.getMuniciones());
		
		verify(marineMock, Mockito.times(0)).usarCartucho();
	}
	
	@Test
	public void disparar_alDispararADemonioDisminuirMuniciones() {
		Demonio demonioMock = mock(Sucubo.class);
		ArmaLargoAlcance arma = new ArmaLargoAlcance();
		arma.setMunicionesPorSegundo(3);
		
		int distanciaAlObjetivo = 100;
		arma.disparar(demonioMock, distanciaAlObjetivo);
		
		Assert.assertEquals(distanciaAlObjetivo-3, arma.getMuniciones());
		
		verify(demonioMock).bajarHP(arma.getDanio(distanciaAlObjetivo));
	}
}
