package abstraktnost;

import java.awt.Color;

public class Povprecje {	
	
	/**
	 * @param prva
	 * @param druga
	 * @param utez
	 * @return 
	 * @return Color
	 * Sprejme dve barvi in vrne mešanico teh dveh barv glede na utez
	 */
	public static Color povprecje(Color barva1, Color barva2, float utez){
		float[] prva_barva = new float[4];
		barva1.getRGBComponents(prva_barva);
		
		float[] druga_barva = new float[4];
		barva2.getRGBComponents(druga_barva);
		float r =utez*prva_barva[0] + (1-utez)*druga_barva[0];
		float g = utez*prva_barva[1] + (1-utez)*druga_barva[1];
		float b =  utez*prva_barva[2] + (1-utez)*druga_barva[2];
		System.out.println("povprecje: "+r +"," + g +","+b);
		Color nova = new Color(r,g,b);
		
		return nova;
		
	}

}
