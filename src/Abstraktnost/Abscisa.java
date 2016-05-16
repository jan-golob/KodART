package Abstraktnost;

import java.awt.Color;

public class Abscisa extends IzborBarve {

	@Override
	public Color eval(float x, float y) {
		float n = x%256;
		return new Color(n,n,n);
	}

	public Abscisa() {
		super(0);
	}

}
