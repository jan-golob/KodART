package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import abstraktnost.Info;

public class NastavitveOkno implements ActionListener{
	
	private JPanel contentPane;
	private Info info;
	private JTextField sirina;
	private JTextField visina;

	public NastavitveOkno(Info info1) {
		info = info1;
		JFrame newFrame = new JFrame();
		newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		newFrame.setVisible(true);
		
		newFrame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newFrame.setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		
		JCheckBox CB = new JCheckBox("Sinus");
		GridBagConstraints gbc_CB = new GridBagConstraints();
		gbc_CB.gridx = 0;
		gbc_CB.gridy = 1;
		contentPane.add(CB, gbc_CB);
		

		sirina = new JTextField(10);
		GridBagConstraints gbc_sirina = new GridBagConstraints();
		gbc_sirina.gridx = 0;
		gbc_sirina.gridy = 2;
		contentPane.add(sirina, gbc_sirina);
		
		visina = new JTextField(10);
		GridBagConstraints gbc_visina = new GridBagConstraints();
		gbc_visina.gridx = 1;
		gbc_visina.gridy = 2;
		contentPane.add(visina, gbc_visina);
		
		JButton btnShrani = new JButton("Shrani");
		GridBagConstraints gbc_btnShrani = new GridBagConstraints();
		gbc_btnShrani.gridx = 0;
		gbc_btnShrani.gridy = 1;
		contentPane.add(btnShrani, gbc_btnShrani);
		btnShrani.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		info.setSirina(Integer.parseInt(sirina.getText()));
		info.setVisina(Integer.parseInt(visina.getText()));
		
	}

}
