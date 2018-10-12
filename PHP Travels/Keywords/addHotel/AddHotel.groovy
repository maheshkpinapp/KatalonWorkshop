package addHotel

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List
import java.awt.TexturePaintContext.Int

import org.eclipse.persistence.internal.oxm.record.json.JSONParser.array_return
import org.junit.After

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable as GlobalVariable
import java.awt.*
import java.util.Date;
import java.text.SimpleDateFormat;


import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class AddHotel {

	@Keyword
	def createHotel(String hotel, String description, String location){

		/*WebUI.click(findTestObject('Dashboard/a_Hotels'))

		WebUI.click(findTestObject('Dashboard/a_Hotels_1'))

		WebUI.waitForElementPresent(findTestObject('Hotels Management/button_Add'), 30)

		WebUI.click(findTestObject('Hotels Management/button_Add'))

		WebUI.waitForElementPresent(findTestObject('Add Hotel_General/input_hotelname'), 30)

		String hotelName = hotel + '_'+ System.currentTimeMillis()

		WebUI.setText(findTestObject('Add Hotel_General/input_hotelname'), hotelName)

		WebUI.switchToFrame(findTestObject('Add Hotel_General/iFrame_des'), 10)

		WebUI.setText(findTestObject('Add Hotel_General/iFrame text enter'), description)

		WebUI.switchToDefaultContent()

		String rating ='4'

		WebUI.selectOptionByValue(findTestObject('Add Hotel_General/stars'), rating, true)

		WebUI.selectOptionByValue(findTestObject('Add Hotel_General/select_Apartment'), '102', true)

		WebUI.click(findTestObject('Add Hotel_General/Featured-From'))*/

		/*	Calendar calendar = Calendar.getInstance()
		 Date today = calendar.getTime()
		 SimpleDateFormat sdf = new SimpleDateFormat("dd")
		 String d= sdf.format(today)
		 WebUI.click(findTestObject('Add Hotel_General/Date From',[('day'):d]))
		 calendar.add(Calendar.DAY_OF_YEAR, 1)
		 Date tomorrow = calendar.getTime()
		 String t= sdf.format(tomorrow)
		 WebUI.click(findTestObject('Add Hotel_General/Date To',[('tday'):t]))
		 WebUI.delay(2)*/

		/*WebUI.click(findTestObject('Add Hotel_General/Location click'))

		WebUI.sendKeys(findTestObject('Add Hotel_General/Location search'), location)

		WebUI.click(findTestObject('Add Hotel_General/Location select'))

		WebUI.setText(findTestObject('Add Hotel_General/input_depositvalue'), '45')

		WebUI.setText(findTestObject('Add Hotel_General/input_taxvalue'), '50')*/

		/*WebUI.click(findTestObject('Add Hotel_General/Related Hotels'))
		 WebUI.click(findTestObject('Add Hotel_General/Related Hotel_list'))

		WebUI.click(findTestObject('Add Hotel_Facilities/Facilities'))*/

		String[] facilities = [
			"Air Conditioner",
			"Airport Transport",
			"Bar Lounge",
			"Business Center",
			"Elevator",
			"Fitness Center",
			"Disabled Facilities",
			"Children Activites",
			"Laundry Service",
			"Pets Allowed",
			"Restaurant",
			"SPA",
			"Swimming Pool"
		]
		
		
		//getvalue is of format - column,row
		InternalData data = findTestData('Facility')
		String facilityName = data.internallyGetValue(0, 0)
		String facilityName2 = data.internallyGetValue(0, 1)
		String facilityName3 = data.internallyGetValue(0, 2)

		def data_xls = TestDataFactory.findTestData('Facility_xls')
		String facilityName4 = data_xls.getValue(1, 1)
		String facilityName5 = data_xls.getValue(1, 2)
		String facilityName6 = data_xls.getValue(1, 3)
		
		def dataIntoArray = findTestData('Facility').getAllData()
		for (element in dataIntoArray) {
			def fieldType = element.get(0)
			
			WebUI.delay(1)
			//WebUI.click(findTestObject('Add Hotel_Facilities/Facility',[('value'):fieldType]))

		}

		for(String facility : facilities){
			WebUI.click(findTestObject('Add Hotel_Facilities/Facility',[('value'):facility]))
		}

		def dataIntoArray2 = findTestData('Facility').getAllData()
		for (row in dataIntoArray2) {
			def fieldType = row.get(0)
			WebUI.click(findTestObject('Add Hotel_Facilities/Facility',[('value'):fieldType]))

		}

		WebUI.click(findTestObject('Add Hotel_Meta Info/Meta Info'))

		WebUI.setText(findTestObject('Add Hotel_Meta Info/Meta title'), 'Sample title')

		WebUI.setText(findTestObject('Add Hotel_Meta Info/Meta Keywords'), 'Sample keyword')

		WebUI.setText(findTestObject('Add Hotel_Meta Info/Meta Description'), description)

		WebUI.click(findTestObject('Add Hotel_Policy/Policy'))

		WebUI.click(findTestObject('Add Hotel_Policy/Payment Options'))

		WebUI.click(findTestObject('Add Hotel_Policy/Payment Option Select'))

		WebUI.click(findTestObject('Add Hotel_General/Submit Button'))

		WebUI.verifyElementPresent(findTestObject('Hotels Management/Grid_Hotel Name',[('hname'):hotelName]), 5)

		WebUI.verifyElementPresent(findTestObject('Hotels Management/Stars',[('name'):hotelName,('rating'):rating]), 5)
	}
}
