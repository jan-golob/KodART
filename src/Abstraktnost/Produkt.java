package Abstraktnost;

import java.awt.Color;

public class Produkt extends IzborBarve {

	public Produkt() {
		super(2);
	}

	@Override
	public Color eval(float x, float y) {
		Color c0 = this.podizbori[0].eval(x, y);
		Color c1 = this.podizbori[1].eval(x, y);
		float r = c0.getRed()*c1.getRed();
		float g = c0.getGreen()*c1.getGreen();
		float b = c0.getBlue()*c1.getBlue();
		return new Color(r, g, b);
	}

}
