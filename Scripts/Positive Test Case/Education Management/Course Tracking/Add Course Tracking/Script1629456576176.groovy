import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Positive Test Case/Login/Login Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Main_Menu/Education_management'))

WebUI.click(findTestObject('Page_Course_Tracking/Course_Tracking_menu'))

WebUI.click(findTestObject('Page_Course_Tracking/Add_new_course_tracking'))

WebUI.setText(findTestObject('Page_Course_Tracking/Course_Group'), 'Native Style Speaking')

WebUI.click(findTestObject('Page_Course_Tracking/plus_button_add_course_trackings'))

WebUI.setText(findTestObject('Page_Course_Tracking/Title_Learning_Requirements'), 'American Accent')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Course_Tracking/Save_button'))

WebUI.callTestCase(findTestCase('Positive Test Case/Education Management/Course Tracking/Delete Course Tracking (dependent)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.closeBrowser()

