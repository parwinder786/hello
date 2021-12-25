package abstractex;

public class Testcontainer {

	public static void main(String[] args) {
	//Circlecontainer c1= new Circlecontainer(); superclass object=subclass
		Container c1 = new Circlecontainer();
		
	c1.calculatevolume(10, 5);
	//Sqaurecontainer s1 = new Sqaurecontainer ();//superclass  object=subclass
	//Container c1 = new Sqaurecontainer();
	c1 = new Sqaurecontainer();
	
	c1.calculatevolume(10, 5);
	

	}

}
