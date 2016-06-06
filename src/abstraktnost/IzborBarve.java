package abstraktnost;
import java.awt.Color;
import java.util.Random;


public abstract class IzborBarve {
	public abstract Color eval(float x, float y);
	
	private Random av;
	public int kompleksnost;
	protected IzborBarve[] podizbori;
	protected Info nastavitve;
	
	public IzborBarve(int stopnja, int kompleksnost, Info nast) {
		this.av = new Random();
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
		int j = av.nextInt(nastavitve.getEnostavneIzbire().length);
		int r = nastavitve.getEnostavneIzbire()[j];
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
		int j = av.nextInt(this.nastavitve.getKomplicirinaIzbire().length);
		int r = this.nastavitve.getKomplicirinaIzbire()[j];
		IzborBarve barva = null;
		if (r == 0) {
			barva = new Vsota(this.kompleksnost, this.nastavitve);
		}
		if (r == 1) {
			barva = new Modul(this.kompleksnost, this.nastavitve);
		}
		if (r == 2) {
			barva = new Produkt(this.kompleksnost, this.nastavitve);
		}
		if (r == 3) {
			barva = new Level(this.kompleksnost, this.nastavitve);
		}
		if (r == 4) {
			barva = new Sinus(this.kompleksnost, this.nastavitve);
		}
		if (r == 5) {
			barva = new Sotor(this.kompleksnost, this.nastavitve);
		}
		if (r == 6) {
			barva = new Vodnjak(this.kompleksnost, this.nastavitve);
		}
		if (r == 7) {
			barva = new Mesanje(this.kompleksnost, this.nastavitve);
		}
		return barva;
	}
}
