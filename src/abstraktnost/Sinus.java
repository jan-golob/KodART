package abstraktnost;

import java.awt.Color;
import java.util.Random;

public class Sinus extends IzborBarve {

	float faza;
	float frekvenca;


	float lower = 0;
	float upper = (float) Math.PI;

	float lower1 = 1;
	float upper1 = 6;


	Random j = new Random();
	public Sinus(int kompleksnost, int[] podIz) {
		super(1,kompleksnost -1, podIz);
		faza = (float) (Math.random() * (upper - lower) + lower);
		frekvenca = (float) (Math.random() * (upper1 - lower1) + lower1);
	}
	@Override
	public Color eval(float x, float y) {
		float r =(float) (Math.sin(faza + frekvenca*(this.podizbori[0].eval(x,y).getRed()))+1)/2;
		float g = (float) (Math.sin(faza + frekvenca*(this.podizbori[0].eval(x,y).getGreen()))+1)/2;
		float b = (float) (Math.sin(faza + frekvenca*(this.podizbori[0].eval(x,y).getBlue()))+1)/2;
		return new Color(r,g,b);
	}

}
