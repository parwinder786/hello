package ToGetRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
		@Test 
public void testResponce()
                         {
   //Restassured class have no of inbuilt methods--get method we are using here
  //responce is interfacde here and whatever responce will come will be stored in responce object
 Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
  int code= resp.getStatusCode(); 
  System.out.println("status code is "+code);
  Assert.assertEquals(code,200);
               }	
	@Test 
    public void testbody()
{
Response resp= RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
String data = resp.asString();
System.out.println("data is in string format = "+data);
System.out.println("responce time = "+resp.getTime());
    }
}
