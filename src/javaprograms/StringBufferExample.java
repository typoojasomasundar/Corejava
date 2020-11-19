package javaprograms;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("GeeksforGeeks");
		int p=s.length();
		int q=s.capacity();
		System.out.println("Length of the string buffer:"+p);//size is fixed
		System.out.println("Capacity of the string buffer:"+q);//more 16bytes is allocated

	}

}
