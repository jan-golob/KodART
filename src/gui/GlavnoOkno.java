package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import abstraktnost.PrviIzbor;

import java.awt.GridBagLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class GlavnoOkno extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	
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
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panel.setBackground(izbirabarve.eval(4, 3));
		contentPane.add(panel, gbc_panel);
		
		JButton btnNovo = new JButton("Novo risanje");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 1;
		btnNovo.addActionListener(this);
		contentPane.add(btnNovo, gbc_btnNovo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			izbirabarve = new PrviIzbor(5,3);
			panel.setBackground(izbirabarve.eval(4, 3));
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 300);
	}

}
