package day5_inherritance;

public class Application {
	public static void main(String args[]) {
		SinhVien1 sv1 = new SinhVien1();
		/* Lớp sinh viên kế thừa lớp người nên kế thừa cả thuộc tính name và phương thức
		 diChoi của lớp người */
		sv1.setName("Sinh vien");
		sv1.diChoi();
		// Thuộc tính và phương thức riêng của lớp sinh viên
		sv1.studentId = 12325;
		sv1.diHoc();

		GiaoVien1 gv1 = new GiaoVien1();
		/* Lớp giáo viên kế thừa lớp người nên kế thừa cả thuộc tính name và phương thức
		   diChoi của lớp người */
		gv1.setName("Giao vien");
		gv1.diChoi();
		// Thuộc tính và phương thức riêng của lớp giáo viên
		gv1.teacherId = 13;
		gv1.diDay();
	}
}
