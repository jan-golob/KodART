package Abstraktnost;

import java.awt.Color;

public class Povprecje {
	
	float utez;
	Color barva1;
	Color barva2;
	Color barva3;
	
	public Povprecje(float utez, Color barva1, Color barva2) {
		super();
		this.utez = utez;
		this.barva1 = barva1;
		this.barva2 = barva2;
		this.barva3 = povprecje();
		
	}
	
	
	
	/**
	 * @param prva
	 * @param druga
	 * @param utez
	 * @return Color
	 * Sprejme dve barvi in vrne mešanico teh dveh barv glede na utez
	 */
	public Color povprecje(){
		float[] prva_barva = new float[4];
		barva1.getRGBComponents(prva_barva);
		
		float[] druga_barva = new float[4];
		barva2.getRGBComponents(druga_barva);
		
		Color nova = new Color(utez*prva_barva[0] + (1-utez)*druga_barva[0], utez*prva_barva[1] + (1-utez)*druga_barva[1], utez*prva_barva[2] + (1-utez)*druga_barva[2]);
		
		return nova;
		
	}

}
