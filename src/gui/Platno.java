package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import abstraktnost.Info;
import abstraktnost.PrviIzbor;

@SuppressWarnings("serial")
public class Platno extends JPanel implements ActionListener{
	private int sirina;
	private int visina;
	private Info nast;
	
	private PrviIzbor izbirabarve;
	protected BufferedImage slika;
	private GlavnoOkno glavnoOkno;
	
	private void nastaviXY() {
		sirina = nast.getX();
		visina = nast.getY();
	}
	
	public Platno(GlavnoOkno glavno, Info nast) {
		super();
		this.setBackground(Color.white);
		this.glavnoOkno = glavno;
		this.nast = nast;
		nastaviXY();
		slika = new BufferedImage(sirina, visina,BufferedImage.TYPE_INT_ARGB);
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(sirina, visina);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(slika, 0, 0, null);
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.glavnoOkno.btnNovo()) {
			narisinovo();
			super.repaint();
			}
	}
	
	
	private void narisinovo(){
		izbirabarve = new PrviIzbor(5, 3, new Info(sirina, visina, Checkbox.kateri()));
		for (int x = 0;x < sirina;x++) {
			for(int y = 0;y < visina;y++){
				slika.setRGB(x, y, izbirabarve.eval(x, y).getRGB());
			}
		}
	}
}
