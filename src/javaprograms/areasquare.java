package javaprograms;
import java.io.*;
public class areasquare {

	public static void main(String[] args) throws IOException
	{
		int side,area;
		System.out.println("Enter the side");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		side=Integer.parseInt(br.readLine());
		area=side*side;
		System.out.println("area="+area);

	}

}
