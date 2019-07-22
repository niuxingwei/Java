package week_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEMo extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double num1, num2, num3;
	boolean end, add, mul, sub, div;
	JTextField t = new JTextField("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("+");
	JButton b5 = new JButton("4");
	JButton b6 = new JButton("5");
	JButton b7 = new JButton("6");
	JButton b8 = new JButton("-");
	JButton b9 = new JButton("7");
	JButton b10 = new JButton("8");
	JButton b11 = new JButton("9");
	JButton b12 = new JButton("*");
	JButton b13 = new JButton(".");
	JButton b14 = new JButton("0");
	JButton b15 = new JButton("=");
	JButton b16 = new JButton("/");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();

	public DEMo() {
		setTitle("Caculate");
		setResizable(true);
		setBounds(100, 100, 550, 550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p1, "North");
		t.setEditable(false);
		t.setHorizontalAlignment(JTextField.CENTER);
		t.setColumns(18);
		t.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t);
		GridLayout l = new GridLayout(4, 0);
		l.setVgap(10);
		l.setHgap(10);
		p2.setLayout(l);
		add(p2, "Center");
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		JLabel ll = new JLabel();
		ll.setPreferredSize(new Dimension(10, 0));
		add(ll, "West");
		JLabel rl = new JLabel("Java Makes Me Happy!");
		rl.setPreferredSize(new Dimension(10, 0));
		add(rl, "East");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		setVisible(true);
	}

	public static void main(String args[]) {

		DEMo f = new DEMo();
	}

	public void num(int i) {
		String s = String.valueOf(i);
		if (end) { // 判断操作数输入是否结束
			t.setText("0");
			end = false;
		}
		if ((t.getText()).equals("0")) {
			// 如果文本框的内容为零，则覆盖文本框的内容
			t.setText(s);
		} else {
			// 如果文本框的内容不为零，则在内容后面添加数字
			String str = t.getText() + s;
			t.setText(str);
		}
	}

	public void sign(int i) {
		if (i == 1) {
			add = true;
			mul = false;
			sub = false;
			div = false;
		}
		if (i == 2) {
			add = false;
			mul = false;
			sub = true;
			div = false;
		}
		if (i == 3) {
			add = false;
			mul = true;
			sub = false;
			div = false;
		}
		if (i == 4) {
			add = false;
			mul = false;
			sub = false;
			div = true;
		}
		num1 = Double.parseDouble(t.getText());
		end = true;
	}

	public void point() {
		String s;
		if (t.getText().indexOf('.') < 0) {
			s = t.getText() + ".";
			t.setText(s);
		}
	}

	public void eql() {
		num2 = Double.parseDouble(t.getText());
		if (add)
			num3 = num1 + num2;
		if (mul)
			num3 = num1 * num2;
		if (sub)
			num3 = num1 - num2;
		if (div)
			num3 = num1 / num2;
		String s = String.valueOf(num3);
		t.setText(s);
		end = true;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			num(1);
		if (e.getSource() == b2)
			num(2);
		if (e.getSource() == b3)
			num(3);
		if (e.getSource() == b5)
			num(4);
		if (e.getSource() == b6)
			num(5);
		if (e.getSource() == b7)
			num(6);
		if (e.getSource() == b9)
			num(7);
		if (e.getSource() == b10)
			num(8);
		if (e.getSource() == b11)
			num(9);
		if (e.getSource() == b14)
			num(0);
		if (e.getSource() == b4)
			sign(1);
		if (e.getSource() == b8)
			sign(2);
		if (e.getSource() == b12)
			sign(3);
		if (e.getSource() == b16)
			sign(4);
		if (e.getSource() == b13)
			point();
		if (e.getSource() == b15)
			eql();
	}
}
