package abstraktnost;

import java.awt.Color;

public class Vsota extends IzborBarve {

	public Vsota(int kompleksnost, int[] podIz) {
		super(2, kompleksnost-1, podIz);
	}

	@Override
	public Color eval(float x, float y) {
		return Povprecje.povprecje(this.podizbori[0].eval(x,y), this.podizbori[1].eval(x, y), (float)0.5);
	}
}
