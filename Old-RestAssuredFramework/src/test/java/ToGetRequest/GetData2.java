package ToGetRequest;
import static io.restassured.RestAssured.*;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;

public class GetData2 {
		@Test 
public void testResponce(){

 //Response resp=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
  int code= get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1").getStatusCode();
  System.out.println("status code is "+code);
  Assert.assertEquals(code,200);
               }	
	@Test 
    public void testbody()
{
//Response resp= get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
String data = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1").asString();
long time =get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1").getTime();
System.out.println("data is in string format = "+data);
System.out.println("responce time = "+time);
    }
}
