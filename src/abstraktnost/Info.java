package abstraktnost;

public class Info {
	private int sirina;
	private int visina;
	private int[] potencialneIzbire;
	
	public Info(int sirina, int visina,
			int[] potencialneIzbire) {
		this.sirina = 0;
		this.visina = 0;
		this.potencialneIzbire = potencialneIzbire;
	}
	public int[] getPotencialne() {
		return potencialneIzbire;
	}
	
	public int getY() {
		return visina;
	}

	public int getX() {
		return sirina;
	}
}
