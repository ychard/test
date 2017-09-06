


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.lanqiao.test.JdbcUtil;



public class GuiDemo
{
    
	public static void main(String[] args)
	{
		Frame f=new Frame("图形化界面");
		//创建一个文本
		final TextField t=new TextField(30);
		//将文本添加到界面
		f.add(t,BorderLayout.NORTH);
		//创建一个按钮
		Button b=new Button("点击");
		//给按钮一个点击事件
		b.addActionListener(new ActionListener()  //匿名内部类
		{
			public void actionPerformed(ActionEvent e)
			{
				String s=t.getText();//匿名内部类引用局部变量必须用final修饰
				System.out.println("点击+1"+s);
			}
		});
		
		f.addWindowListener(new WindowAdapter() //适配器
		{
			 public void windowClosing(WindowEvent e) 
			 {
				 System.exit(0); //退出JVM
			 }
		});
		//将按钮添加到界面
		f.add(b);
		
		//自行调节大小
		f.pack();
		//显示界面
		f.setVisible(true);
	
	}
}