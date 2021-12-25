package abstractex;

public class Circlecontainer extends Container {

	
	public double calculateareaofbase(int length) {
		         
		double area = Math.PI * (length/2)*(length/2);
		System.out.println("cirlce area = " + area);
		return area;
	}

}
