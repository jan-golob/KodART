package abstraktnost;

public class Info {
	private int sirina;
	private int visina;
	private int[] potencialneIzbire;
	private boolean prah;
	
	public Info(int sirina, int visina,
			int[] potencialneIzbire) {
		this.sirina = sirina;
		this.visina = visina;
		this.potencialneIzbire = potencialneIzbire;
		this.prah = new Boolean(true);
	}
	public boolean isPrah() {
		return prah;
	}
	public void setPrah(boolean prah) {
		this.prah = prah;
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
