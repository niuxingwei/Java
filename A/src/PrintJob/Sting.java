package PrintJob;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//package PrintJob;
//
//class Animal { 
//    private String name;  
//    private int id; 
//    public  Animal(String yName, int myid) { 
//        name = yName; 
//        id = myid;
//    } 
//    public void eat(){ 
//        System.out.println(name+"正在吃"); 
//    }
//    public void sleep(){
//        System.out.println(name+"正在睡");
//    }
//    public void introduction() { 
//        System.out.println("大家好！我是"         + id + "号" + name + "."); 
//    } 
//}
//
//class anann extends Animal{
//
//	public anann(String yName, int myid) {
//		super("ixjs",9090);
//		super.eat();
//		super.introduction();
//		System.out.println("hahahahah");
//	}
//	
//}
//
// 
//public class Sting {
//
//	public static void main(java.lang.String[] args) {
//		// TODO Auto-generated method stub
//       //  anann bAnann = new anann("牛",8989 );
//       // String string ="sss";
//        // string+="bbb";
//         //string = string+100;
//       // String tString = string + "aca";
//       // string.length();
//        // System.out.println(string+100);
//		int c= 1;
//		for (int i = 1; i <=5; i++) {
//			c+=i;
//		}
//		System.out.println(c);
//         
//
//	}
//
//}

//public class Sting {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		while (true) {
//			System.out.println("请输入一个整数");
//			int a = in.nextInt();
//			try {
//				a=7;
//			} catch (InputMismatchException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//				System.out.println("您输入的不合法");
//			}
//			System.out.println("你输入的数据为" + a);
//		}
//	}
//
//}
//
//  abstract class Employee
//{
//   private String name;
//   private String address;
//   private int number;
//   
//   public  double computePay(){
//	   System.out.println();
//	return number;
//   };
//   
//   //其余代码
//}
// abstract class Employee
//{
//   private String name;
//   private String address;
//   private int number;
//   public Employee(String name, String address, int number)
//   {
//      System.out.println("Constructing an Employee");
//      this.name = name;
//      this.address = address;
//      this.number = number;
//   }
//   public double computePay()
//   {
//     System.out.println("Inside Employee computePay");
//     return 0.0;
//   }
//   public void mailCheck()
//   {
//      System.out.println("Mailing a check to " + this.name
//       + " " + this.address);
//   }
//   public String toString()
//   {
//      return name + " " + address + " " + number;
//   }
//   public String getName()
//   {
//      return name;
//   }
//   public String getAddress()
//   {
//      return address;
//   }
//   public void setAddress(String newAddress)
//   {
//      address = newAddress;
//   }
//   public int getNumber()
//   {
//     return number;
//   }
//}

public class Sting {
	public static void main(String[] args) throws InterruptedException {
Scanner in = new Scanner(System.in);
	Set<Integer> set = new TreeSet<>();
	set.add(50);
	set.add(15);
	set.add(15);
	
	set.add(50);
	set.add(5);
	System.out.println(set.size());
	for(int k : set)
	{
		System.out.println(k);
	}
	}
}
