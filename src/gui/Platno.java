package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import abstraktnost.PrviIzbor;

@SuppressWarnings("serial")
public class Platno extends JPanel implements ActionListener{
	
	private PrviIzbor izbirabarve;
	private BufferedImage slika = new BufferedImage(200,300,BufferedImage.TYPE_INT_ARGB);
	
	public Platno(GlavnoOkno glavno) {
		super();
		this.setBackground(Color.white);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 300);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		izbirabarve = new PrviIzbor(15, 3);
		for (int x = 0;x < 200;x++) {
			for(int y = 0;y < 300;y++){
				slika.setRGB(x, y, izbirabarve.eval(x, y).getRGB());
			}
		}
		g.drawImage(slika, 0, 0, null);
		Shrani.shrani(slika,"C:/Users/Miha/Desktop","test.png");
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.repaint();
	}
}
