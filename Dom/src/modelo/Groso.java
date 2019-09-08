package modelo;

public class Groso extends Demonio {

	@Override
	int getDanio() {
		return 0;
	}

	@Override
	public boolean esGroso() {
		return true;
	}
}
