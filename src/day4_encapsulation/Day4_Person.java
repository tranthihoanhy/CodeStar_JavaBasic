package day4_encapsulation;

public class Day4_Person {
	private String tenXe;
	private String loaiXe;
	private int vanTocMax;

	public String getXeMayinfo() {
		return ("Ten xe la " + tenXe + "\nLoai xe la: " + loaiXe + "\nVan toc lon nhat la: " + vanTocMax);
	}

	public int vanTocMax() {
		return vanTocMax;
	}

	public void setTenXeMay(String newTenXeMay) {
		this.tenXe = newTenXeMay;
	}

	public void setLoaiXeMay(String newLoaiXeMay) {
		this.loaiXe = newLoaiXeMay;
	}

	public void setVanTocMax(int VanTocMax) {
		this.vanTocMax = VanTocMax;

	}
}
