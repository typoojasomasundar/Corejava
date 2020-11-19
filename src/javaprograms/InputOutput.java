package javaprograms;
import java.io.*;
public class InputOutput {

	public static void main(String[] args) throws IOException
	{
		int a,b;
		System.out.println("Enter values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
