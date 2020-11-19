package javaprograms;
import java.io.*;
public class nestedif6 {

	public static void main(String[] args) throws IOException
	{
		int a,b;
		System.out.println("Enter values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		if(a>b)
			System.out.println("a is greater than b");
		else if(a==b)
			System.out.println("a is equal to b");
		else
			System.out.println("a is less than b");

	}

}
