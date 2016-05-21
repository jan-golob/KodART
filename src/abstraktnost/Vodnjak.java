package abstraktnost;

import java.awt.Color;

public class Vodnjak extends IzborBarve {

	public Vodnjak(int kompleksnost) {
		super(1, kompleksnost - 1);
	}
	
	private float vodnak(float x){
		return Math.abs((float) (1 - 2 / Math.pow((1 + x*x),8)));
		
	}

	@Override
	public Color eval(float x, float y) {
		float r = vodnak(this.podizbori[0].eval(x,y).getRed());
		float g = vodnak(this.podizbori[0].eval(x,y).getGreen());
		float b = vodnak(this.podizbori[0].eval(x,y).getBlue());
		return new Color(r,g,b);
	}

}
