package Chat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class Cacalate
{
    //向JFrame中添加JButton按钮
    public static void makeButton(String title,JFrame frame,GridBagLayout gridBagLayout,GridBagConstraints constraints)
    {   
        JButton button=new JButton(title);    //创建Button对象
        gridBagLayout.setConstraints(button,constraints);
        frame.add(button);
    }
    public static void main(String[] agrs)
    {
        JFrame frame=new JFrame("Calculaor");
        GridBagLayout gbaglayout=new GridBagLayout();    //创建GridBagLayout布局管理器
        GridBagConstraints constraints=new GridBagConstraints();
        frame.setLayout(gbaglayout);    //使用GridBagLayout布局管理器
        constraints.fill=GridBagConstraints.BOTH;    //组件填充显示区域
        constraints.weightx=0.0;    //恢复默认值
        constraints.gridwidth = GridBagConstraints.REMAINDER;    //结束行
        JTextField tf=new JTextField("Java makes me happy 1314!");
        gbaglayout.setConstraints(tf, constraints);
        frame.add(tf);
        constraints.weightx=0.5;    // 指定组件的分配区域
        constraints.weighty=0.2;
        constraints.gridwidth=1;
        makeButton("7",frame,gbaglayout,constraints);    //调用方法，添加按钮组件
        makeButton("8",frame,gbaglayout,constraints);
      
    
        makeButton("9",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;    //结束行
        makeButton("+",frame,gbaglayout,constraints);  
        constraints.gridwidth=1;    //重新设置gridwidth的值
       
        makeButton("4",frame,gbaglayout,constraints);
        makeButton("5",frame,gbaglayout,constraints);
        makeButton("6",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;//结束行
        makeButton("-",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
       
        makeButton("1",frame,gbaglayout,constraints);
        makeButton("2",frame,gbaglayout,constraints);
        makeButton("3",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER; //结束行
        makeButton("*",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
       
        makeButton("0",frame,gbaglayout,constraints);
        makeButton(".",frame,gbaglayout,constraints);
        makeButton("=",frame,gbaglayout,constraints);
        constraints.gridwidth=GridBagConstraints.REMAINDER;//结束行
        makeButton("/",frame,gbaglayout,constraints);
        constraints.gridwidth=1;
        
        frame.setBounds(400,400,400,400);    //设置容器大小
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}