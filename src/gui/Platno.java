package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import abstraktnost.PrviIzbor;

@SuppressWarnings("serial")
public class Platno extends JPanel implements ActionListener{
	
	private PrviIzbor izbirabarve;
	
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
		izbirabarve = new PrviIzbor(5, 3);
		for (int x = 0;x < 200;x++) {
			for(int y = 0;y < 300;y++){
				g.setColor(izbirabarve.eval(x, y));
				g.drawLine(x, y, x, y);
			}
		}
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		super.repaint();
	}
}
