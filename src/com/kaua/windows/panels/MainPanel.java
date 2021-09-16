package com.kaua.windows.panels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private JLabel fundo, person;

	public MainPanel() {
		init();
	}

	public void init() {
		setLayout(null);
		
		person = new JLabel(new ImageIcon("res//Guri01.gif"));
		person.setBounds(305, 165, 64, 64);
		add(person);

		fundo = new JLabel(new ImageIcon("res//LoadingBackgroundv2.png"));
		fundo.setBounds(0, 0, 677, 260);
		add(fundo);
	}

}
