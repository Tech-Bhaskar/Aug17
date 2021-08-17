package script;

import org.testng.annotations.Test;

import generic.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NewTest extends BaseTest {
  @Test
  public void TestA() {
	  Reporter.log("TestA",true);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
