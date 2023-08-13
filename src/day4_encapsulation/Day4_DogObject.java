package day4_encapsulation;

public class Day4_DogObject {
	// Objects instance - các đối tượng thể hiện của lớp gồm
	    //1. Thuộc tính
	   private String breed;
	   private String size;
	   private int age;
	   private String color;
	   
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}   
}
