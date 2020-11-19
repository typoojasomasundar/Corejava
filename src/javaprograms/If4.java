package javaprograms;
import java.io.*;
public class If4 {

	public static void main(String[] args) throws IOException
	{
	int num;	
	System.out.println("Enter the number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	num=Integer.parseInt(br.readLine());
	if(num%2==0)
		System.out.println("The number is even");
	else
		System.out.println("The number is odd");

	}

}
