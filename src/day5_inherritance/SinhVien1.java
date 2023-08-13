package day5_inherritance;

public class SinhVien1 extends Nguoi {
	// Lớp sinh viên kế thừa lớp người

	public int studentId;
	// hàm đi học là hàm riêng
	public void diHoc() {
		System.out.println(getName() + " Ma so sinh vien: " + studentId + " di hoc thoi!");
	}

	// hàm chung của tất cả các đối tượng và cần overriding
	@Override
	public void diChoi() {
		System.out.println(getName() + " Hoc xong roi, di choi thoi!");
	}
}
