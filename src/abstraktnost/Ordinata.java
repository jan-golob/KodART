package abstraktnost;
import java.awt.Color;


public class Ordinata extends IzborBarve {

	public Ordinata(Info nast) {
		super(nast);
	}

	@Override
	public Color eval(float x, float y) {
		float n = (float) (y/(nastavitve.getVisina()+1));
		return new Color(n,n,n);
	

	}

}
