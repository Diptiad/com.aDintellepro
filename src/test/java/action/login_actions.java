package action;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.globalHooks;
import webElements.webElements;

public class login_actions
{
	private WebDriver driver;
	webElements element;
	WebDriverWait wait;
	public login_actions(globalHooks globalhook) 
	{
		this.driver = globalhook.getDriver();
		element = new webElements(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}		
		
	public void passUsername() throws InterruptedException {
		element.login_username.sendKeys("Kashmirar");
		element.login_checkbox.click();
		element.username_submit.click();
		Thread.sleep(3000);
	}

	public void passPassword() throws InterruptedException {
		element.password_login.sendKeys("Kashmira@123$");
		element.password_submit.click();
		Thread.sleep(3000);

		if (element.popup.isDisplayed()) {
			element.popup.click();
		}
	}
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		element.before_logout.click();
		Thread.sleep(5000);
		element.logout.click();
	}

   public void openPressApp(String string) throws InterruptedException 
   {
	Thread.sleep(2000);
	element.operation.click();
	Thread.sleep(5000);
	element.searchboxpress.sendKeys(string);
	element.pressOption.click();
	
   }
		   
   public void Branch_Selection()  
	{
	try
		{
			element.bangaloreBranch.isDisplayed();
			element.bangaloreBranch.click();
		}
	catch(NoSuchElementException exception)
		{
	 	 // exception.printStackTrace();
		}
	}
			  
       public void clientBrandSelection(String client1, String brand1) throws InterruptedException 
       {
			Thread.sleep(5000);
		    driver.switchTo().frame("appIframe");
			element.clientNameSelection.click();
			Thread.sleep(5000);
			element.clientNameInputbox.click();
			element.clientNameInputbox.sendKeys("ABC");
			Thread.sleep(5000);
			element.clientNameselect.click();
			Thread.sleep(3000);
			//brand selection
			element.brandselect.click();
			Thread.sleep(3000);
			element.brandNameInputbox.sendKeys("5 Star");
			Thread.sleep(3000);
			element.brandnameselect.click();
			Thread.sleep(3000);
		}
		public void newCampaign(String string) throws InterruptedException 
		{
			element.createNewEstimate.click();
			Thread.sleep(3000);			
			element.createNewCampaign.click();
			element.createNewCampaign.sendKeys("Auto New Camp ABC 5");
		    Thread.sleep(3000);		    
			element.newCampaignSubmit.click();
			Thread.sleep(3000);			
			element.newCampaignok.click();
			Thread.sleep(3000);
		}
		public void newEntry(String publication,String width, String height, String rate)throws InterruptedException 
		{
				element.newEntries.click();
				Thread.sleep(3000);
				element.publicationCode.click();
				element.publicationCode.sendKeys(publication);
				Thread.sleep(3000);
				element.PublicationSelection.click();			
				Thread.sleep(5000);
				element.spaceHeight.click();
				Thread.sleep(3000);
				element.spaceHeight.sendKeys(height);			
				Thread.sleep(3000);
				element.spaceWidth.click();
				Thread.sleep(3000);
				element.spaceWidth.sendKeys(width);			
				Thread.sleep(3000);
				element.entryRate.click();
				element.entryRate.clear();
				element.entryRate.sendKeys(rate);	
				Thread.sleep(5000);
				element.editionSelection.click();
				Thread.sleep(3000);
				element.entysubmission.click();
				Thread.sleep(3000);
				element.entryPopup.click();
				Thread.sleep(5000);
			}
			
			public void estimateApprove(String estimateName) throws InterruptedException
			{
				element.globalEstimateview.click();
				Thread.sleep(3000);
				element.pressestimateView.click();
				Thread.sleep(3000);
				element.globalSearch.click();
				element.globalSearch.sendKeys(estimateName);
				Thread.sleep(5000);
				element.estimateApproval.click();
				Thread.sleep(3000);	
			}
			public void enterPonumber(String ponumber) throws InterruptedException
			{
				element.PoNumber.click();
				element.PoNumber.sendKeys(ponumber);
				Thread.sleep(3000);
				element.estimateApproved.click();	
				Thread.sleep(3000);	
			}
			
			public void createScheduling(String INS) throws InterruptedException
			{
				element.pressScheduling.click();	
				Thread.sleep(3000);	
				//element.autoScheduling.click();	
				Thread.sleep(3000);	
				element.enterIns.click();
				element.enterIns.sendKeys(INS);
				element.selectdate.click();
				element.enterdate.click();
				Thread.sleep(3000);
				element.Proceedsch.click();	
			}
			public void createRO() throws InterruptedException
			{				
				element.globalRoview.click();
				Thread.sleep(3000);
				element.pressRO.click();
				Thread.sleep(3000);
				element.proceedro.click();
				Thread.sleep(3000);
				element.submitro.click();
				Thread.sleep(3000);
			}
			public void createClientBill() throws InterruptedException
			{
				element.globalbillingview.click();
				Thread.sleep(3000);
				element.pressClientbill.click();	
				Thread.sleep(3000);	
				element.generateclientbill.click();	
				Thread.sleep(3000);	
				element.Manualclientbill.click();	
				Thread.sleep(3000);	
				element.allpublicationchek.click();	
				Thread.sleep(3000);
				element.publicationsubmit.click();	
				Thread.sleep(3000);
				element.publicationselectall.click();	
				Thread.sleep(3000);
				element.proceedclientbill.click();	
				Thread.sleep(3000);
				element.submitclientbill.click();	
				Thread.sleep(3000);
			}

			public void pressApp() 
			{
				// TODO Auto-generated method stub		
			}
}