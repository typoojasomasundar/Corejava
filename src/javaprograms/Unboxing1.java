package javaprograms;

public class Unboxing1 {

	public static void main(String[] args) {
		Integer a=new Integer(3);
		int i=a.intValue();//Unboxing
		int j=a;
		System.out.println(a+" "+i+" "+j);

	}

}
