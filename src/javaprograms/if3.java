package javaprograms;
import java.io.*;
public class if3 {

	public static void main(String[] args) throws IOException
	{
		int a;
		System.out.println("Enter value of a:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		if(a>10)
			System.out.println("a="+a);

	}

}
