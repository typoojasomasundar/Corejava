package javaprograms;

import java.util.*;

public class OneDimensionalarray2 {

	public static void main(String[] args) {
		double [] a=new double[10];
		double n=a.length;
		System.out.println("Enter the array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<n;i++)
		a[i]=s.nextDouble();
		System.out.println("The array elements are:");
		for(int i = 0;i<n;i++)
			System.out.println(a[i]+ " ");

	}

}
