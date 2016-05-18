package Abstraktnost;

import java.awt.Color;

public class Vodnjak extends IzborBarve {

	public Vodnjak(int kompleksnost) {
		super(1, kompleksnost - 1);
	}
	
	private float vodnak(float x){
		return (float) (1 - 2 / Math.pow((1 + x*x),8));
		
	}

	@Override
	public Color eval(float x, float y) {
		return new Color(vodnak(this.podizbori[0].eval(x,y).getRed()),vodnak(this.podizbori[0].eval(x,y).getGreen()),vodnak(this.podizbori[0].eval(x,y).getBlue()));
	}

}
