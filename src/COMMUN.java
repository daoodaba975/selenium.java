import org.openqa.selenium.WebElement;

class COMMUN {
	
	public void VerifAfficahage (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			System.out.println("L'element " +monElement + " s'affiche bien.");
		}
		else {
			System.out.println("L'element " +monElement + " ne s'est pas bien affiché, vérifié votre xPath..");
		}
	}
	
	public void VerifBeforeClick (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			monElement.click();
			System.out.println("L'élement " +monElement + " s'est bien affiché et le click est passé.");
		}
		else {
			System.out.println("L'élement " +monElement + " ne s'est pas bien affiché, vérifié votre xPath.");
		}
	}

}
