package javaprograms;
import java.io.*;
public class circumcir {

	public static void main(String[] args)throws IOException 
	{
		float pi=3.14f,circum;
		int radius;
		System.out.println("Enter the radius");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		radius=Integer.parseInt(br.readLine());
		circum=2*pi*radius;
		System.out.println("circum="+circum);

	}

}
