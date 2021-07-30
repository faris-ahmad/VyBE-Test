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

WebUI.callTestCase(findTestCase('Positive Test Case/Login/Login_Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Menu_Theme/Theme_menu'))

WebUI.click(findTestObject('Page_Menu_Theme/Page_Add_Theme/add_theme_button'))

WebUI.uploadFile(findTestObject('Page_Menu_Theme/Page_Add_Theme/upload_theme_picture'), 'D:\\Sample pictures for testing\\tourism_theme(305x133).png')

WebUI.setText(findTestObject('Page_Menu_Theme/Page_Add_Theme/theme_title'), 'World Tourism')

WebUI.setText(findTestObject('Page_Menu_Theme/Page_Add_Theme/theme_publish_date'), '2021-08-05')

WebUI.click(findTestObject('Page_Menu_Theme/Page_Add_Theme/Add_button'))

WebUI.callTestCase(findTestCase('Positive Test Case/Theme/Delete Theme'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

