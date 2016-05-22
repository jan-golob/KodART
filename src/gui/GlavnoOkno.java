package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import abstraktnost.PrviIzbor;

@SuppressWarnings("serial")
public class GlavnoOkno extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Platno platno;
	
	PrviIzbor izbirabarve = new PrviIzbor(5, 3);

	/**
	 * Create the frame.
	 */
	public GlavnoOkno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		
		platno = new Platno(this);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		platno.setBackground(izbirabarve.eval(4, 3));
		contentPane.add(platno, gbc_panel);
		
		JButton btnNovo = new JButton("Novo risanje");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 1;
		btnNovo.addActionListener(this);
		contentPane.add(btnNovo, gbc_btnNovo);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
			platno.repaint();
		
	}
	
}
