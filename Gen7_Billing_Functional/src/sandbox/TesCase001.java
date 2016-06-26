package sandbox;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.libs.variables;

@Listeners()
public class TesCase001 extends variables{
	
	@Test
	public void Google_is_loading()
	{
		driver = com.functions.Load.Browser("https://google.com","firefox");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
