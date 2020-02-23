package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.browsers;
//import Site.pages.Home;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Testdata extends browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) throws InterruptedException {
	  Home h=new Home(driver);
	  Reporter.log("Executed successfully .");
		h.Emailidfield(n);
		h.psswordfield(s);
		h.loginbt();
		driver.navigate().back();
		h.empty();
	Thread.sleep(6000);
	
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "shahbaz@gmail", "a" },
      new Object[] { "zoha@gmail.com", "b" },
      new Object[] {"payman@gmail.com","c"}
    };
  }
}
