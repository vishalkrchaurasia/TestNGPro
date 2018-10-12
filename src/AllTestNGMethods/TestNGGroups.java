package AllTestNGMethods;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGGroups {

	@BeforeClass(alwaysRun=true)//run this method irrspective of groups
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@Test(priority=1,groups={"user","smoke"})
	public void createUser()
	{
		Reporter.log("CreateUser",true);
	}
	
	@Test(priority=2,groups={"user"},enabled=false)
	public void editUser()
	{
		Reporter.log("editUser",true);
	}
	
	@Test(priority=3,groups={"user"})
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}
	
	@Test(priority=4,groups={"product","smoke"})
	public void createProduct()
	{
		Reporter.log("CreateProduct",true);
	}
	
	@Test(priority=5,groups={"product"})
	public void deleteProduct()
	{
		Reporter.log("deleteProduct",true);
	}
}
