package abstraktnost;

import java.awt.Color;

public class Abscisa extends IzborBarve {

	@Override
	public Color eval(float x, float y) {
		int n = (int) (x%255);
		return new Color(n,n,n);
	}

	public Abscisa() {
		super();
	}

}
