package day4_encapsulation;
import day4_encapsulation.Nguoi;
public class SinhVien{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nguoi sinhvien1 = new Nguoi();
		sinhvien1.setHoVaTen("Nguyễn Văn A");
		sinhvien1.setQueQuan("Hà Nội");
		sinhvien1.setNgaySinh("01/04/2000");
		System.out.println("Họ và tên: " +sinhvien1.getHoVaTen() + "\nNgày sinh: "+sinhvien1.getNgaySinh()+
				"\nSố điện thoại:" +sinhvien1.getSoDienThoai() + "\nQuê quán: " +sinhvien1.getQueQuan());
		sinhvien1.diChoi("Sau khi làm xong bài tập");// Đi chơi
	}
}
