// Tên package main
package day2_day3_javaBasic;
// Các thư viện được imported
import java.util.concurrent.TimeUnit;

import java.util.Scanner;

// Khai báo tên class
public class Day2_Day3 {
	// Parameter- tham số truyền vào là  một mảng kiểu int
	public void sumArray(int arr[]) {
		int n = arr.length; // Tạo biến variable n chứa độ dài của mảng
		int sum = 0;
		System.out.println("=== Các giá trị của dãy số là ===");
		for (int i = 0; i < n; ++i)
		{
			System.out.print(arr[i] + " "); // In giá trị của mảng theo từng lần duyệt cho tới hết
		 sum = sum + arr[i]; 
		}
		System.out.println("\nTong cua day so la: "+sum);
	}
	
	
	public void soChiaHetCho5() {
		
		System.out.println("=== Các giá trị của dãy số là ===");
		for (int i = 1; i < 100; i++)
		{
			if(i%5==0)
				System.out.println("\n Các số chia hết cho 5 la: "+i);
		}
		
	}
	
	private void printLargerNumber(int number1, int number2)
	{
		if(number1 > number2)
		{
			System.out.println("Số lớn hơn là "+number1);
		}
		else {
			System.out.println("Số lớn hơn là "+number2);
		}
	}
	
	public static void order(int arr[]) { // Parameter- tham số truyền vào là một mảng kiểu int
		int temp; // Khai báo biến tạm kiểu int
		for (int i = 0; i < arr.length-1; i++) { // duyệt các phần tử của mảng arr
			System.out.println("LAN LAP THU " + i + " CUA MANG CHA BAN DAU :");
			for (int j = 0; j < arr.length - i - 1; j++) { 
				System.out.println("Lan lap thu " + j + " de SS 2 so lien tiep: " 
							       + arr[j] + " va " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
				    temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("==Cho day so ban dau la: 5, 1, 4, 2, 8, 7, 3, 0, 6 ====");
		int arr[] = { 5, 1, 4, 2, 8, 7, 3, 0, 6 };
		order(arr);
		for (int i = 0; i< arr.length; i ++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main3(String[] args) {
		 int x, y, z; double ketqua;
		 Scanner myObj = new Scanner(System.in); // Tạo 1 Scanner object, Scanner là một thư viện support Java
		    System.out.println("Nhập số thứ nhất:");
		    x = myObj.nextInt(); // Read user input
		    System.out.println("Nhập số thứ 2:");
		    y = myObj.nextInt(); // Read user input
		    System.out.println("Nhập số thứ 3:");
		    z = myObj.nextInt(); // Read user input
		    ketqua = (x * y)/z;  // Calculate the sum of x + y
		    System.out.println("Số thứ nhất: "+x +" NHÂN số thứ hai: "+ y + " CHIA số thứ 3 "+ z+ " bằng: "+ ketqua); // Print the sum
	}
	
}
