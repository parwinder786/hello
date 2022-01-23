package challengesChapter6;

import challengesChapter5ControlFlow.Calculator;
import challengesChapter5ControlFlow.Carpet;

public class FloorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carpet carpet = new Carpet(3.5);

		Floor floor = new Floor(2.75, 4.0);

		Calculator cal = new Calculator(floor, carpet);
		System.out.println("total " + cal.getTotalCost());
		
		carpet = new Carpet(1.5);
		floor = new Floor(5.4,4.5);
		cal = new Calculator(floor,carpet);
		System.out.println("total "+ cal.getTotalCost());

	}

}
