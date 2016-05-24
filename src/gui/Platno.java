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
	protected BufferedImage slika = new BufferedImage(200,300,BufferedImage.TYPE_INT_ARGB);
	private GlavnoOkno glavnoOkno;
	
	public Platno(GlavnoOkno glavno) {
		super();
		this.setBackground(Color.white);
		this.glavnoOkno = glavno;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(200, 300);
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
		else if (e.getSource() == this.glavnoOkno.mntmShrani()) {
			Shrani.izbiraFolderja(slika);
			System.out.println("shrani");
			super.repaint();
		}
	}
	
	
	private void narisinovo(){
		izbirabarve = new PrviIzbor(15, 3);
		for (int x = 0;x < 200;x++) {
			for(int y = 0;y < 300;y++){
				slika.setRGB(x, y, izbirabarve.eval(x, y).getRGB());
			}
		}
	}
}
