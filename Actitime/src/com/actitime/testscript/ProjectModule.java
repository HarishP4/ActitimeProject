package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {

	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateProject",true);
	FileLib f=new FileLib();
	String projectName = f.getExcelData("CreateCustomer", 2, 2);
	String projectdesc = f.getExcelData("CreateCustomer", 2, 3);
	
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTasksTab();
	TaskListPage t = new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewProjectOption().click();
	t.getEnterProjectNameTx().sendKeys(projectName);
	t.getCustomerDD().click();
	t.getBigBangCompanyTx1().click();
	t.getenterProjectDescriptionTbx().sendKeys(projectdesc);
	t.getCreateProjectBtn().click();
	Thread.sleep(5000);
	}
}
