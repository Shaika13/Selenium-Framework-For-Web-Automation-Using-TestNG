package teqPages;


import org.openqa.selenium.By;

import teqtestCases.TeqBase;

//import org.openqa.selenium.support.FindBy;

public class NewRequestPage extends TeqBase {
	
	

	//Login Page
	
	 public By SignUpBtn= By.xpath("//div//following-sibling::a[contains(text(),\"Signup\")]");
	
	 public By VerifySignUpPage= By.xpath("//p[contains(text(),\"Please\")]");
	 public By FirstName=By.name("first_name");
	 public By LastName=By.name("last_name");
	 public By Phone=By.name("phone");
	 public By Email=By.name("email");
	 public By Password=By.name("password");
	 public By Customer=By.xpath("//span[@id=\"select2-account_type-container\"]");
	 public By SignUp=By.xpath("//button//span[contains(text(),\"Sign\")]");
	 
	 
	 
	 //New Request ROUTE page
	 
	    
   
    
  public void SignUp(String fname,String lname,String phone,String email,String pass) throws Exception{
	  
	  	clickElement(SignUpBtn);
		boolean elementResult1=driver.findElement(VerifySignUpPage).isDisplayed();
		
	    if(elementResult1==true)
	    {
	        logger.info("Sign Up page opened successfully");
	    }
	    else
	    {
	        captureScreen(driver,"SignupError");
	        
	    }
	    verifyElementAndDataEntry(driver,FirstName,fname);
	    verifyElementAndDataEntry(driver,LastName,lname);
	    verifyElementAndDataEntry(driver,Phone,phone);
	    verifyElementAndDataEntry(driver,Email,email);
	    verifyElementAndDataEntry(driver,Password,pass);
	    clickElement(SignUp);
	    

	  
  } 
}
 


