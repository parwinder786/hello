package ToGetRequest;




import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Practise {
	
	@Test
public void get(){
	
Response resp=	RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1");
int code = resp.getStatusCode();
System.out.println("code is  = "+code);
Assert.assertEquals(code, 200);

}

}
