package abstraktnost;

import java.awt.Color;

public class Sotor extends IzborBarve {

	public Sotor(int kompleksnost, Info nast) {
		super(1,kompleksnost -1, nast);
	}
	
	private float sotor(float x){
		return Math.abs(1 - 2 * Math.abs(x/256));
	}

	@Override
	public Color eval(float x, float y) {
		float r = sotor(this.podizbori[0].eval(x,y).getRed());
		float g = sotor(this.podizbori[0].eval(x,y).getGreen());
		float b = sotor(this.podizbori[0].eval(x,y).getBlue());
		return new Color(r,g,b);
	}

}
