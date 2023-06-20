package day4_encapsulation;

public class Day4_DogObject {
	// Objects instance - các đối tượng thể hiện của lớp gồm
	    //1. Thuộc tính
	    String breed;
	    String size;
	    int age;
	    String color;
        //2. Phương thức
	    public String getInfo() {
	        return ("Breed is: "+breed+" Size is:"+size+" Age is:"+age+" color is: "+color);
	    }
	    
	    public static void main(String[] args) {
	    	Day4_DogObject becgie = new Day4_DogObject();
	    	becgie.breed="Becgie";
	    	becgie.size="Big";
	    	becgie.age=2;
	    	becgie.color="Brown";
	        System.out.println(becgie.getInfo());
	}}
