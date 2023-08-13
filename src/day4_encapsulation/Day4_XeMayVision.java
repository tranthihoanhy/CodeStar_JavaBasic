package day4_encapsulation;

public class Day4_XeMayVision {
	public static void main(String[] args) {
		Day4_Motobike thongTinXeMay = new Day4_Motobike();
//		thongTinXeMay.tenXe ="Vision";
//		System.out.println(tenXe);
		
		thongTinXeMay.setTenXeMay("Vision");
		thongTinXeMay.setLoaiXeMay("Xe may");
		System.out.println(thongTinXeMay.getXeMayinfo());
		thongTinXeMay.setVanTocMax(90);
		
	}
}
