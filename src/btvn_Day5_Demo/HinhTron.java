package btvn_Day5_Demo;

public class HinhTron extends HinhHoc {
	public int banKinh;

	@Override
	public void tinhDienTich() {
		double S = 2 * 3.14 * banKinh;
		System.out.println("Dien tich hinh tron = " + S);
	}
}
