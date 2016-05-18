package abstraktnost;

import java.awt.Color;

public class Modul extends IzborBarve {

	public Modul(int kompleksnost) {
		super(2, kompleksnost-1);
	}

	@Override
	public Color eval(float x, float y) {
	Color c0 = this.podizbori[0].eval(x, y);
	Color c1 = this.podizbori[1].eval(x, y);
	float r = (float) (c0.getRed()%((c1.getRed()+1)/1.004));
	float g = (float) (c0.getGreen()%((c1.getGreen()+1)/1.004));
	float b = (float) (c0.getBlue()%((c1.getBlue()+1)/1.004));
	return new Color(r, g, b);
	}

}
