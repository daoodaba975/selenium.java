import org.openqa.selenium.WebElement;

class COMMUN {
	
	public void VerifAfficahage (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			System.out.println("L'element " +monElement + " s'affiche bien.");
		}
		else {
			System.out.println("L'element " +monElement + " ne s'est pas bien affich�, v�rifi� votre xPath..");
		}
	}
	
	public void VerifBeforeClick (WebElement monElement) {
		boolean ResultAFFICHAGE = monElement.isDisplayed();
		
		if (ResultAFFICHAGE == true) {
			monElement.click();
			System.out.println("L'�lement " +monElement + " s'est bien affich� et le click est pass�.");
		}
		else {
			System.out.println("L'�lement " +monElement + " ne s'est pas bien affich�, v�rifi� votre xPath.");
		}
	}

}
