package abstraktnost;
import java.awt.Color;
import java.util.Random;


public abstract class IzborBarve {
	public abstract Color eval(float x, float y);
	
	public int kompleksnost;
	protected IzborBarve[] podizbori;
	protected Info nastavitve;
	
	public IzborBarve(int stopnja, int kompleksnost, Info nast) {
		this.kompleksnost = kompleksnost;
		this.nastavitve = nast;
		this.podizbori = new IzborBarve[stopnja];
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
	
	
	public IzborBarve(Info nast) {
		this.kompleksnost = 0;
		this.nastavitve = nast;
	}



	private IzborBarve nakBarva1() {
		Random av = new Random();
		int r = av.nextInt(3);
		IzborBarve barva = null;
		if (r == 0) {
			 barva = new Abscisa(this.nastavitve);
		}
		if (r == 1) {
			barva = new Ordinata(this.nastavitve);
		}
		if (r == 2) {
			barva = new Konstanta(this.nastavitve);
		}
		return barva;
	}
	
	private IzborBarve nakBarva2() {
		Random av = new Random();
		int j = av.nextInt(this.nastavitve.getPotencialne().length);
		int r = this.nastavitve.getPotencialne()[j];
		IzborBarve barva = null;
		if (r == 0) {
			barva = new Abscisa(this.nastavitve);
		}
		if (r == 1) {
			barva = new Ordinata(this.nastavitve);
		}
		if (r == 2) {
			barva = new Konstanta(this.nastavitve);
		}
		if (r == 3) {
			barva = new Vsota(this.kompleksnost, this.nastavitve);
		}
		if (r == 4) {
			barva = new Modul(this.kompleksnost, this.nastavitve);
		}
		if (r == 5) {
			barva = new Produkt(this.kompleksnost, this.nastavitve);
		}
		if (r == 6) {
			barva = new Level(this.kompleksnost, this.nastavitve);
		}
		if (r == 7) {
			barva = new Sinus(this.kompleksnost, this.nastavitve);
		}
		if (r == 8) {
			barva = new Sotor(this.kompleksnost, this.nastavitve);
		}
		if (r == 9) {
			barva = new Vodnjak(this.kompleksnost, this.nastavitve);
		}
		if (r == 10) {
			barva = new Mesanje(this.kompleksnost, this.nastavitve);
		}
		return barva;
	}
}
