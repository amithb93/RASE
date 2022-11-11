package amithtestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class fourthscript
{
@Test()
public void signup()
{
	System.out.println("Hey");
}
@Test(dependsOnMethods = "signup")
public void login()
{
	Assert.fail();
	System.out.println("U there");
}
@Test(dependsOnMethods = {"signup","login"})
public void cart() 
{
	System.out.println("Get lost");
}
@Test(dependsOnMethods = {"signup","login"})
public void logout()
{
	System.out.println("done with it");
}
}

 