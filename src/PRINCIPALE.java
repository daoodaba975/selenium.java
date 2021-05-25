import org.openqa.selenium.WebDriver;

public class PRINCIPALE {
	
	static WebDriver driver ;
	public static void main(String[] args) {
		
		// REGLAGES-PAR-DEFAUTS
		REGLAGES instanceRules = new REGLAGES();
		instanceRules.Rules(driver);
        
        // HAUT-DE-PAGE
        HautDePage instanceHautDePage = new HautDePage();
        instanceHautDePage.navigate_HP(driver);
        //instanceHautDePage.navigate2_HDP(driver);
        
        /* MILIEU-DE-PAGE
        MilieuDePage instanceMilieuDePage = new MilieuDePage();
        instanceMilieuDePage.test1(driver);
        
        // PIED-DE-PAGE
        PiedDePage instancePiedDePage = new PiedDePage();
        instancePiedDePage.test2(driver); */
        
        //driver.close();
	}
}