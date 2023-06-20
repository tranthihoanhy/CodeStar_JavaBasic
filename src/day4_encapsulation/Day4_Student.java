package day4_encapsulation;

public class Day4_Student {
	public static void main(String[] args) {
		Day4_Person thongTinXeMay = new Day4_Person();
		thongTinXeMay.setTenXeMay("Vision");
		thongTinXeMay.setLoaiXeMay("Xe may");
		thongTinXeMay.setVanTocMax(90);
		System.out.println(thongTinXeMay.getXeMayinfo());
	}
}
