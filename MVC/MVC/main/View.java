package main;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	JPanel panel = new JPanel();
	JTextField first  = new JTextField(10);
	JLabel plus = new JLabel("+");
	JTextField second  = new JTextField(10);
	JButton btn = new JButton("Calcular");
	JTextField rs  = new JTextField(10);
	
	View(){
		panel.add(first);
		panel.add(plus);
		panel.add(second);
		panel.add(btn);
		panel.add(rs);
		this.add(panel);
		this.setBounds(600,600,550,550);
		this.setVisible(true);
	}
	
	public Double getFirst() {
		return Double.parseDouble(this.first.getText());
	}
	
	public Double getSecond() {
		return Double.parseDouble(this.second.getText());
	}
	
	public void addCalculateListener(ActionListener listenForCalcButton){
		
		btn.addActionListener(listenForCalcButton);
		
	}
}
