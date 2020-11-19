package javaprograms;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		s.delete(2, 4);//By specifying the start index and end index as 2 and 4 respectively
		System.out.println("s="+s);
		s.deleteCharAt(3);
		System.out.println("s="+s);
		

	}

}
