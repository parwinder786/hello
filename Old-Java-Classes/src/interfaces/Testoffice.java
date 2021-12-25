package interfaces;

public class Testoffice {

	public static void main(String[] args) {
		Office obj = new Msworld();
		obj.open();
		obj.save();
		obj.print();
		
		obj = new Excel();
		obj.open();
		obj.save();
		obj.print();

	}

}
