package abstraktnost;

import java.awt.Color;

public class Sotor extends IzborBarve {

	public Sotor(int kompleksnost) {
		super(1,kompleksnost -1);
	}
	
	private float sotor(float x){
		return 1 - 2 * Math.abs(x);
	}

	@Override
	public Color eval(float x, float y) {
		return new Color(sotor(this.podizbori[0].eval(x,y).getRed()),sotor(this.podizbori[0].eval(x,y).getGreen()),sotor(this.podizbori[0].eval(x,y).getBlue()));
	}

}
