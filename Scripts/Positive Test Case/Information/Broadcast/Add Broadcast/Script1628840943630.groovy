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

WebUI.click(findTestObject('Page_Main_Menu/Information'))

WebUI.click(findTestObject('Page_Broadcast/Broadcast_menu'))

WebUI.click(findTestObject('Page_Broadcast/Add_broadcast_button'))

WebUI.setText(findTestObject('Page_Broadcast/Broadcast_title'), 'สวัสดีตอนบ่ายผู้คน')

WebUI.setText(findTestObject('Page_Broadcast/Broadcast_description'), 'ขอให้นักเรียนทุกคนรายงานตัวที่ศูนย์ vybe เพื่อตรวจสอบชั้นเรียน')

WebUI.click(findTestObject('Page_Broadcast/Broadcast_Publish_button'))

WebUI.closeBrowser()

