package javaprograms;
import java.io.*;
public class switchdayno {

	public static void main(String[] args) throws IOException
	{
		int dayno;
		System.out.println("Enter the dayno of the week");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		dayno=Integer.parseInt(br.readLine());
		switch(dayno)
		{
		case 1: System.out.println("Sunday");
		        break;
		case 2:System.out.println("Monday");
		        break;
		case 3:System.out.println("Tuesday");
		        break;
		case 4:System.out.println("Wednesday");
		        break;
		case 5:System.out.println("Thursday");
		       break;
		case 6:System.out.println("Friday");
		       break;
		case 7:System.out.println("Saturday");
		        break;
		default:System.out.println("Invalid choice");
		        break;
		}
		

	}

}
