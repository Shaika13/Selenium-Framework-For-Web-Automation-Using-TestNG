package teqtestCases;

import org.testng.annotations.Test;

import teqPages.NewRequestPage;

public class NewRequestTest extends TeqBase {
	
	 public NewRequestPage newrequest;

	
	

	@Test(priority=1,dataProvider = "Signup", dataProviderClass = teqTestData.TeqTestDataProvider.class)
	public void Signup(String fname,String lname,String phone,String email,String password) throws Exception
	{   
		
		newrequest=new NewRequestPage();	
		newrequest.SignUp(fname, lname, phone, email, password);
		logger.info("Signed Up Successfully");
		
		
	}
	
}

	
