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

WebUI.click(findTestObject('Page_Students - Vybe/a_Edit'))

WebUI.uploadFile(findTestObject('Page_Edit_Student - Vybe/Upload_Picture'), 'D:\\Sample pictures for testing\\man with glasses.jpg', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Edit_Student - Vybe/input_First name_userfirst_name'), 'Thomas')

WebUI.setText(findTestObject('Page_Edit_Student - Vybe/input_Last name_userlast_name'), 'Shelby')

WebUI.setText(findTestObject('Page_Edit_Student - Vybe/input_Email_useremail'), 'solomon@ymail.com')

WebUI.click(findTestObject('Page_Edit_Student - Vybe/country_code_selector'))

WebUI.scrollToElement(findTestObject('Page_Edit_Student - Vybe/Indonesia Country Code'), 0)

WebUI.click(findTestObject('Page_Edit_Student - Vybe/Indonesia Country Code'))

WebUI.setText(findTestObject('Page_Edit_Student - Vybe/input_Phone number_userphone_number'), '878654321')

WebUI.setText(findTestObject('Page_Edit_Student - Vybe/input_Birth date_userbirth_date'), '1988-04-21')

WebUI.click(findTestObject('Page_Edit_Student - Vybe/english level selector'))

WebUI.selectOptionByLabel(findTestObject('Page_Edit_Student - Vybe/english level selector'), 'B2', true)

WebUI.click(findTestObject('Page_Edit_Student - Vybe/penaltied cancel'))

WebUI.click(findTestObject('Page_Edit_Student - Vybe/penaltied cancel number 2'))

WebUI.click(findTestObject('Page_Edit_Student - Vybe/chinese level selector'))

WebUI.selectOptionByIndex(findTestObject('Page_Edit_Student - Vybe/chinese level selector'), '2', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Edit_Student - Vybe/subscription selector'), 0)

WebUI.click(findTestObject('Page_Edit_Student - Vybe/subscription selector'))

WebUI.click(findTestObject('Page_Edit_Student - Vybe/subscription-trial'))

WebUI.click(findTestObject('Page_Edit_Student - Vybe/student-save button'))

WebUI.callTestCase(findTestCase('Positive Test Case/Student Management/Student/Edit Student - Reverse'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

