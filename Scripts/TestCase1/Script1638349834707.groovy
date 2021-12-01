import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import pages.GenericPage
import pages.IndexPage

// open Marca in browser
WebUI.openBrowser(GlobalVariable.URL)
WebUI.maximizeWindow()

// accept cookies
def genericPage = new GenericPage()
genericPage.clickAcceptCookies()

// get teams and save in file
def indexPage = new IndexPage()
List<String> teamsNames = indexPage.getTeamsNames()
genericPage.printFile(teamsNames)

WebUI.closeBrowser()