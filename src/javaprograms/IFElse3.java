package javaprograms;
import java.io.*;
public class IFElse3 {

	public static void main(String[] args) throws IOException
	{
		int a,b;
		System.out.println("Enter values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		if(a>b)
			System.out.println("A is greater than b");
		else
			System.out.println("A is equal to b");

	}

}
