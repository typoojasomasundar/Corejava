package javaprograms;

public class StringBufferInsert {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Java");
		s.insert(3, "oops");//3rd index position
		System.out.println(s);
		s.insert(4, 'c');//4th index posiiton
		System.out.println(s);
		s.insert(5, true);//5th index position
		System.out.println(s);
		s.insert(6, 78);//6th index position
		System.out.println(s);

	}

}
