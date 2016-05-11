package Abstraktnost;
import java.awt.Color;


public class ordinata implements IzborBarve {

	@Override
	public Color eval(float x, float y) {
		return new Color(x,x,x);
	}

}
