import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MilieuDePage {
	
	COMMUN thisAffiche = new COMMUN();
	COMMUN thisClick = new COMMUN();
	
	//WebElement Help = driver.findElement(By.xpath("//a[@href='/faq']"));
	
	public void navigate_MP(WebDriver driver) {
		
		WebElement linkFindaStore = driver.findElement(By.xpath("//a[@href='/store-finder']"));
		
		thisAffiche.VerifAfficahage(linkFindaStore);
		
		//linkFindaStore.click();
        //driver.navigate().back();
        
        
        //driver.close();
	}
	
	public void navigate2_MP(WebDriver driver) {
		
		WebElement ContactUs = driver.findElement(By.xpath("//a[@href='http://www.cx.sap.com/contact']"));
		
		thisClick.VerifBeforeClick(ContactUs);
        
        //driver.close();
	}
}