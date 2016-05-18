package abstraktnost;
import java.awt.Color;


public class Ordinata extends IzborBarve {

	public Ordinata() {
		super();
	}

	@Override
	public Color eval(float x, float y) {
		int n = (int) (y%255);
		return new Color(n,n,n);
	

	}

}
