package webElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webElements 
{
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/input") public WebElement login_username;
	@FindBy(xpath = "//html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[2]/div/div[1]/label/span") public WebElement login_checkbox;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button") public WebElement username_submit;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/form/div[2]/div/input") public WebElement password_login;
	@FindBy(xpath = "/html/body/m-auth/div/div/div[1]/div/div[2]/div/div/div/div/div/m-login/div[3]/m-spinner-button/button/span/span") public WebElement password_submit;
	@FindBy(xpath="//div[@id='user_list_hover']") public WebElement before_logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-user-profile/div/div[2]/div/div/div[5]/div[2]") public WebElement logout;
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/m-login-warning-dialog/div[2]/div/m-spinner-button/button") public WebElement popup;
	
	//Press App
	
	@FindBy(xpath="/html/body/m-modules/m-header/header/div/div/div[1]/ul/li[3]/a") public WebElement operation;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[2]/perfect-scrollbar/div/div[1]/div/div/div[1]/div[2]/div[1]") public WebElement pressOption;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]/span/span/span/span") public WebElement clientNameSelection;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/m-application-list/div/div[2]/div[1]/div[2]/span/input") public WebElement searchboxpress;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[1]/input") public WebElement clientNameInputbox;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[2]/ul/li")public WebElement clientNameselect;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[2]/div/span/span[1]/span/span[1]")public WebElement brandselect;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[1]/input") public WebElement brandNameInputbox;
	@FindBy(xpath="/html/body/div[5]/div/span/span/span[2]/ul/li")public WebElement brandnameselect;
	@FindBy(xpath="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[3]/button")public WebElement createNewEstimate;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[2]/div[1]/input")public WebElement createNewCampaign;
	
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[5]/div[1]/div/div[1]/select") public WebElement taxNameInputbox;
//	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[5]/div[1]/div/div[1]/select/option[8]")public WebElement taxNameselect;
//	@FindBy(xpath="/html/body/div[1]/div/div/div/div[3]/button")public WebElement taxselectok;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[13]/div[2]/button[1]")public WebElement newCampaignSubmit;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[6]/div/div/div/div[3]/button")public WebElement newCampaignok;
	//Press Agency Branch selction	
	
	@FindBy(xpath="/html/body/m-modules/modal-container/div[2]/m-application-user-branch/section/div[2]/perfect-scrollbar/div/div[1]/div[3]")public WebElement bangaloreBranch;

	//adding new entries
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[3]/a[2]")public WebElement newEntries;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div[2]/div/div/input[2]")public WebElement publicationCode;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div/div[2]/div[3]/div[4]/ul/li[1]")public WebElement PublicationSelection;
	@FindBy(xpath="//*[@id=\"Dimension1\"]") public WebElement spaceWidth;
	@FindBy(xpath="//*[@id=\"Dimension2\"]") public WebElement spaceHeight;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/div[7]/div[3]/div/input")public WebElement entryRate;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div/center/div[1]/button[2]")public WebElement editionSelection;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[4]/button[2]")public WebElement entysubmission;
	@FindBy(xpath="//*[@id=\"colsemodal\"]")public WebElement entryPopup;
	
	//ApproveEstimate
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/a/span")public WebElement globalEstimateview;            
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/ul/li[1]/a")public WebElement pressestimateView;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/label/input")public WebElement globalSearch;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[1]/div[2]/div/div/div[2]/table/tbody/tr/td[9]/input")public WebElement estimateApproval;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/form/div/div[9]/div[2]/input")public WebElement PoNumber;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div/div[2]/div[1]/div/div[2]/div/div/div[2]/div/form/div/div[12]/div[2]/center/input")public WebElement estimateApproved;
    
	//Scheduling
	
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[2]/ul/li[3]/a")public WebElement pressScheduling;
	//@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input")public WebElement autoScheduling;
//	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/input")public WebElement autoScheduling;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[4]/div[2]/input")public WebElement enterIns;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[5]/div[2]/input")public WebElement selectdate;
	@FindBy(xpath="/html/body/div[10]/div[1]/table/tbody/tr[3]/td[4]")public WebElement enterdate;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[4]/div/div/div/div[2]/div/div[9]/div/center/input[1]")public WebElement Proceedsch;
	              
	//Create RO     
	 @FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[3]/a/span")public WebElement globalRoview;              
	 @FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[3]/ul/li[1]/a")public WebElement pressRO;
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[7]/div[2]/button[1]")public WebElement proceedro;
	 @FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/div/div/div[3]/button[1]")public WebElement submitro;

	 //Create Client Bill
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[4]/a/span")public WebElement globalbillingview;
	@FindBy(xpath="/html/body/div[2]/div[1]/nav/ul/li[4]/ul/li[3]/a")public WebElement pressClientbill;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/form/div/div[1]/button")public WebElement generateclientbill;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[1]/div[2]/input[2]")public WebElement Manualclientbill;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[5]/div[2]/input")public WebElement allpublicationchek;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[4]/div[3]/a")public WebElement publicationsubmit;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[7]/div/div/div[1]/input")public WebElement publicationselectall;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[1]/div[2]/div/div[7]/div/div/div[1]/input")public WebElement proceedclientbill;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[1]/form/div[2]/div/div/div[2]/div/div/div/div[9]/div/div[5]/div/center/button[1]")public WebElement submitclientbill;

	
	

	

	

	
	public static String clientsearch="/html/body/div[5]/div/div/div/div[2]/div/div[1]/div[1]]";
	public webElements(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
}
