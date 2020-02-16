package panel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StudyBook extends JPanel {
	
	CardLayout card;
	JPanel p_base, p_show, p_info, p_book;
	JButton b_img;
	Booking p_book1;
	static int type;
	
	
	ImageIcon[] ic_room = new ImageIcon[4];
	Info[] p_info1 = new Info[4];
	public StudyBook() {
		setLayout(card = new CardLayout());
		setBackground(Color.gray);

		
		// 컴포넌트 생성
		p_base = new JPanel(new GridLayout(1, 2));
		p_show = new JPanel(); // JScrollPane or grid 로 상단 image, 하단 설명, 이미지 클릭 시 확대기능 추가
		p_info = new JPanel(new FlowLayout(SwingConstants.CENTER, 80, 10)); // ppt 초안과 같이 4분할로 나눈 뒤 MouseEntered 일 경우 show panel 이미지 및 설명 변경
		p_book = new JPanel();
		p_book.setBackground(Color.YELLOW);
		b_img = new JButton(new ImageIcon("./src/img/mug.png"));
		p_book1 = new Booking(this);
		
		for (int i = 0; i < ic_room.length; i++) {
			ic_room[i] = new ImageIcon("./src/img/rsz_mug.png");
			p_info1[i] = new Info(this, ic_room[i], i);
		}
		
		// 컴포넌트 사이즈 조정
		
		
		// 베이스 패널에 show, info 패널 얹기
		p_base.add(p_show);
		p_base.add(p_info);
		
		// 카드에 패널 얹기
		add("base", p_base);
		add("book", p_book1);
		card.show(this, "base");
		
		// show 패널
		p_show.add(b_img);
		b_img.setBorderPainted(false);
		b_img.setFocusPainted(false);
		b_img.setContentAreaFilled(false);
		
		// info 패널
		for (int i = 0; i < p_info1.length; i++) {
			p_info.add(p_info1[i]);
		}
	}
	
}

class Info extends JPanel {
	
	StudyBook sb;
	JButton b_img, b_book;
	JLabel l_avail;
	String avail;
	int num;
	final int MAX_NUM = 0;
	int i; // 룸 정보
	
	public Info(StudyBook sb, ImageIcon icon, int i) {
		this.sb = sb;
		this.i = i;
		
		setSize(220, 300);
		setLayout(new FlowLayout());
		avail = "%d / %d명"; // oracle 최대 정원 수 받아온 뒤 인자값 넘겨주기
		b_img = new JButton(icon);
		b_img.setPreferredSize(new Dimension(124, 102));
		b_img.setBorderPainted(false);
		b_img.setFocusPainted(false);
		b_img.setContentAreaFilled(false);
		
		l_avail = new JLabel(String.format(avail, num, MAX_NUM));
		b_book = new JButton("예약");
		b_book.setHorizontalAlignment(SwingConstants.CENTER);
		
		b_book.addActionListener(l);
		
		add(b_img);
		add(l_avail);
		add(b_book);
	}
	
	ActionListener l = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			sb.card.show(sb, "book");
		}
	};
}

class Booking extends JPanel {
	
	StudyBook sb;
	JPanel p_pay, p_seat, p_base ;
	JButton b_cancel;
	
	public Booking(StudyBook sb) {
		this.sb = sb;
		setLayout(new BorderLayout());
		
		p_base = new JPanel(new GridLayout(1, 2));
		p_pay = new JPanel();
		p_seat = new JPanel();
		p_pay.setBackground(Color.white);
		p_seat.setBackground(Color.white);
		b_cancel = new JButton("뒤로가기");
		b_cancel.setPreferredSize(new Dimension(50, 30));
		b_cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sb.card.show(sb, "base");
			}
		});
		
		p_base.add(p_pay);
		p_base.add(p_seat);
		
		
		
		add(p_base);
		add(b_cancel,"South");
		
	}
	
	
	
}

