package commonUtils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.util.KeywordUtil
import org.testng.Assert
import com.kms.katalon.core.logging.KeywordLogger

import java.io.File

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class Common {

	@Keyword
	def navigateToURL(String url){

		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
	}


	@Keyword
	def login(String username, String password){

		WebUI.waitForElementClickable(findTestObject('Login/input_email'), 3)

		WebUI.setText(findTestObject('Login/input_email'), username)

		WebUI.setText(findTestObject('Login/input_password'), password)

		WebUI.click(findTestObject('Login/button_Login'))
	}

	@Keyword
	def redirectToLogin(){

		WebUI.click(findTestObject('Login/My Account'))

		WebUI.click(findTestObject('Login/Login_redirection'))
	}

	@Keyword
	def logoutFromAppUser(){

		WebUI.click(findTestObject('Hotels Management/Logout_user'))
	}

	@Keyword
	def logoutFromAppAdmin(){

		WebUI.click(findTestObject('Login/My Account'))

		WebUI.click(findTestObject('Hotels Management/Logout'))
	}

	@Keyword
	def closeBrowser(){

		WebUI.closeBrowser()
	}
}
