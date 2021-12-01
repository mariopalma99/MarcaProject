package pages

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class GenericPage {
	
	private TestObject btnAcceptCookies
	
	@Keyword
	def clickAcceptCookies() {
		btnAcceptCookies = findTestObject('GenericPage/btnAcceptCookies')
		if(WebUI.verifyElementPresent(btnAcceptCookies, GlobalVariable.TIMEOUT, FailureHandling.OPTIONAL)) {
			WebUI.click(btnAcceptCookies)
		}
	}
	
	@Keyword
	def printFile(List<String> values) {
		PrintWriter pw = new PrintWriter("Data Files/teamsNames.txt")
		for(int i=0; i<values.size(); i++) {
			pw.println(values[i])
		}
		pw.close()
	}
}
