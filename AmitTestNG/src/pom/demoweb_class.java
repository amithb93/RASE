package pom;

import org.testng.annotations.Test;


public class demoweb_class extends base_class
{
	@Test(dataProvider  ="signupdata",dataProviderClass = dataprovider.class)
	public void signup(String fn,String ln, String mail, String pass)
	{
		pomclass1 pmc=new pomclass1(driver);
		pmc.reg_link();
		pmc.gender();
		pmc.FirstName(fn);
		pmc.LastName(ln);
		pmc.mail(mail);
		pmc.password(pass);
		pmc.con_pass(pass);
		pmc.regbtn();
		
		
		
	}
}
