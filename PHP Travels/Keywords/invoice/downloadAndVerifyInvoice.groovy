package invoice

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
import org.testng.Assert
import com.kms.katalon.core.logging.KeywordLogger

import java.io.File
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class downloadAndVerifyInvoice {

	@Keyword
	def downloadInvoice(){

		WebUI.click(findTestObject('Login/My Account'))

		WebUI.click(findTestObject('Hotels Management/Account'))

		WebUI.click(findTestObject('Invoice/Invoice'))

		WebUI.switchToWindowTitle('Invoice')

		WebUI.click(findTestObject('Invoice/download PDF'))

		WebUI.delay(5)

		WebUI.closeWindowTitle('Invoice')

		WebUI.switchToWindowTitle('My Account')
	}


	@Keyword
	def verifyInvoicedownloaded(){

		WebUI.verifyElementPresent(findTestObject('Invoice/link_invoiceElement', [('name') : 'invoice_110.pdf']), 2)
	}
}
