  package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement enterProjectNameTx;

	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement CustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement BigBangCompanyTx;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement enterProjectDescriptionTbx;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement CreateProjectBtn;
	
	/////
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath=" //input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNameTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDescriptionTbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustomer;
	
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {  
		return addNewBtn;
	}
	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}
	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}
	public WebElement getEnterCustDescriptionTbx() {
		return enterCustDescriptionTbx;
	}
	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}
	public WebElement getBigBangCompanyTx() {
		return bigBangCompanyTx;
	}
	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	public WebElement getActualCustomer() {
		return actualCustomer;
	}
	////
	public WebElement getNewProjectOption() {
		return newProjectOption;
	}
	public WebElement getEnterProjectNameTx() { 
		return enterProjectNameTx;
	}
	public WebElement getCustomerDD() {
		return CustomerDD;
	}
	public WebElement  getBigBangCompanyTx1() {
		return BigBangCompanyTx;
	}
	public WebElement getenterProjectDescriptionTbx() {
	return  enterProjectDescriptionTbx;
	}
	public WebElement getCreateProjectBtn() {
		return CreateProjectBtn;
	}
}
