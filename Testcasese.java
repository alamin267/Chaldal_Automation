package Test.com.Protonics;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class Testcasese extends base{
	
	@Test
	public void protonicsTest() throws IOException, InterruptedException {
		

		AndroidDriver<AndroidElement> driver = capabilities();
		

		PageObjects fpage = new PageObjects(driver);
		
		//click on the search button
		fpage.search.click();
		Thread.sleep(1000);
		
		//click on the pop-up message.
		fpage.Click_on_Deny.click();
	
		//search by Toothbrush
		fpage.sendText.sendKeys("toothbrush");

		//hide keyboard
		driver.hideKeyboard();

        //scrolling down 
		AndroidElement PermissionElement = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Colgate Charcoal Gold 360 Toothbrush\"))");
		PermissionElement.click();
		Thread.sleep(3000);
		//Click on the item
		fpage.Click_on_Toothbrush.click();
		Thread.sleep(500);
		//fpage.Click_on_Toothbrush.click();
	
		//click on the plus icon 3 times.
		//System.out.print("Done");
		fpage.plusIcone.click();
		Thread.sleep(500);
		for (int i = 0; i < 2; i++) 
		{
			fpage.plusIcone2ndTime.click();
			Thread.sleep(500);
	    }	
		Thread.sleep(1000);
		
		//click on the close button
		fpage.closeButton.click();
		Thread.sleep(500);
		
		//click on the cart
		fpage.goTotheCart.click();
		Thread.sleep(500);
		//System.out.print("cart complete");
		
		//delete item
		for (int i = 0; i < 3; i++) 
		{
			fpage.deleteItem.click();
			Thread.sleep(500);
	    }
		//System.out.print("deleted");
		
		//assertion
		String actualtext = "Nothing to see here";
		String getText = fpage.nothing_to_see_here_text.getText();
			
		assertEquals(actualtext, getText);
		System.out.println("Assertion Done");
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.quit();



		

	}
	
	



}
