package Abstraktnost;

import java.awt.Color;

public class Vsota extends IzborBarve {

	public Vsota(int komp) {
		super(2, komp-1);
	}

	@Override
	public Color eval(float x, float y) {
		return Povprecje.povprecje(this.podizbori[0].eval(x,y), this.podizbori[1].eval(x, y), (float)0.5);
	}
}
