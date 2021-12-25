package superex;

public class SubBox extends Box {
	public void caculatevolume(int length,int width ,int height){
		double volume = super.calculatearea(length, width) * height;
		System.out.println("volume = " + volume);
	}

}
