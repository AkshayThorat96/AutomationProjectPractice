import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement user= driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("Admin");Thread.sleep(3000);
		
    	WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");Thread.sleep(3000);
		
		WebElement clickbu= driver.findElement(By.xpath("//button[@type='submit']"));
		clickbu.click();

	//	driver.close();
	
	}

}
