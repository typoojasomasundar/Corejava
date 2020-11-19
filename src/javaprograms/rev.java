package javaprograms;
import java.io.*;
public class rev {

	public static void main(String[] args) throws IOException
	{
		int num,rem,rev=0;
		System.out.println("Enterthe number:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		num=Integer.parseInt(br.readLine());
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
System.out.println("Reverse="+rev);
	}

}
