package day4_encapsulation;

public class Day4_Attribute {
	int x;

	public static void main(String[] args) {
		Day4_Attribute myObj = new Day4_Attribute();
		myObj.x = 40;
		System.out.println(myObj.x);

		int result = myObj.CompareNum();
		System.out.println("The greater number among x and y is: " + result);
		
		CompareNum2();
	}

	public int CompareNum() {
		int x = 3;
		int y = 8;
		System.out.println("x = " + x + "\ny = " + y);
		if (x > y) {
			return x;
		} else
			return y;
	}
	
	private static void CompareNum2() {
		int x = 3;
		int y = 8;
		if (x > y) {
			System.out.println("Số lớn hơn là " + x);
		} else {
			System.out.println("Số lớn hơn là " + y);
		}
		System.out.println("Thực hiện thành công !");
	}


}
