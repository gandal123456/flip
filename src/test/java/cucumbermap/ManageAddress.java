package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class ManageAddress 
{

	@When("^user click on manage address$")
	public void user_click_on_manage_address() throws Throwable
	{
		Thread.sleep(10000);
		//click on manage address
		Object [] input1=new Object[1];
		input1[0]="(//*[@class='NS64GK'])[1]";
		SeleniumOperation.click(input1);
	}

	@When("^user click on ADD A NEW ADDRESS$")
	public void user_click_on_ADD_A_NEW_ADDRESS() throws Throwable 
	{
		
		//click on add new address
		Object [] input2=new Object[1];
		input2[0]="//*[@class='_1QhEVk']";
		SeleniumOperation.click(input2);
	   
	}

	@When("^user enter \"([^\"]*)\" as name$")
	public void user_enter_as_name(String name) throws Throwable 
	{

		
		 //enter name
		Object []input3=new Object[2];
		input3[0]="//*[@name='name']";
		input3[1]=name;
		SeleniumOperation.sendKey(input3);
	}

	@When("user enter \"(.*)\" as mobile number")
	public void user_enter_mobileNumber(String mnumber) throws Throwable 
	{
		 //enter name
		Object []input4=new Object[2];
		input4[0]="//*[@name='phone']";
		input4[1]=mnumber;
		SeleniumOperation.sendKey(input4);
	}
	@When("^user enter \"([^\"]*)\" as pincode$")
	public void user_enter_as_pincode(String pcode) throws Throwable
	{
		 //enter pcode
		Object []input5=new Object[2];
		input5[0]="//*[@name='pincode']";
		input5[1]=pcode;
		SeleniumOperation.sendKey(input5);
	}

	@When("^user enter \"([^\"]*)\" as locality$")
	public void user_enter_as_locality(String locality) throws Throwable 
	{
		 //enter locality
		Object []input6=new Object[2];
		input6[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input6[1]=locality;
		SeleniumOperation.sendKey(input6);
	}

	@When("^user enter \"([^\"]*)\" as address$")
	public void user_enter_as_address(String address) throws Throwable
	{
		 //enter username
		Object []input7=new Object[2];
		input7[0]="//*[@name='addressLine1']";
		input7[1]=address;
		SeleniumOperation.sendKey(input7);
	}

	@When("^user click on Save button$")
	public void user_click_on_Save_button() throws Throwable
	{
		Thread.sleep(5000);
		Object [] input8=new Object[1];
		input8[0]="//*[text()='Save']";
		SeleniumOperation.click(input8);
	}

	@Then("^validate address is added successfully$")
	public void validate_address_is_added_successfully() throws Throwable 
	{
		//validate Login test case
				Object [] input9=new Object[2];
				input9[0]="9309146478";
				input9[1]="(//*[@class='_1Z7fmh _3CfVDh'])[1]";
				SeleniumOperation.validation(input9);        
	}


	
	
	
}
