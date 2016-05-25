package abstraktnost;

import java.awt.Color;

public class Produkt extends IzborBarve {

	public Produkt(int kompleksnost, Info nast) {
		super(2,kompleksnost-1, nast);
	}

	@Override
	public Color eval(float x, float y) {
		Color c0 = this.podizbori[0].eval(x, y);
		Color c1 = this.podizbori[1].eval(x, y);
		int r = c0.getRed()*c1.getRed() %256;
		int g = c0.getGreen()*c1.getGreen()%256;
		int b = c0.getBlue()*c1.getBlue()%256;
		return new Color(r, g, b);
	}

}
