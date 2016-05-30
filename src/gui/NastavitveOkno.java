package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
		
		JButton btnNovo = new JButton("Novo risanje");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 1;
		contentPane.add(btnNovo, gbc_btnNovo);
	}

}
