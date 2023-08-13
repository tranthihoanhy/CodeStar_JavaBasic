package day4_abstraction;

public class BacSi extends Nguoi{
	static double res;
	
	@Override
	public void tinhLuong()
	{
	  res = 70000000*2;
	}
	
	@Override
	public void tinhThuong()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BacSi bs = new BacSi();
		bs.tinhLuong();
		System.out.println(res);
	}
}
