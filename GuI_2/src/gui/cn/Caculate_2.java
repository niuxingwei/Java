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
	private JPanel contentPane; // 内容面板
	private JTextField textField; // 文本框
	public Caculate_2() {
		setTitle("Caculate"); // 设置窗体的标题
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体退出时操作
		setBounds(100, 100, 550, 500); // 设置窗体位置和大小
		contentPane = new JPanel(); // 创建内容面板
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); // 设置面板的边框
		contentPane.setLayout(new BorderLayout(0, 0)); // 设置内容面板为边界布局
		setContentPane(contentPane); // 应用内容面板
		JPanel panel1 = new JPanel(); // 新建面板用于保存文本框
		contentPane.add(panel1, BorderLayout.NORTH); // 将面板放置在边界布局的北部
		textField = new JTextField(); // 新建文本框
		textField.setHorizontalAlignment(SwingConstants.RIGHT); // 文本框中的文本使用右对齐
		panel1.add(textField); // 将文本框增加到面板中
		textField.setColumns(40); // 设置文本框的列数是18
		textField.setCaretColor(Color.red);
//		textField.setBackground(Color.gray);
		JPanel panel2 = new JPanel(); // 新建面板用于保存按钮
		contentPane.add(panel2, BorderLayout.CENTER); // 将面板放置在边界布局的中央
		
		
		panel2.setLayout(new GridLayout(4, 4, 5, 5)); // 面板使用网格4X4布局
		JButton button01 = new JButton("7"); // 新建按钮
		panel2.add(button01); // 应用按钮
		JButton button02 = new JButton("8"); // 新建按钮
		panel2.add(button02); // 应用按钮
		JButton button03 = new JButton("9"); // 新建按钮
		panel2.add(button03); // 应用按钮
		JButton button04 = new JButton("+"); // 新建按钮
		panel2.add(button04); // 应用按钮
		JButton button05 = new JButton("4"); // 新建按钮
		panel2.add(button05); // 应用按钮
		JButton button06 = new JButton("5"); // 新建按钮
		panel2.add(button06); // 应用按钮
		JButton button07 = new JButton("6"); // 新建按钮
		panel2.add(button07); // 应用按钮
		JButton button08 = new JButton("-"); // 新建按钮
		panel2.add(button08); // 应用按钮
		JButton button09 = new JButton("3"); // 新建按钮
		panel2.add(button09); // 应用按钮
		JButton button10 = new JButton("2"); // 新建按钮
		panel2.add(button10); // 应用按钮
		JButton button11 = new JButton("1"); // 新建按钮
		panel2.add(button11); // 应用按钮
		JButton button12 = new JButton("*"); // 新建按钮
		panel2.add(button12); // 应用按钮
		JButton button13 = new JButton("0"); // 新建按钮
		panel2.add(button13); // 应用按钮
		JButton button14 = new JButton("."); // 新建按钮
		panel2.add(button14); // 应用按钮
		JButton button15 = new JButton("="); // 新建按钮
		panel2.add(button15); // 应用按钮
		JButton button16 = new JButton("/"); // 新建按钮
		panel2.add(button16); // 应用按钮
	}
	public void num(int i){
	      String s=String.valueOf(i);  //将整数变量转化为字符串类型
	      
	      if((textField.getText()).equals("0")){ 
	           //如果文本框的内容为零，则覆盖文本框的内容
	    	  textField.setText(s);   }  
	    else{   //如果文本框的内容不为零，则在内容后面添加数字
	       String str = textField.getText() + s;
	       textField.setText(str);    
	       }
	 }

	public static void main(String[] args) {
		Caculate_2 frame = new Caculate_2();
		frame.setVisible(true);
	}
}