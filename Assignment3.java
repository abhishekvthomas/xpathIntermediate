package Goals.XpathIntermediate;

public class Assignment3 {

	
//	Webapge-http://automationpractice.com/index.php
	
//	a. Get all checkboxes under filter criteria – Category

//	-> driver.findElements(By.xpath(".//*[@class='layered_subtitle'][text()='Categories']/../..//a");
	
//	b. Get Product Image of product name  ‘Printed Chiffon Dress’ under section special

//	-> driver.findElements(By.xpath(".//img[@title='Printed Chiffon Dress']");
	
//	c. Get product name of item having price  ‘$30.50’
	
	// -> driver.findElements(By.xpath(".//span[@class='price
	// product-price'][contains(text(),'$30.50')]/ancestor::div[@class='product-container']//a[@class='product-name']");

//	d. Total Dresses available in color ‘Yellow’ and  ‘Blue’ 
	
//	-> driver.findElements(By.xpath("//a[contains(@href, '/color-yellow') and  //a[contains(@href, '/color-blue')] ]").size();
	
//	f. Total Dresses available in color ‘Yellow’ or ‘Blue’
	
//	-> driver.findElements(By.xpath("//a[contains(@href, '/color-yellow')] | //a[contains(@href, '/color-blue')]").size();
}
