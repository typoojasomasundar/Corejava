package javaprograms;

public class ConcatExample {

	public static void main(String[] args) {
		String s1="java string";//String literal
		s1.concat("is immutable");
		System.out.println(s1);
		s1=s1.concat("is immutable so assign it expicitly");
		System.out.println(s1);

	}

}
