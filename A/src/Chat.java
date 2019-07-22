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
			writename.createNewFile(); // �������ļ�
			BufferedWriter out = new BufferedWriter(new FileWriter(writename, true));
			System.out.println("*****��ӭ����ͨѶ¼����ϵͳ����û�����*****");
			System.out.println("�������û�������");
			Scanner in = new Scanner(System.in);			
			String str = in.nextLine();
			out.write(str); // \r\n��Ϊ����
			out.flush(); // �ѻ���������ѹ���ļ�
			System.out.println("�������û��ĵ绰����");
			int number = in.nextInt();
			out.write(number + "\n\r");
			out.flush(); // �ѻ���������ѹ���ļ�
			out.newLine();// ����
			out.close(); // ���ر��ļ�
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DisplayRecord(String url, String name) {
		try {
			FileReader fr = new FileReader(url);
			BufferedReader br = new BufferedReader(fr);
			String temp = "";// ������ʱ����ÿ�ζ�ȡ������
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
			System.out.println("********��ӭ����ͨѶ¼����ϵͳ********");
			System.out.println("�밴����ʾ����");
			System.out.println("���롮1��������ӽ���");
			System.out.println("���롮2�������ѯ����");
			while(true)
			{
				int choice = in.nextInt();
			switch (choice) {
			case 1:
				AddNewRecord();
				break;
			case 2:
				System.out.println("*****��ӭ����ͨѶ¼����ϵͳ����û�����*****");
				System.out.println("��������Ҫд�����ݿ���ļ��A������");
				String Url=in.nextLine();
				in.nextLine();
				String name= in.nextLine();
				DisplayRecord(Url, name);
				break;
			default:
				System.out.println("�밴����ʾ����");
			}
			System.out.println("����Ctrl+Z�˳�ϵͳ");
			in.close();
		}						
	}
}
