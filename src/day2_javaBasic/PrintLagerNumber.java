package day2_javaBasic;

import java.util.Scanner;

public class PrintLagerNumber {

	public static void main(String[] args) {
		int x, y;
		Scanner object = new Scanner(System.in);
		// Nhập x
		System.out.println("Nhập số thứ nhất: ");
		x = object.nextInt(); // Đọc ký tự từ bàn phím và lưu vào object Scanner
		System.out.println("Nhập số thứ 2: ");
		y = object.nextInt();
		if (x > y)
		{
			System.out.println("Số lớn hơn là: "+x);
		}
		else
		{
			System.out.println("Số lớn hơn là: "+y);
		}
	}

}
