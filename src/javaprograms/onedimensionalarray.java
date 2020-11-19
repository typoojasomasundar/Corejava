package javaprograms;
import java.io.*;
public class onedimensionalarray {

	public static void main(String[] args) throws IOException
	{
		int [] a=new int[10];
		int n=a.length;
		System.out.println("Enter the array elements");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<n;i++)
		a[i]=Integer.parseInt(br.readLine());
		System.out.println("The array elements are:");
		for(int i = 0;i<n;i++)
			System.out.println(a[i]+ " ");
	}

}
