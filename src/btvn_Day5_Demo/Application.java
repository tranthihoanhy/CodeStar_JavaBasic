package btvn_Day5_Demo;

public class Application {

	public static void main(String[] args) {
        // Tạo đối tượng HinhTron và set thuộc tính
        HinhTron circle = new HinhTron();
        circle.setTenHinh("Hình tròn");
        circle.banKinh = 5;
        circle.tinhDienTich();
        System.out.println("Tên hình: " + circle.getTenHinh());
	}
}
