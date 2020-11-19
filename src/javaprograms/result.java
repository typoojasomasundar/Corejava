package javaprograms;
import java.io.*;
public class result {

	public static void main(String[] args) throws IOException
	{
		int m1,m2,m3,total,avg;
		System.out.println("Enter marks in 3 subjects");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		
		total=m1+m2+m3;
		avg=total/3;
		if(avg>=85)
			System.out.println("Distinction");
		else if((avg>=60)&&(avg<=85))
			System.out.println("First class");
		else if((avg>=50)&&(avg<=60))
			System.out.println("Second class");
		else
			System.out.println("Fail");

	}

}
