package panel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StudyBorrow extends JPanel implements ActionListener {

	JButton b_com, b_order;
	JPanel p_base, p_com, p_order;
	CardLayout card;
	Order order;

	public StudyBorrow() {
		setLayout(card = new CardLayout());

		order = new Order(this);
		b_com = new JButton("노트북 대여");
		b_order = new JButton("음료 주문");
		p_base = new JPanel(new GridLayout(1, 2));
		p_com = new JPanel(new FlowLayout(SwingConstants.CENTER, 160, 150));
		p_order = new JPanel(new FlowLayout(SwingConstants.CENTER, 160, 150));
		b_com.setPreferredSize(new Dimension(120, 100));
		b_com.setVerticalAlignment(SwingConstants.CENTER);
		b_order.setPreferredSize(new Dimension(120, 100));
		b_order.setVerticalAlignment(SwingConstants.CENTER);

		b_order.addActionListener(this);

		p_base.add(p_com);
		p_base.add(p_order);

		p_com.add(b_com);
		p_order.add(b_order);

		add("base", p_base);
		add("order", order);
		card.show(this, "base");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == b_com) {

		} else if (obj == b_order) {
			card.show(this, "order");
		}
	}
}

class Order extends JPanel {

	JPanel p_left, p_right;
	JButton btn;
	StudyBorrow sw;

	public Order(StudyBorrow sw) {
		this.sw = sw;
		setLayout(new BorderLayout());

		p_left = new JPanel();
		p_right = new JPanel();
		btn = new JButton("뒤로가기");
		btn.setPreferredSize(new Dimension(50, 30));

		p_left.setBackground(Color.yellow);
		p_right.setBackground(Color.red);

		p_left.setPreferredSize(new Dimension(200, 370));

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sw.card.show(sw, "base");
			}
		});

		add(p_right);
		add(p_left, "West");
		add(btn, "South");

	}

}
