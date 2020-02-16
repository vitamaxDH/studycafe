package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudyChat extends JPanel{
	
	JPanel p_qna, p_chat, p_bot;
	JTextArea ta;
	JTextField tf;
	JButton btn;
	
	
	public StudyChat() {
		setLayout(new GridLayout(1, 2));
		setBackground(Color.WHITE);
		
		p_qna = new JPanel();
		p_chat = new JPanel(new BorderLayout());
		p_bot = new JPanel(new BorderLayout());
		ta = new JTextArea();
		tf = new JTextField(40);
		btn = new JButton("전송");
		
		p_bot.add(tf);
		p_bot.add(btn,"East");
		
		p_chat.add(ta);
		p_chat.add(p_bot,"South");
		
		
		
		add(p_qna);
		add(p_chat);
		
	}
	
}
