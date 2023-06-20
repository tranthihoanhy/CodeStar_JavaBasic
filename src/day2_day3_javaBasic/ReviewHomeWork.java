package day2_day3_javaBasic;
import java.util.Scanner;
public class ReviewHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method istub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của dãy: ");		
		int n = scanner.nextInt();
		System.out.println("Nhập vào các phần tử của dãy: ");
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhập vào phần tử thứ: " +i);
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Dãy số ban đầu: ");
		for (int i=0; i<n; i++) {
			System.out.println(arr[i] + "\t");
		}
		order(arr);
		printArray(arr);
	}
	
	public static void order(int arr[]) {
		
		int temp;
		for (int i =0; i< arr.length-1;i++) {
			System.out.println("LAN LAP THU "+ i +
					" CUA TOAN BO MANG CHA BAN DAU");
			for (int j=0; j< arr.length - i-1; j++) {
				System.out.println("Lan lap thu "+ j + 
						" de so sanh 2 so lien tiep: "
						+ arr[j] + " va "+ arr[j+1]);
				if (arr[j]<arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
		}
		
	}
	}
	
	private static void printArray(int arr[]) {
		int n = arr.length;
		System.out.println(" ---Cac gia tri cua day so la----");
		for (int i = 0; i<n; ++i)
			System.out.println(arr[i] + " ");
			
}
}
