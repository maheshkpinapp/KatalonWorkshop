package verifyHotel

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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By


import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class hotelStarRating {

	@Keyword
	def starRating(){

		WebUI.waitForElementClickable(findTestObject('Dashboard/booking'), 3)

		WebUI.click(findTestObject('Dashboard/Hotels'))

		WebUI.waitForElementClickable(findTestObject('Hotels Management/Star grade'), 3)

		WebUI.click(findTestObject('Hotels Management/Star grade'))

		WebUI.click(findTestObject('Hotels Management/Search'))
		int rCount
		WebDriver driver = DriverFactory.getWebDriver()
		rCount = driver.findElements(By.xpath('//tr//h4')).size()
		for (int i = 1; i <= rCount; i++) {
			WebUI.verifyElementPresent(findTestObject('Hotels Management/Star count', [('rowCount') : i]), 10)
		}
	}
}
