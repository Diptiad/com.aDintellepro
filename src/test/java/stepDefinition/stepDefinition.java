package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import action.login_actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
//import webElements.webElements;
public class stepDefinition
{
	//webElements element; 
	WebDriver driver;
	//driver = new chromeDriver();
	globalHooks globalhook;
	login_actions login_action;
	
	public stepDefinition(login_actions login_action)
	{
		this.login_action=login_action;
	}
	@Then("user enters username")
	public void user_enters_username() throws InterruptedException
	{
		//login_action.passUsername();
	}
	@Then("user enters the password")
	public void user_enters_the_password() throws InterruptedException
	{
		//login_action.passPassword();

	}
	@Then("user logout from the app")
	public void user_logout_from_the_app() throws InterruptedException
	{
		//login_action.logout();			
	}
	
	@Then("user lands on press app")
	public void user_lands_on_press_app(DataTable dataTable) throws InterruptedException
	{
		login_action.openPressApp(dataTable.cell(0,0));
		login_action.Branch_Selection();
		login_action.pressApp();	
	}
	
	@Then("user selects the client and brand")
	public void user_selects_the_client_and_brand(DataTable dataTable) throws InterruptedException {
		
		login_action.clientBrandSelection(dataTable.cell(1,0),dataTable.cell(1,1));	}

	@Then("user creates a new Campaign")
	public void user_creates_a_new_Campaign(DataTable dataTable) throws InterruptedException {
		
	login_action.newCampaign(dataTable.cell(0,0));}
	
	@Then("user creates a new estimate entries")
	public void user_creates_a_new_estimate_entries(DataTable dataTable) throws InterruptedException {
		
		login_action.newEntry(dataTable.cell(1,0), dataTable.cell(1,1), dataTable.cell(1,2), dataTable.cell(1,3));	}
	
	@Then("user approves the Estimate")
	public void user_approves_the_Estimate(DataTable dataTable) throws InterruptedException {
		login_action.estimateApprove(dataTable.cell(0,0));
		
	}
	@Then("user pass the PO number")
	public void user_pass_the_PO_number(DataTable dataTable) throws InterruptedException {
		login_action.enterPonumber(dataTable.cell(0,0));
	}
	@Then("user create Schduling")
	public void user_create_Schduling(DataTable dataTable) throws InterruptedException {		
	login_action.createScheduling(dataTable.cell(1,0));
	}
	@Then("user create Ro")
	public void user_create_Ro() throws InterruptedException {		
	login_action.createRO();
	}
	@Then("user create Client Bill")
	public void user_create_Client_Bill() throws InterruptedException {		
	login_action.createClientBill();
	}
	public void user_select_tax(String dropItem) throws InterruptedException
	{
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[5]/div[1]/div/div[1]/select")));	
		dropdown.selectByVisibleText(dropItem);	
	}
	

}
