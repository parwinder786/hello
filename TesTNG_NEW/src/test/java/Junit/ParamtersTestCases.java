package Junit;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class) //first step
public class ParamtersTestCases {
	                   //second step defining parameters
	                  String firstname;
	                  String lastname;
	                  String password;
	                  String age;	                  
	                  //3rd step to create constructor which will initialize these variables
	                  
	                  public ParamtersTestCases(String firstname, String lastname, String password, String age) {
	                	  this.firstname= firstname;
	                	  this.lastname=lastname;
	                	  this.password =password;
	                	  this.age =age;
	                	  
	                  }
	                  //fourth step
	                  @Parameters
	                  public static Collection<Object[]>getData()
	                  {
	                	 Object[][] data = new Object[2][4];
	                	 data[0][0]="joy";
	                	 data[0][1]="hhh";
	                	 data[0][2]="hhhddd";
	                	 data[0][3]="hhhrrr";
	                	 
	                	 data[1][0]="hhh";
	                	 data[1][1]="hhh";
	                	 data[1][2]="hhh";
	                	 data[1][3]="hhh";
	                	 return Arrays.asList(data);
	                	 
	                	 
	                	 
	                  }
	                  
	                  @Test
	                  public void dologin() {
	                	  
	                	  System.out.println(firstname+"  -----"+lastname+"---------"+password+"--------"+age);
	                  }

}
