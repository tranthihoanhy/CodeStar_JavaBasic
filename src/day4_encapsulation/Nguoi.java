package day4_encapsulation;

public class Nguoi {
// Bài tập tính đóng gói: Encapsolution
	/*
	 * 1. Tạo class Nguoi, thuộc tính tuỳ ý; method: getter, setter cho tất cả các thuộc
	 * 2. Tạo Class SinhVien để set giá trị cho các thuộc tính và print giá trị sau khi set
	 * 3. Tạo Class GiaoVien để set giá trị cho các thuộc tính và print giá trị sau khi set
	 * 4. Tạo method diChoi cho từng đối tượng (Sinh viên, Giáo viên) thể hiện theo cachDiChoi khác nhau
	 * 5. Tạo method tinhLuong cho Giáo viên và Bác sĩ biết lương cơ bản là 5000000, hệ số lương của bác sĩ là x2, hệ số lương của giáo viên là x1.5
	 */
	// Thực thi 1
	private String hoVaTen;
	private String ngaySinh;
	private String queQuan;
	private String soDienThoai="1234";
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	// Thêm hàm public void diChoi cho class người
	public void diChoi(String cachDiChoi)
	{
		System.out.println("Đi chơi" + cachDiChoi);
	}
	// 5.tinhLuong cho Giáo viên và Bác sĩ biết lương cơ bản là 5000000, hệ số lương của bác sĩ là x2,
	// hệ số lương của giáo viên là x1.5
	public double luong(float heSoLuong)
	{
		return 5000000 * heSoLuong;
	}
}
