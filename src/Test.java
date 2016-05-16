import java.awt.Color;
import Abstraktnost.Povprecje;;

public class Test {

	public static void main(String[] args) {
		Color prva = Color.ORANGE;
		Color druga = Color.BLUE;
		Color zmesana = Povprecje.povprecje(prva,druga,(float) 0.5);
		System.out.println(prva);
		System.out.println(druga);
		System.out.println(zmesana);
		float ab = (float) 0.33;
		Color ja = new Color(ab,ab,ab);
		System.out.println(ja);

	}

}
