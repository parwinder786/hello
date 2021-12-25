package HackerRank;

public class TestGetterSetters {

	           int minspeed;
	           int maxspeed=10;
	           
	           //setters
	           public int getmaxspeed() {
	        	   
	        	   return this.maxspeed;
	           }
	           public void setmaxspeed(int newmaxspeed) {
	        	       this.maxspeed= newmaxspeed;
	           }
	           
	           public void upgrademaxspeed() {
	           	   
	           	   setmaxspeed(getmaxspeed()+10);
	           	   System.out.println("the max speed");
	              }
	           
	           
	           
	public static void main(String[] args) {
		
		TestGetterSetters obj = new TestGetterSetters();
		
          obj.upgrademaxspeed();
        
	}

}
