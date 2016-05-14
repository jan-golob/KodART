import java.awt.Color;
import Abstraktnost.Povprecje;;

public class Test {

	public static void main(String[] args) {
		Color prva = Color.ORANGE;
		Color druga = Color.BLUE;
		Povprecje nova = new Povprecje((float) 0.5,prva,druga);
		Color zmesana = nova.povprecje();
		System.out.println(prva);
		System.out.println(druga);
		System.out.println(zmesana);

	}

}
