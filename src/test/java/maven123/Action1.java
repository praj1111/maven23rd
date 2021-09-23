package maven123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {
@Test
public void demo1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/elements");
	/*driver.findElement(By.xpath("//li[@id='item-4']")).click();
    WebElement element=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	Actions act=new Actions(driver);
	//act.moveToElement(element).doubleClick().build().perform();
	//act.doubleClick(element).build().perform();
	//act.moveToElement(element).contextClick().build().perform();
	act.contextClick(element).build().perform();*/
	driver.findElement(By.xpath("//li[@id='item-5']")).click();
	driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
	
	
}
}