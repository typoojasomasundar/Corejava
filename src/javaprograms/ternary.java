package javaprograms;
import java.io.*;
public class ternary {

	public static void main(String[] args) throws IOException
	{
		int a,b,big;
		System.out.println("Enter values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		big=(a>b)?a:b;
		System.out.println("big="+big);

	}

}
