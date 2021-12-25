package Constructorsss;

public class Smallbox {

	int length;
	int width;
	
	Smallbox(){
		this.length = 5;
		this.width = 6;
		System.out.println("constructor is working");
	}
		Smallbox(int length, int width){
			this.length = length;
			this.width = width;		
	}
	
	void calculatearea(){
		System.out.println("area = " + (length * width));
	
	}	
}
