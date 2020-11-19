package javaprograms;
import java.io.*;
public class fact2 {

	public static void main(String[] args) throws IOException
	{
		int i,n,fact=1;
		System.out.println("Enter the number:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
System.out.println("The factorial of a no:"+fact);
	}

}
