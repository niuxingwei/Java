package Chat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class Cacalate
{
    //��JFrame�����JButton��ť
    public static void makeButton(String title,JFrame frame,GridBagLayout gridBagLayout,GridBagConstraints constraints)
    {   
        JButton button=new JButton(title);    //����Button����
        gridBagLayout.setConstraints(button,constraints);
        frame.add(button);
    }
    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("Calculaor");
        GridBagLayout gbaglayout=new GridBagLayout();    //����GridBagLayout���ֹ�����
        GridBagConstraints constraints=new GridBagConstraints();
        frame.setLayout(gbaglayout);    //ʹ��GridBagLayout���ֹ�����
        constraints.fill=GridBagConstraints.BOTH;    //��������ʾ����
        constraints.weightx=0.0;    //�ָ�Ĭ��ֵ
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //������
        JTextField tf=new JTextField("Java makes me happy 1314!");
        gbaglayout.setConstraints(tf, constraints);
        frame.add(tf);
        constraints.weightx=0.5;    // ָ������ķ�������
        constraints.weighty=0.2;
        constraints.gridwidth=1;
        makeButton("7",frame,gbaglayout,constraints);    //���÷�������Ӱ�ť���
        makeButton("8",frame,gbaglayout,constraints);
      
    
        makeButton("9",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;    //������
        makeButton("+",frame,gbaglayout,constraints);  
        constraints.gridwidth=1;    //��������gridwidth��ֵ
       
        makeButton("4",frame,gbaglayout,constraints);
        makeButton("5",frame,gbaglayout,constraints);
        makeButton("6",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;//������
        makeButton("-",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
       
        makeButton("1",frame,gbaglayout,constraints);
        makeButton("2",frame,gbaglayout,constraints);
        makeButton("3",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER; //������
        makeButton("*",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
       
        makeButton("0",frame,gbaglayout,constraints);
        makeButton(".",frame,gbaglayout,constraints);
        makeButton("=",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;//������
        makeButton("/",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
        
        frame.setBounds(400,400,400,400);    //����������С
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}