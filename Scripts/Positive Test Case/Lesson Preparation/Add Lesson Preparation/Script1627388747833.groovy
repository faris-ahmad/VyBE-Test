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

WebUI.click(findTestObject('Page_Main_Menu/Education_management'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Lesson_Preparations_menu'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Add_lesson_preparation_button'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Select_Class_selector'))

WebUI.scrollToElement(findTestObject('Page_Lesson_Preparations/sample_class'), 0)

WebUI.click(findTestObject('Page_Lesson_Preparations/sample_class'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Details_Next_button'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Add_more_Content_option'))

WebUI.setText(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_Title'), 'Fundamental of Learning')

WebUI.uploadFile(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_upload_sound (first)'), ' C:\\Users\\ASUS\\Documents\\Sound recordings\\Recording on lesson prep.mp3')

WebUI.setText(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_Definition'), 'This lesson preparation is needed to adjust your expectation and guide you through this class.')

WebUI.click(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_plus_button'))

WebUI.setText(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_translated_text'), 'There are so many beautiful places in Thailand that you can visit')

WebUI.setText(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_Original_text'), 'เมืองไทยมีที่เที่ยวสวยๆเยอะเลยครับ')

WebUI.uploadFile(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_upload_sound (second)'), ' C:\\Users\\ASUS\\Documents\\Sound recordings\\Recording on lesson prep.mp3')

WebUI.click(findTestObject('Page_Lesson_Preparations/Add_more_Content_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_Remove_this_Content'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Vocabulary_and_grammar_Next_button'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Preclass_drill_plus_button'))

WebUI.setText(findTestObject('Page_Lesson_Preparations/Preclass_drill_Title'), 'Predictive Skill Assessment')

WebUI.uploadFile(findTestObject('Page_Lesson_Preparations/Preclass_drill_upload'), 'C:\\Users\\ASUS\\Documents\\Quizzes\\Staging test (Published)\\Staging test (Published).zip')

WebUI.click(findTestObject('Page_Lesson_Preparations/Preclass_drill_Next_button'))

WebUI.click(findTestObject('Page_Lesson_Preparations/Publish_Publish_button'))

WebUI.callTestCase(findTestCase('Positive Test Case/Lesson Preparation/Delete Lesson Preparation (dependent)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

