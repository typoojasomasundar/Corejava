package javaprograms;

public class StringBufferReplace {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		s.replace(2, 5, "are");
		System.out.println(s);

	}

}
