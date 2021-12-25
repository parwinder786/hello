package Study2;

import org.omg.Messaging.SyncScopeHelper;

public class PractiseOne {
	       
  int a;
   int b;
   
   PractiseOne(){
	   this.a =2;
	   this.b=4;
	   
   }
   
   PractiseOne(int a, int b){
	   this.a=a;
	   this.b=b;
	   
	   
   }
   
   
     void add(){
    	 int c= a+b;
    	 System.out.println(c);
    	
     }
}
