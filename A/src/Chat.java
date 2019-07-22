import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Chat {
	public static void AddNewRecord() {
		try {
			File writename = new File("aaa.txt");
			writename.createNewFile(); // 创建新文件
			BufferedWriter out = new BufferedWriter(new FileWriter(writename, true));
			System.out.println("*****欢迎来到通讯录管理系统添加用户界面*****");
			System.out.println("请输入用户的姓名");
			Scanner in = new Scanner(System.in);			
			String str = in.nextLine();
			out.write(str); // \r\n即为换行
			out.flush(); // 把缓存区内容压入文件
			System.out.println("请输入用户的电话号码");
			int number = in.nextInt();
			out.write(number + "\n\r");
			out.flush(); // 把缓存区内容压入文件
			out.newLine();// 换行
			out.close(); // 最后关闭文件
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DisplayRecord(String url, String name) {
		try {
			FileReader fr = new FileReader(url);
			BufferedReader br = new BufferedReader(fr);
			String temp = "";// 用于临时保存每次读取的内容
			while (temp != null) {
				temp = br.readLine();
				if (temp != null && temp.contains(name)) {
					System.out.println(temp);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
			System.out.println("********欢迎来到通讯录管理系统********");
			System.out.println("请按照提示操作");
			System.out.println("输入‘1’进入添加界面");
			System.out.println("输入‘2’进入查询界面");
			while(true)
			{
				int choice = in.nextInt();
			switch (choice) {
			case 1:
				AddNewRecord();
				break;
			case 2:
				System.out.println("*****欢迎来到通讯录管理系统添加用户界面*****");
				System.out.println("请输入您要写入数据库的文件夾和姓名");
				String Url=in.nextLine();
				in.nextLine();
				String name= in.nextLine();
				DisplayRecord(Url, name);
				break;
			default:
				System.out.println("请按照提示操作");
			}
			System.out.println("输入Ctrl+Z退出系统");
			in.close();
		}						
	}
}
