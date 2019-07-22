package gui.cn;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatRoom_2 {
	private JFrame jFrame;
	private JTextArea jArea;
	private JScrollPane jScrollPane;
	private JButton Send;
	private JButton Quit;
	private JTextField jTextField;
	private Box east_box;
	private JComboBox<String> cmb = new JComboBox<>();

	// private JLabel label1; //������ǩ
	private class Send_message implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String message = jArea.getText();
			String str = (String) cmb.getSelectedItem();
			message = message + str+"   :"+jTextField.getText() + System.getProperty("line.separator");

		
			jArea.setText( message);// �����ı�
			
			jTextField.setText(null);
			
		}

	}

	public ChatRoom_2() {
		jFrame = new JFrame("Chat Room");
		Send = new JButton("Send");
		Send.setBackground(Color.green);
		Send_message sMessage = new Send_message();// �¼�ע��
		Send.addActionListener(sMessage);

		Quit = new JButton("Quit");
		Quit.setBackground(Color.red);
		Quit_exit exit = new Quit_exit();
		Quit.addActionListener(exit);

		jArea = new JTextArea(10, 50);// �û������
		jArea.setBackground(Color.pink);
		jTextField = new JTextField(40);// �������
		jTextField.setBackground(Color.cyan);
		jTextField.addActionListener(sMessage);

		jScrollPane = new JScrollPane(jArea);
		east_box = Box.createVerticalBox();

	}

	public class Quit_exit implements ActionListener {// Quit�¼���Ӧ
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public void launchFrame() {
		jFrame.setSize(600, 250);
		JPanel jPanel = new JPanel();
		JPanel jPanel_2 = new JPanel();
		cmb.addItem("��ͷǿ");
		cmb.addItem("�ܴ�");
		cmb.addItem("�ܶ�");
		cmb.setBackground(Color.yellow);
		jFrame.add(jPanel);
		// label1.setText("UserName");
		jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jFrame.add(jScrollPane, BorderLayout.CENTER);
		jFrame.add(jTextField, BorderLayout.SOUTH);

		east_box.add(jPanel_2);
		jPanel_2.add(Send);
		// east_box.add(label1);
		jPanel_2.add(cmb);
		jPanel_2.add(Quit);
		east_box.add(Box.createVerticalStrut(10));

		jFrame.add(east_box, BorderLayout.EAST);
		jFrame.pack();// �Զ������С

		jPanel.setBackground(Color.red);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ChatRoom_2 newChatClient = new ChatRoom_2();
		newChatClient.launchFrame();
	}
}