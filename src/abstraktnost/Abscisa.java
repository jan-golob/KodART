package abstraktnost;

import java.awt.Color;

public class Abscisa extends IzborBarve {

	@Override
	public Color eval(float x, float y) {
		float n = (float) (x/(nastavitve.getX()+10));
		System.out.println("" + nastavitve.getX()+ " "+ x +  " " + n);
		return new Color(n,n,n);
	}

	public Abscisa(Info nast) {
		super(nast);
	}

}
