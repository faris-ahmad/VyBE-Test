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

WebUI.callTestCase(findTestCase('Positive Test Case/Student/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Teacher/teacher_menu'))

WebUI.click(findTestObject('Teacher/add_new_teacher_button'))

WebUI.uploadFile(findTestObject('Teacher/upload_teacher_picture'), 'C:\\Users\\faris\\Pictures\\VyBE Testing Purpose\\Teacher\\Teacher 1 square (240x240).jpg')

WebUI.setText(findTestObject('Teacher/first_name_teacher'), 'Nora')

WebUI.setText(findTestObject('Teacher/last_name_teacher'), 'Izzakova')

WebUI.setText(findTestObject('Teacher/email_teacher'), 'izznora@gmail.com')

WebUI.setText(findTestObject('Teacher/line_id_teacher'), 'izznora128')

WebUI.setText(findTestObject('Teacher/employee_id_teacher'), '391AUV')

WebUI.setText(findTestObject('Teacher/biography_teacher'), 'An experienced teacher that has been developing methods to educate students about history')

WebUI.click(findTestObject('Teacher/add_button_submit_teacher'))

WebUI.callTestCase(findTestCase('Positive Test Case/Teacher/Delete Teacher'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

