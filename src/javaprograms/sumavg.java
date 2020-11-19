package javaprograms;
import java.io.*;
public class sumavg {

	public static void main(String[] args)throws IOException 
	{
		int a,b,c,sum,avg;
		System.out.println("Enter values of a ,b,c");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=Integer.parseInt(br.readLine());
		sum=a+b+c;
		avg=sum/3;
		System.out.println("sum="+sum);
		System.out.println("average="+avg);

	}

}
