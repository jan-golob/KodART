package abstraktnost;

import java.awt.Color;
import java.util.Iterator;
import java.util.Random;

public class PrviIzbor extends IzborBarve {

	public PrviIzbor(int stopnja, int kompleksnost) {
		super(stopnja, kompleksnost);
	}

	@Override
	public Color eval(float x, float y) {
		Color osnova = this.podizbori[0].eval(x, y);
		Random j = new Random();
		float r = (float) 0.5;
		for (int i = 1; i < podizbori.length; i++) {
			r = j.nextFloat();
			osnova = Povprecje.povprecje(osnova, podizbori[i].eval(x, y), r);
		}
		return osnova;
	}

}
