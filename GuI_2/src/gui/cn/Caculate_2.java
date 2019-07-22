package gui.cn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Caculate_2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4688933049158247876L;
	private JPanel contentPane; // �������
	private JTextField textField; // �ı���
	public Caculate_2() {
		setTitle("Caculate"); // ���ô���ı���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô����˳�ʱ����
		setBounds(100, 100, 550, 500); // ���ô���λ�úʹ�С
		contentPane = new JPanel(); // �����������
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // �������ı߿�
		contentPane.setLayout(new BorderLayout(0, 0)); // �����������Ϊ�߽粼��
		setContentPane(contentPane); // Ӧ���������
		JPanel panel1 = new JPanel(); // �½�������ڱ����ı���
		contentPane.add(panel1, BorderLayout.NORTH); // ���������ڱ߽粼�ֵı���
		textField = new JTextField(); // �½��ı���
		textField.setHorizontalAlignment(SwingConstants.RIGHT); // �ı����е��ı�ʹ���Ҷ���
		panel1.add(textField); // ���ı������ӵ������
		textField.setColumns(40); // �����ı����������18
		textField.setCaretColor(Color.red);
//		textField.setBackground(Color.gray);
		JPanel panel2 = new JPanel(); // �½�������ڱ��水ť
		contentPane.add(panel2, BorderLayout.CENTER); // ���������ڱ߽粼�ֵ�����
		
		
		panel2.setLayout(new GridLayout(4, 4, 5, 5)); // ���ʹ������4X4����
		JButton button01 = new JButton("7"); // �½���ť
		panel2.add(button01); // Ӧ�ð�ť
		JButton button02 = new JButton("8"); // �½���ť
		panel2.add(button02); // Ӧ�ð�ť
		JButton button03 = new JButton("9"); // �½���ť
		panel2.add(button03); // Ӧ�ð�ť
		JButton button04 = new JButton("+"); // �½���ť
		panel2.add(button04); // Ӧ�ð�ť
		JButton button05 = new JButton("4"); // �½���ť
		panel2.add(button05); // Ӧ�ð�ť
		JButton button06 = new JButton("5"); // �½���ť
		panel2.add(button06); // Ӧ�ð�ť
		JButton button07 = new JButton("6"); // �½���ť
		panel2.add(button07); // Ӧ�ð�ť
		JButton button08 = new JButton("-"); // �½���ť
		panel2.add(button08); // Ӧ�ð�ť
		JButton button09 = new JButton("3"); // �½���ť
		panel2.add(button09); // Ӧ�ð�ť
		JButton button10 = new JButton("2"); // �½���ť
		panel2.add(button10); // Ӧ�ð�ť
		JButton button11 = new JButton("1"); // �½���ť
		panel2.add(button11); // Ӧ�ð�ť
		JButton button12 = new JButton("*"); // �½���ť
		panel2.add(button12); // Ӧ�ð�ť
		JButton button13 = new JButton("0"); // �½���ť
		panel2.add(button13); // Ӧ�ð�ť
		JButton button14 = new JButton("."); // �½���ť
		panel2.add(button14); // Ӧ�ð�ť
		JButton button15 = new JButton("="); // �½���ť
		panel2.add(button15); // Ӧ�ð�ť
		JButton button16 = new JButton("/"); // �½���ť
		panel2.add(button16); // Ӧ�ð�ť
	}
	public void num(int i){
	      String s=String.valueOf(i);  //����������ת��Ϊ�ַ�������
	      
	      if((textField.getText()).equals("0")){ 
	           //����ı��������Ϊ�㣬�򸲸��ı��������
	    	  textField.setText(s);   }  
	    else{   //����ı�������ݲ�Ϊ�㣬�������ݺ����������
	       String str = textField.getText() + s;
	       textField.setText(str);    
	       }
	 }

	public static void main(String[] args) {
		Caculate_2 frame = new Caculate_2();
		frame.setVisible(true);
	}
}