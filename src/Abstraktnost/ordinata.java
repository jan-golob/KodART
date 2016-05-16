package Abstraktnost;
import java.awt.Color;


public class ordinata extends IzborBarve {

	public ordinata() {
		super(0);
	}

	@Override
	public Color eval(float x, float y) {
		float n = y%256;
		return new Color(n,n,n);
	

	}

}
