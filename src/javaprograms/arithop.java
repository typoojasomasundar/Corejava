package javaprograms;
import java.io.*;
public class arithop {

	public static void main(String[] args) throws IOException
	{
		int a,b,add,sub,mul,div,mod;
		System.out.println("Enter values of a and b");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		add=a+b;
		sub=a-b;
		mul=a*b;
		div=a/b;
		mod=a%b;
		System.out.println("add="+add);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
		System.out.println("mod="+mod);

	}

}
