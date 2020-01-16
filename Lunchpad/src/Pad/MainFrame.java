package Pad;

import java.awt.*;
import javax.swing.*;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		setTitle("JMusicpad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout(10, 10));
		c.setBackground(Color.black);
		
		JPanel j1 = new JPanel(new GridLayout(1, 4, 10, 10));
		j1.setBackground(Color.black);
		JPanel j2 = new JPanel(new GridLayout(8, 8, 10, 10));
		j2.setBackground(Color.black);
		
		c.add(j1, BorderLayout.NORTH);
		c.add(j2, BorderLayout.CENTER);
		
		JButton[] jbt = new JButton[3];
		jbt[0] = new JButton("����");
		jbt[1] = new JButton("����");
		jbt[2] = new JButton("����");
		
		for(int i = 0; i < jbt.length; i++) {
			jbt[i].setBackground(Color.white);
			jbt[i].addActionListener(new MyActionListener());
			j1.add(jbt[i]);
		}
		
		JButton[] lbt = new JButton[64];
		for(int i = 0; i < lbt.length; i++) {
			lbt[i] = new RoundButton(String.valueOf(i + 1));
			lbt[i].addActionListener(new MyActionListener());
			lbt[i].setForeground(Color.white);
			j2.add(lbt[i]);
		}
		setSize(750, 750);
		setVisible(true);
	}
}