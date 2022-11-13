package pom;

import org.testng.annotations.DataProvider;

public class dataprovider
{
	@DataProvider(name="signupdata")
	public String[][] data()
	{
		String[][] arr= {{"Ronaldo","Chrsitiano","cr7@gmail.com","Ballon D'or"}};
		return arr;
	}
}
