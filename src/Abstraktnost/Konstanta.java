package Abstraktnost;

import java.awt.Color;
import java.util.Random;

public class Konstanta extends IzborBarve {

	public Konstanta() {
		super(0);
	}

	@Override
	public Color eval(float x, float y) {
		Random j = new Random();
		return new Color(j.nextFloat(),j.nextFloat(),j.nextFloat());
	}

}
