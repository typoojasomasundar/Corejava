package javaprograms;
import java.io.*;
public class perirec {

	public static void main(String[] args) throws IOException
	{
		int length,breadth,perimeter;
		System.out.println("Enter the length and breadth of the rectangle");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		length=Integer.parseInt(br.readLine());
		breadth=Integer.parseInt(br.readLine());
		perimeter=2*(length+breadth);
		System.out.println("perimeter="+perimeter);

	}

}
