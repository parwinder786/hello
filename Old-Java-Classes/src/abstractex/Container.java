package abstractex;

public abstract class Container {
public void calculatevolume(int length, int height){
	double volume = calculateareaofbase(length) * height;
	System.out.println("volume " + volume);
	
}

public abstract double calculateareaofbase (int length);

}

