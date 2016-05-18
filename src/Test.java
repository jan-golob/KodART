import java.awt.Color;

import abstraktnost.Povprecje;

public class Test {

	public static void main(String[] args) {
		Color prva = Color.ORANGE;
		Color druga = Color.BLUE;
		Color zmesana = Povprecje.povprecje(prva,druga,(float) 0.5);
		System.out.println(prva);
		System.out.println(druga);
		System.out.println(zmesana);


	}

}
