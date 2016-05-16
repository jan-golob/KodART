package Abstraktnost;

import java.awt.Color;

public class Vodnjak extends IzborBarve {

	public Vodnjak() {
		super(1);
	}
	
	private float vodnjak(float x){
		return (float) (1 - 2 / Math.pow((1 + x*x),8));
		
	}

	@Override
	public Color eval(float x, float y) {
		return new Color(vodnjak(this.podizbori[0].eval(x,y).getRed()),vodnjak(this.podizbori[0].eval(x,y).getGreen()),vodnjak(this.podizbori[0].eval(x,y).getBlue()));
	}

}
