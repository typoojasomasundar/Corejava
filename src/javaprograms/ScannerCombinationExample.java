package javaprograms;
import java.util.*;
public class ScannerCombinationExample {

	public static void main(String[] args) {
	String s="Hello,this is javatpoint";
	Scanner scan=new Scanner(s);
	System.out.println("Boolean result:"+scan.hasNext());//Scans the string to boolean
	System.out.println("String:"+scan.nextLine());
	scan.close();
	System.out.println("Enter your details:");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=in.next();
	System.out.println("Name:"+name);
	System.out.println("Enter your age");
	int i=in.nextInt();//Scans the string to int
	System.out.println("Age:"+i);
	System.out.println("Enter your salary:");
	double d=in.nextDouble();//Scans the string to double
	System.out.println("Salary:"+d);
	in.close();

	}

}
