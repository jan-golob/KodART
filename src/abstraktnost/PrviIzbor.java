package abstraktnost;

import java.awt.Color;
import java.util.Random;

public class PrviIzbor extends IzborBarve {
	private Boolean prah;
	private Random j;

	public PrviIzbor(int stopnja, int kompleksnost, Info nast) {
		super(stopnja, kompleksnost, nast);
		this.j = new Random();
		this.prah = j.nextBoolean();
	}

	@Override
	public Color eval(float x, float y) {
		Color osnova = this.podizbori[0].eval(x, y);
		float r = (float) 0.5;
		for (int i = 1; i < podizbori.length; i++) {
			if (prah) {
				r = j.nextFloat();
			}
			osnova = Povprecje.povprecje(osnova, podizbori[i].eval(x, y), r);
		}
		return osnova;
	}

}
