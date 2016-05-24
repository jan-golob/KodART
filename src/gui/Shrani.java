package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

public class Shrani {
	
	final static JFileChooser fileChooser = new JFileChooser();
	
	public static void izbiraFolderja(BufferedImage slika){
		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.APPROVE_OPTION) {
			File selectedFile = fileChooser.getSelectedFile();
		    shrani(slika,selectedFile.getAbsolutePath());
		}
	}
	
	public static void shrani(BufferedImage slika, String ime){
	File f = new File(ime);
	try {
		ImageIO.write(slika, "PNG", f);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
