// Tên package main
package day2_javaBasic;

// Các thư viện được imported
import java.util.concurrent.TimeUnit;

import java.util.Scanner;

// Khai báo tên class
public class Day2_Day3 {
	// Tham số truyền vào là mangtruyenvao kiểu int. Giá trị các phần tử của mảng
	public static void sumArray() {
		// Tạo biến n chứa độ dài của mảng
		int n;
		Scanner myObj = new Scanner(System.in); // Tạo 1 Scanner object, Scanner là một thư viện support Java
		System.out.println("Nhập n:");
		n = myObj.nextInt(); // Đọc giá trị được nhập vào từ bàn phím
		int[] mang = new int[n];

		int sum = 0;
		System.out.println("=== Các giá trị của mảng là ===");
		// Gán các giá trị của mảng bằng 0 đến n
		for (int i = 1; i < n; i++) {
			mang[i] = i;
			// Tính tổng các giá trị của mảng
			sum = sum + mang[i];
		}
		System.out.println("\nTong cua day so la: " + sum);
	}

	public void soChiaHetCho5() {

		System.out.println("=== Các giá trị của dãy số là ===");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0)
				System.out.println("\n Các số chia hết cho 5 la: " + i);
		}

	}

	public static void printLargerNumber(int number1, int number2) {
		if (number1 > number2) {
			System.out.println("Số lớn hơn là " + number1);
		} else {
			System.out.println("Số lớn hơn là " + number2);
		}
		System.out.println("Code vẫn đi tiếp đến dòng này !");
	}

	
	public int compareNum(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
		//System.out.println("Code có đi tới dòng này không? ");
	}
	
	public static void order(int arr[]) { // Parameter- tham số truyền vào là một mảng kiểu int
		int temp; // Khai báo biến tạm kiểu int
		for (int i = 0; i < arr.length - 1; i++) { // duyệt các phần tử của mảng arr
			System.out.println("LAN LAP THU " + i + " CUA MANG CHA BAN DAU :");
			for (int j = 0; j < arr.length - i - 1; j++) {
				System.out.println("Lan lap thu " + j + " de SS 2 so lien tiep: " + arr[j] + " va " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray() {
		System.out.println("==Cho day so ban dau la: 5, 1, 4, 2, 8, 7, 3, 0, 6 ====");
		int arr[] = { 5, 1, 4, 2, 8, 7, 3, 0, 6 };
		order(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		sumArray();
		printArray();
//		int soThuNhat, soThuHai, soThuBa;
//		double ketqua;
//		Scanner myObj = new Scanner(System.in); // Tạo 1 Scanner object, Scanner là một thư viện support Java
//		System.out.println("Nhập số thứ nhất:");
//		soThuNhat = myObj.nextInt(); // Read user input
//		System.out.println("Nhập số thứ 2:");
//		soThuHai = myObj.nextInt(); // Read user input
//		System.out.println("Nhập số thứ 3:");
//		soThuBa = myObj.nextInt(); // Read user input
//		ketqua = (soThuNhat * soThuHai) / soThuBa; // Calculate the sum of x + y
//		System.out.println("Số thứ nhất: " + soThuNhat + " NHÂN số thứ hai: " + soThuHai + " CHIA số thứ 3 " + soThuBa
//				+ " bằng: " + ketqua); // Print the sum
//		printLargerNumber(soThuNhat, soThuHai);
		thucHanhReturn();
	}
	
	public static void thucHanhReturn()
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Nhập các phần tử của mảng:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	            if (arr[i]%2==0 && arr[i]%3==0) 
	            	{
	            	 System.out.println("Điều kiện thoát xảy ra!");
	            	 return;
	            	}
	        }
	}
	
}
