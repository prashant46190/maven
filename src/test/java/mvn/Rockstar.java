package mvn;

import org.testng.annotations.Test;

public class Rockstar {
	@Test
	public void rockstar()
	{
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);

		System.out.println("I'm a Rockstar");
	}

}
