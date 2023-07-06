package day2_javaBasic;

import java.util.Scanner;

public class ReturningPractice {
	public static int compareNumber(int soThuNhat, int soThuHai)
	{ 
		System.out.println();
		System.out.println();
		if(soThuNhat > soThuHai)
		{
			return soThuNhat;
		}
		else {
			return soThuHai;
		}
	}
	
	public static void main(String[] args) {
		int x, y;
		Scanner object = new Scanner(System.in);
		// Nhap x va y:
		System.out.println("Nhập x: ");
		x = object.nextInt();
		System.out.println("Nhập y: ");
		y = object.nextInt();
		int z= compareNumber(x,y);
		System.out.println("Số lớn hơn là" +z);
	}
}
