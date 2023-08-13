package day5_inherritance;

public abstract class Nguoi {
    private String name;
    //hàm đi chơi là hàm chung của tất cả các đối tượng SinhVien và GiaoVien nhưng lại xử lý khác nhau cho từng ông
    public abstract void diChoi();
    
    public void setName(String _name)
	{
		this.name = _name;
	}
	public String getName()
	{
		return name;
	}
}





