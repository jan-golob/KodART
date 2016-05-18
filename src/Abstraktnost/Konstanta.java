package Abstraktnost;

import java.awt.Color;
import java.util.Random;

public class Konstanta extends IzborBarve {

	private Color nakBarva; 
	public Konstanta() {
		super();
		Random j = new Random();
		nakBarva = new Color(j.nextFloat(),j.nextFloat(),j.nextFloat());
	}

	@Override
	public Color eval(float x, float y) {
		return nakBarva;
	}

}
