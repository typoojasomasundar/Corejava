package javaprograms;
import java.io.*;
public class switchareas {

	public static void main(String[] args) throws IOException
	{
		int length,breadth,area;
		int side,area1;
		int choice;
		System.out.println("Main menu");
		System.out.println("1.Area of a rectangle");
		System.out.println("2.Area of a square");
		System.out.println("Enter ur choice");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1: System.out.println("Enter the length and breadth of the reactangle");
		        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		        length=Integer.parseInt(br1.readLine());
		        breadth=Integer.parseInt(br1.readLine());
		        area=length*breadth;
		        System.out.println("area="+area);
		        break;
		case 2: System.out.println("Enter the side of the square");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        side=Integer.parseInt(br2.readLine());
        area1=side*side;
        System.out.println("area="+area1);
        break;
		default:System.out.println("Invalid choice");
		break;
		
		
		}
	}

}
