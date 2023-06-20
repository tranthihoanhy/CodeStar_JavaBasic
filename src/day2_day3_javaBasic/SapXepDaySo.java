package day2_day3_javaBasic;

import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class SapXepDaySo {

	private void increaseOrder(int arr[]) { 
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println("LAN LAP THU " + i + " CUA TOAN BO MANG CHA BAN DAU :");
			for (int j = 0; j < arr.length - i - 1; j++) { 
				System.out.println("Lan lap thu " + j + " de so sanh 2 so lien tiep nhau: " + arr[j] + " va " + arr[j + 1]);
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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
	
	private void printArray(int arr[]) {
		int n = arr.length;
		System.out.println("===Các giá trị của dãy số là===");
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main1(String[] args) {
		System.out.println("==Cho day so ban dau la: 5, 1, 4, 2, 8, 7, 3, 0, 6 ====");
		int arr[] = { 5, 1, 4, 2, 8, 7, 3, 0, 6 };
		SapXepDaySo order = new SapXepDaySo();
		order.increaseOrder(arr);
		order.printArray(arr);
		int outputNumber = ((1123*6745)/ 500);
		System.out.println("Ket qua cua phep tinh la: "+outputNumber);
		order.printLargerNumber(321, 234);
	}
	
	public static void main(String[] args) {
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
