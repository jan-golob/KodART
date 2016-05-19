package abstraktnost;

import java.awt.Color;

public class Sotor extends IzborBarve {

	public Sotor(int kompleksnost) {
		super(1,kompleksnost -1);
	}
	
	private float sotor(float x){
		return Math.abs(1 - 2 * Math.abs(x/256));
	}

	@Override
	public Color eval(float x, float y) {
		float r = sotor(this.podizbori[0].eval(x,y).getRed());
		float g = sotor(this.podizbori[0].eval(x,y).getGreen());
		float b = sotor(this.podizbori[0].eval(x,y).getBlue());
		System.out.println("sotor: "+r +"," + g +","+b);
		return new Color(r,g,b);
	}

}
