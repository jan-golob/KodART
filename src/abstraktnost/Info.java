package abstraktnost;

public class Info {
	private int sirina;
	private int visina;
	private int[] potencialneIzbire;
	
	public Info(int sirina, int visina,
			int[] potencialneIzbire) {
		this.sirina = sirina;
		this.visina = visina;
		this.potencialneIzbire = potencialneIzbire;
	}
	public int[] getPotencialne() {
		return potencialneIzbire;
	}
	
	public void setPotencialne(int[] izbor) {
		this.potencialneIzbire = izbor;
	}
	
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}
	
	public int getSirina() {
		return sirina;
	}
	
	public void setVisina(int visina) {
		this.visina = visina;
	}
	
	public int getVisina() {
		return visina;
	}
}
