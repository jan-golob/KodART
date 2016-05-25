package abstraktnost;
import java.awt.Color;


public class Ordinata extends IzborBarve {

	public Ordinata(Info nast) {
		super(nast);
	}

	@Override
	public Color eval(float x, float y) {
		float n = (float) (y/(nastavitve.getY()+10));
		System.out.println(""+ nastavitve.getX()+ " " + y + " " + n);
		return new Color(n,n,n);
	

	}

}
