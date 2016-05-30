package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NastavitveOkno {
	
	private JPanel contentPane;

	public NastavitveOkno() {
		JFrame newFrame = new JFrame();
		newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		newFrame.setVisible(true);
		
		newFrame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newFrame.setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		
		JCheckBox CB = new JCheckBox("Novo risanje");
		GridBagConstraints gbc_CB = new GridBagConstraints();
		gbc_CB.gridx = 0;
		gbc_CB.gridy = 1;
		contentPane.add(CB, gbc_CB);
		
		JTextField sirina = new JTextField(10);
		GridBagConstraints gbc_sirina = new GridBagConstraints();
		gbc_sirina.gridx = 0;
		gbc_sirina.gridy = 2;
		contentPane.add(sirina, gbc_sirina);
	}

}
