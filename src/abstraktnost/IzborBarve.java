package abstraktnost;
import java.awt.Color;
import java.util.Random;


public abstract class IzborBarve {
	public abstract Color eval(float x, float y);
	
	public int kompleksnost;
	protected IzborBarve[] podizbori;
	
	public IzborBarve(int stopnja, int kompleksnost) {
		this.kompleksnost = kompleksnost;
		this.podizbori = new IzborBarve[stopnja];
		if (kompleksnost == 0) {
			for (int i = 0; i < stopnja; i++) {
				podizbori[i] = nakBarva1();
			}
		}
		else {
			for (int i = 0; i < stopnja; i++) {
				podizbori[i] = nakBarva2(kompleksnost);
			}
		}
	}
	
	
	public IzborBarve() {
		this.kompleksnost = 0;
	}



	private IzborBarve nakBarva1() {
		Random av = new Random();
		int r = av.nextInt(3);
		IzborBarve barva = null;
		if (r == 0) {
			 barva = new Abscisa();
		}
		if (r == 1) {
			barva = new Ordinata();
		}
		if (r == 2) {
			barva = new Konstanta();
		}
		return barva;
	}
	
	private IzborBarve nakBarva2(int kompleks) {
		Random av = new Random();
		int r = av.nextInt(7);
		IzborBarve barva = null;
		if (r == 0) {
			 barva = new Abscisa();
		}
		if (r == 1) {
			barva = new Ordinata();
		}
		if (r == 2) {
			barva = new Konstanta();
		}
		if (r == 3) {
			 barva = new Vsota(kompleks);
		}
		if (r == 4) {
			 barva = new Modul(kompleks);
		}
		if (r == 5) {
			 barva = new Produkt(kompleks);
		}
		if (r == 6) {
			 barva = new Level(kompleks);
		}
		if (r == 7) {
			 barva = new Sinus(kompleks);
		}
		if (r == 8) {
			 barva = new Sotor(kompleks);
		}
		if (r == 9) {
			 barva = new Vodnjak(kompleks);
		}
		
		return barva;
	}
}
