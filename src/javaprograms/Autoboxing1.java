package javaprograms;

public class Autoboxing1 {

	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);
		//converting int to Integer
		Integer j=a;//autoboxing
		System.out.println(a+" "+i+ " "+j);

	}

}
