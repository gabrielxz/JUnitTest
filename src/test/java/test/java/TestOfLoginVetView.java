
package test.java;
 
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
 
 
public class TestOfLoginVetView {
     private WebDriver driver;
     private WebDriverWait wait;
     private String baseURL = "http://localhost:8080/VetView-0.9.2.5PreBuild";
    
      @Before
      public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get(baseURL + "/labs/home.zul");
      }
      @After
      public void tearDown() throws IOException {
        driver.quit();
      } 
 
      @Test
      public void checkLogin() throws IOException 
      {
	    assertEquals("Login", driver.getTitle());
	    //driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	    //driver.get(baseUrl + "/Hosp/hospital/home.zul");
	    //assertEquals("VetView", driver.getTitle());
      }
      
            
      
    
}