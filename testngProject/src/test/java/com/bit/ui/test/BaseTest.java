package com.bit.ui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
 // @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
  //}
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("am");
	  System.out.println("open browser");
  }

//
//  @DataProvider
// // public Object[][] dp() {
// //   return new Object[][] {
// //     new Object[] { 1, "a" },
//  //    new Object[] { 2, "b" },
//    };
  //}
  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
	  System.out.println("generate report");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
