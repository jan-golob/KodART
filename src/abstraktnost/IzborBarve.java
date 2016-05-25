package abstraktnost;
import java.awt.Color;
import java.util.Random;


public abstract class IzborBarve {
	public abstract Color eval(float x, float y);
	
	public int kompleksnost;
	protected IzborBarve[] podizbori;
	private int[] potencialneIzbire;
	
	public IzborBarve(int stopnja, int kompleksnost, int[] potIzb) {
		this.kompleksnost = kompleksnost;
		this.podizbori = new IzborBarve[stopnja];
		this.potencialneIzbire = potIzb;
		if (kompleksnost == 0) {
			for (int i = 0; i < stopnja; i++) {
				podizbori[i] = nakBarva1();
			}
		}
		else {
			for (int i = 0; i < stopnja; i++) {
				podizbori[i] = nakBarva2();
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
	
	private IzborBarve nakBarva2() {
		Random av = new Random();
		int j = av.nextInt(this.potencialneIzbire.length);
		int r = this.potencialneIzbire[j];
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
			barva = new Vsota(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 4) {
			barva = new Modul(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 5) {
			barva = new Produkt(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 6) {
			barva = new Level(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 7) {
			barva = new Sinus(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 8) {
			barva = new Sotor(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 9) {
			barva = new Vodnjak(this.kompleksnost, this.potencialneIzbire);
		}
		if (r == 10) {
			barva = new Mesanje(this.kompleksnost, this.potencialneIzbire);
		}
		return barva;
	}
}
