package challengesChapter5ControlFlow;

public class flourPacker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("is the supply & demand values are matching =  "+canPack(1,3,6));

	}
	
	public static boolean canPack(int bigCount,int smallCount,int goal) {
		if(bigCount<0 || smallCount<0 || goal <0) {  
			return false;
		}
		if(bigCount*5 +smallCount<goal) {  //supply must be greater than demand
			return false;
		}
		return (goal%5<=smallCount); //regardless of big count, remainder of goal has to be less than smallCount
	}

}
