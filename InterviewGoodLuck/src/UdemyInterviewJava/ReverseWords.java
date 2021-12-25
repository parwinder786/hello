package UdemyInterviewJava;

public class ReverseWords {

	public static void main(String[] args) {


		  String str ="i love guru ji and jaspreet kaur and my mom ";
		  
		 // String [] arr =str.split(" ");    //split method retrun the array
		  String [] arr =str.split("\\s");     //    \\s also means we are spliting on based on space
		  /*for (String ab:arr) {
			  System.out.print(ab);
		  }*/
		  String result ="";   //defining result variable to store results
		  
		  for(int i =arr.length-1; i>=0;i--) {  //arr.length-1 ->iterating from last of length, i>=0 till 0
			  
			  result = result+arr[i]+ " ";  //result will take input from last chracters from arry and add in result variable
			  
			  
			  
		  }
		  
		System.out.println(result);
		
	}

}
