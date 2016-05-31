package gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import abstraktnost.Info;

public class NastavitveOkno implements ActionListener{
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Info info;

	public NastavitveOkno(Info info1) {
		info = info1;
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JCheckBox checkBox = new JCheckBox("");
		GridBagConstraints gbc_checkBox = new GridBagConstraints();
		gbc_checkBox.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox.gridx = 1;
		gbc_checkBox.gridy = 1;
		contentPane.add(checkBox, gbc_checkBox);
		
		JLabel lblAbscisa = new JLabel("Abscisa");
		GridBagConstraints gbc_lblAbscisa = new GridBagConstraints();
		gbc_lblAbscisa.insets = new Insets(0, 0, 5, 5);
		gbc_lblAbscisa.gridx = 2;
		gbc_lblAbscisa.gridy = 1;
		contentPane.add(lblAbscisa, gbc_lblAbscisa);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_6 = new GridBagConstraints();
		gbc_checkBox_6.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_6.gridx = 3;
		gbc_checkBox_6.gridy = 1;
		contentPane.add(checkBox_6, gbc_checkBox_6);
		
		JLabel lblPovprecje = new JLabel("Povprecje");
		GridBagConstraints gbc_lblPovprecje = new GridBagConstraints();
		gbc_lblPovprecje.insets = new Insets(0, 0, 5, 5);
		gbc_lblPovprecje.gridx = 4;
		gbc_lblPovprecje.gridy = 1;
		contentPane.add(lblPovprecje, gbc_lblPovprecje);
		
		JLabel lblSirina = new JLabel("sirina");
		GridBagConstraints gbc_lblSirina = new GridBagConstraints();
		gbc_lblSirina.anchor = GridBagConstraints.EAST;
		gbc_lblSirina.insets = new Insets(0, 0, 5, 5);
		gbc_lblSirina.gridx = 7;
		gbc_lblSirina.gridy = 1;
		contentPane.add(lblSirina, gbc_lblSirina);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 8;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		textField.setText(Integer.toString(info.getX()));
		
		JCheckBox checkBox_1 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_1 = new GridBagConstraints();
		gbc_checkBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_1.gridx = 1;
		gbc_checkBox_1.gridy = 2;
		contentPane.add(checkBox_1, gbc_checkBox_1);
		
		JLabel lblKonstanta = new JLabel("Konstanta");
		GridBagConstraints gbc_lblKonstanta = new GridBagConstraints();
		gbc_lblKonstanta.insets = new Insets(0, 0, 5, 5);
		gbc_lblKonstanta.gridx = 2;
		gbc_lblKonstanta.gridy = 2;
		contentPane.add(lblKonstanta, gbc_lblKonstanta);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_7 = new GridBagConstraints();
		gbc_checkBox_7.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_7.gridx = 3;
		gbc_checkBox_7.gridy = 2;
		contentPane.add(checkBox_7, gbc_checkBox_7);
		
		JLabel lblProdukt = new JLabel("Produkt");
		GridBagConstraints gbc_lblProdukt = new GridBagConstraints();
		gbc_lblProdukt.insets = new Insets(0, 0, 5, 5);
		gbc_lblProdukt.gridx = 4;
		gbc_lblProdukt.gridy = 2;
		contentPane.add(lblProdukt, gbc_lblProdukt);
		
		JLabel lblVisina = new JLabel("visina");
		GridBagConstraints gbc_lblVisina = new GridBagConstraints();
		gbc_lblVisina.anchor = GridBagConstraints.EAST;
		gbc_lblVisina.insets = new Insets(0, 0, 5, 5);
		gbc_lblVisina.gridx = 7;
		gbc_lblVisina.gridy = 2;
		contentPane.add(lblVisina, gbc_lblVisina);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 8;
		gbc_textField_1.gridy = 2;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		textField_1.setText(Integer.toString(info.getY()));
		
		JCheckBox checkBox_2 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_2 = new GridBagConstraints();
		gbc_checkBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_2.gridx = 1;
		gbc_checkBox_2.gridy = 3;
		contentPane.add(checkBox_2, gbc_checkBox_2);
		
		JLabel lblLevel = new JLabel("Level");
		GridBagConstraints gbc_lblLevel = new GridBagConstraints();
		gbc_lblLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblLevel.gridx = 2;
		gbc_lblLevel.gridy = 3;
		contentPane.add(lblLevel, gbc_lblLevel);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_8 = new GridBagConstraints();
		gbc_checkBox_8.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_8.gridx = 3;
		gbc_checkBox_8.gridy = 3;
		contentPane.add(checkBox_8, gbc_checkBox_8);
		
		JLabel lblSinus = new JLabel("Sinus");
		GridBagConstraints gbc_lblSinus = new GridBagConstraints();
		gbc_lblSinus.insets = new Insets(0, 0, 5, 5);
		gbc_lblSinus.gridx = 4;
		gbc_lblSinus.gridy = 3;
		contentPane.add(lblSinus, gbc_lblSinus);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_3 = new GridBagConstraints();
		gbc_checkBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_3.gridx = 1;
		gbc_checkBox_3.gridy = 4;
		contentPane.add(checkBox_3, gbc_checkBox_3);
		
		JLabel lblMesanje = new JLabel("Mesanje");
		GridBagConstraints gbc_lblMesanje = new GridBagConstraints();
		gbc_lblMesanje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMesanje.gridx = 2;
		gbc_lblMesanje.gridy = 4;
		contentPane.add(lblMesanje, gbc_lblMesanje);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_9 = new GridBagConstraints();
		gbc_checkBox_9.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_9.gridx = 3;
		gbc_checkBox_9.gridy = 4;
		contentPane.add(checkBox_9, gbc_checkBox_9);
		
		JLabel lblSotor = new JLabel("Sotor");
		GridBagConstraints gbc_lblSotor = new GridBagConstraints();
		gbc_lblSotor.insets = new Insets(0, 0, 5, 5);
		gbc_lblSotor.gridx = 4;
		gbc_lblSotor.gridy = 4;
		contentPane.add(lblSotor, gbc_lblSotor);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_4 = new GridBagConstraints();
		gbc_checkBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_4.gridx = 1;
		gbc_checkBox_4.gridy = 5;
		contentPane.add(checkBox_4, gbc_checkBox_4);
		
		JLabel lblModul = new JLabel("Modul");
		GridBagConstraints gbc_lblModul = new GridBagConstraints();
		gbc_lblModul.insets = new Insets(0, 0, 5, 5);
		gbc_lblModul.gridx = 2;
		gbc_lblModul.gridy = 5;
		contentPane.add(lblModul, gbc_lblModul);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_10 = new GridBagConstraints();
		gbc_checkBox_10.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_10.gridx = 3;
		gbc_checkBox_10.gridy = 5;
		contentPane.add(checkBox_10, gbc_checkBox_10);
		
		JLabel lblVodnjak = new JLabel("Vodnjak");
		GridBagConstraints gbc_lblVodnjak = new GridBagConstraints();
		gbc_lblVodnjak.insets = new Insets(0, 0, 5, 5);
		gbc_lblVodnjak.gridx = 4;
		gbc_lblVodnjak.gridy = 5;
		contentPane.add(lblVodnjak, gbc_lblVodnjak);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_5 = new GridBagConstraints();
		gbc_checkBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_5.gridx = 1;
		gbc_checkBox_5.gridy = 6;
		contentPane.add(checkBox_5, gbc_checkBox_5);
		
		JLabel lblOrdinata = new JLabel("Ordinata");
		GridBagConstraints gbc_lblOrdinata = new GridBagConstraints();
		gbc_lblOrdinata.insets = new Insets(0, 0, 5, 5);
		gbc_lblOrdinata.gridx = 2;
		gbc_lblOrdinata.gridy = 6;
		contentPane.add(lblOrdinata, gbc_lblOrdinata);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		GridBagConstraints gbc_checkBox_11 = new GridBagConstraints();
		gbc_checkBox_11.insets = new Insets(0, 0, 5, 5);
		gbc_checkBox_11.gridx = 3;
		gbc_checkBox_11.gridy = 6;
		contentPane.add(checkBox_11, gbc_checkBox_11);
		
		JLabel lblVsota = new JLabel("Vsota");
		GridBagConstraints gbc_lblVsota = new GridBagConstraints();
		gbc_lblVsota.insets = new Insets(0, 0, 5, 5);
		gbc_lblVsota.gridx = 4;
		gbc_lblVsota.gridy = 6;
		contentPane.add(lblVsota, gbc_lblVsota);
		
		JButton btnShrani = new JButton("Shrani");
		GridBagConstraints gbc_btnShrani = new GridBagConstraints();
		gbc_btnShrani.insets = new Insets(0, 0, 0, 5);
		gbc_btnShrani.gridx = 5;
		gbc_btnShrani.gridy = 7;
		contentPane.add(btnShrani, gbc_btnShrani);
		btnShrani.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		info.setSirina(Integer.parseInt(textField.getText()));
		info.setVisina(Integer.parseInt(textField_1.getText()));
		
	}

}
