package abstraktnost;

public class Info {
	private int sirina;
	private int visina;
	private int[] enostavneIzbire;
	private int[] komplicirinaIzbire;
	private boolean prah;
	
	public Info(int sirina, int visina,
			int[] enostavneIzbire, int[] komplicirinaIzbire ) {
		this.sirina = sirina;
		this.visina = visina;
		this.enostavneIzbire = enostavneIzbire;
		this.komplicirinaIzbire = komplicirinaIzbire;
		this.prah = new Boolean(false);
	}
	public boolean isPrah() {
		return prah;
	}
	public void setPrah(boolean prah) {
		this.prah = prah;
	}

	public int[] getEnostavneIzbire() {
		return enostavneIzbire;
	}
	
	public void setEnostavneIzbire(int[] enostavneIzbire) {
		this.enostavneIzbire = enostavneIzbire;
	}
	
	public int[] getKomplicirinaIzbire() {
		return komplicirinaIzbire;
	}
	
	public void setKomplicirinaIzbire(int[] komplicirinaIzbire) {
		this.komplicirinaIzbire = komplicirinaIzbire;
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
