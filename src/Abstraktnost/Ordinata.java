package Abstraktnost;
import java.awt.Color;


public class Ordinata extends IzborBarve {

	public Ordinata() {
		super(0);
	}

	@Override
	public Color eval(float x, float y) {
		float n = y%256;
		return new Color(n,n,n);
	

	}

}
