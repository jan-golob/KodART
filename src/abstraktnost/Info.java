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
	
	public int getY() {
		return visina;
	}

	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}
	public int getX() {
		return sirina;
	}
	
}
