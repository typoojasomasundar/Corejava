package javaprograms;
import java.io.*;
public class relationallargest {

	public static void main(String[] args)throws IOException 
	{
		int a,b;
		System.out.println("Enter the values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		if(a>b)
			System.out.println("a="+a);
		else
			System.out.println("b="+b);

	}

}
