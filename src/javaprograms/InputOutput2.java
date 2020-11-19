package javaprograms;
import java.io.*;
public class InputOutput2 {

	public static void main(String[] args) throws IOException
	{
		String c;
		System.out.println("Enter a character:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		c=br.readLine();
		System.out.println("c="+c);
		

	}

}
