package abstraktnost;

import java.awt.Color;

public class Mesanje extends IzborBarve {

	public Mesanje(int kompleksnost, int[] podIz) {
		super(3, kompleksnost-1, podIz);
	}

	@Override
	public Color eval(float x, float y) {
		float utez = (float) (0.5 * (this.podizbori[0].eval(x,y).getRed()/256 + 1.0));
		Color prva =this.podizbori[1].eval(x, y);
		Color druga =this.podizbori[2].eval(x, y);
		return Povprecje.povprecje(prva, druga, utez);
	}

}
