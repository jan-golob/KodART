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
			int maxGlobina = av.nextInt(stopnja);
			for (int i = 0; i < stopnja; i++) {
				if (i == maxGlobina) {
					podizbori[i] = nakBarva2(kompleksnost);
				}
				else {
					int k = av.nextInt(kompleksnost);
					if (k == 0) {
						podizbori[i] = nakBarva1();
					}
					else {
						podizbori[i] = nakBarva2(k);
					}
				}
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
	
	private IzborBarve nakBarva2(int taKompleksnost) {
		Random av = new Random();
		int j = av.nextInt(this.nastavitve.getKomplicirinaIzbire().length);
		int r = this.nastavitve.getKomplicirinaIzbire()[j];
		IzborBarve barva = null;
		if (r == 0) {
			barva = new Vsota(taKompleksnost, this.nastavitve);
		}
		if (r == 1) {
			barva = new Modul(taKompleksnost, this.nastavitve);
		}
		if (r == 2) {
			barva = new Produkt(taKompleksnost, this.nastavitve);
		}
		if (r == 3) {
			barva = new Level(taKompleksnost, this.nastavitve);
		}
		if (r == 4) {
			barva = new Sinus(taKompleksnost, this.nastavitve);
		}
		if (r == 5) {
			barva = new Sotor(taKompleksnost, this.nastavitve);
		}
		if (r == 6) {
			barva = new Vodnjak(taKompleksnost, this.nastavitve);
		}
		if (r == 7) {
			barva = new Mesanje(taKompleksnost, this.nastavitve);
		}
		return barva;
	}
}
