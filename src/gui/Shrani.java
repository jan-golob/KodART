package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Shrani {
	
	public static void shrani(BufferedImage slika, String lokacija, String ime){
		String pot = lokacija + "/" + ime; 
	File f = new File(pot);
	try {
		ImageIO.write(slika, "PNG", f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
