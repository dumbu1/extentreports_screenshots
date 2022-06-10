package commonMethods;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecificToSelenium {
	
	public static void validate_PageTitle(WebDriver driver,String expectedPageTitle) {
		
		Assert.assertEquals("window title "+expectedPageTitle+" doesnot match",expectedPageTitle, driver.getTitle());
		
	}
	
	/***
	 * @author Krishna Mohan
	 * To click on webelement
	 * @param link
	 */
	public static void click(WebElement link ) {
		link.click();
	}
	
	/***
	 * To enter data in text field
	 * @author Krishna Mohan
	 * @param textBox
	 * @param dataToEnter
	 */
	public static void enterText_TextField(WebElement textBox,String dataToEnter) {
		textBox.sendKeys(dataToEnter);
	}
	
	/***
	 * to check the text in a page
	 * @author Krishna Mohan
	 * @param element
	 * @param expectedText
	 */
	public static void check_Text(WebElement element,String expectedText) {
		Assert.assertEquals("expected page not opened",expectedText, element.getText());
	}
	
	/***
	 * for switching to current window
	 * @author Krishna Mohan
	 */
	public static void switch_To_Current_Window(WebDriver driver) {
		
		String parentWindow=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		
		for (String windowHandle : handles) {
			if(!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
			}
		}
		
		/*Iterator<String> iteratorWindowHandles=handles.iterator();
		while(iteratorWindowHandles.hasNext()) {
			String parent=iteratorWindowHandles.next();
			String child=iteratorWindowHandles.next();
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}*/
		
		
		
		
	}

}
