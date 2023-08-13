package day5_Overloading;

public class Adder {
	
	public static int Add(int a, int b)
	{
		return a+b;
	}

	public static int Add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Kết quả khi cộng hai số là: " + Add(3,6));
     System.out.println("Kết quả khi cộng ba số là: " + Add(3,6,9));
	}
}
