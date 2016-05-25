package abstraktnost;

import java.awt.Color;
import java.util.Random;

public class Level extends IzborBarve {
	private int r;
	private int g;
	private int b;

	public Level(int kompleksnost, int[] podIz) {
		super(3, kompleksnost-1, podIz);
	}

	@Override
	public Color eval(float x, float y) {
		Color level = this.podizbori[0].eval(x, y);
		Color c1 = this.podizbori[1].eval(x, y);
		Color c2 = this.podizbori[2].eval(x, y);
		Random j= new Random();
		
		float meja = j.nextFloat()*256;
		if (level.getRed() > meja){
			r = c1.getRed();
		}
		else{
			r = c2.getRed();
		}
		
		if (level.getGreen() > meja){
			r = c1.getGreen();
		}
		else{
			r = c2.getGreen();
		}
		
		if (level.getBlue() > meja){
			r = c1.getBlue();
		}
		else{
			r = c2.getBlue();
		}
		return new Color(r, g, b);
	}

}
