package Abstraktnost;
import java.awt.Color;


public abstract class IzborBarve {
	public abstract Color eval(float x, float y);
	
	public int stopnja;
	protected IzborBarve[] podizbori;
	
	public IzborBarve(int stopnja) {
		this.stopnja = stopnja;
		this.podizbori = new IzborBarve[stopnja];
	}
	
	
}
