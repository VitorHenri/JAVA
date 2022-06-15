package aplication;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Program implements ActionListener {
	public static JButton b;
	public static void main(String[] args) {
		b = new JButton("Click here");
		
		JLabel label = new JLabel();
		JFrame frame = new JFrame();
		b.addActionListener(e->JOptionPane.showMessageDialog(frame, "CLICOU NO BOTÃO"));
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		label.setText("My Label");
		frame.getContentPane().setBackground(new Color(123,50,250));
		frame.setLayout(null);
		label.setBounds(0,0,100,100);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setVerticalAlignment(JLabel.TOP);
		String jp = "olá";
		b.setBounds(200,100,100,50);
		frame.add(label);
		frame.add(b);
		//JOptionPane.showMessageDialog(frame, jp);
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
