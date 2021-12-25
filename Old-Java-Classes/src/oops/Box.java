package oops;

public class Box {
	void calculatearea(int length){
		System.out.println("area = " + length*length);
	}
      void calculatearea(double length){
    	  System.out.println("double area = " + length*length);
      }
      void calculatearea(int length, int width){
    	  System.out.println("area = " + length*width);
      }
}
