package HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank2 {
	
	

	    // Complete the solve function below.
	    static void solve(double meal_cost, double tip_percent, double tax_percent) {
	           if(tip_percent>0){
	        	           tip_percent= (double) (tip_percent*meal_cost/100);
	        	           tax_percent= (double)(tax_percent*meal_cost/100);
	        	   
	               meal_cost=meal_cost+tip_percent+tax_percent;
	               
	               
	           }else{
	        	   tax_percent= (double)(tax_percent*meal_cost/100);
	               meal_cost=meal_cost+tax_percent;
	           }
                System.out.println((int)Math.round(meal_cost));
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);

	        scanner.close();
	    }
	}


