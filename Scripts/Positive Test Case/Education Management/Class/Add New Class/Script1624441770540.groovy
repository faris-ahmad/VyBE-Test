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

WebUI.click(findTestObject('Page_Students - Vybe/Class_Menu'))

WebUI.click(findTestObject('Page_Add_Class/a_Add Class'))

WebUI.click(findTestObject('Page_Add_Class/select_theme'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Add_Class/theme_selection_1st'))

WebUI.uploadFile(findTestObject('Page_Add_Class/upload picture 240x240'), '/Users/farisharunahmad/Documents/Vybe/beach-environment(240x240).png')

WebUI.uploadFile(findTestObject('Page_Add_Class/upload_picture 384x240'), '/Users/farisharunahmad/Documents/Vybe/beach-environment(384x240).png')

WebUI.setText(findTestObject('Page_Add_Class/class_title'), 'Environment on Beach')

WebUI.setText(findTestObject('Page_Add_Class/room_number'), '413')

WebUI.setText(findTestObject('Page_Add_Class/class_duration'), '00:10')

WebUI.click(findTestObject('Page_Add_Class/select_class_type'))

WebUI.click(findTestObject('Page_Add_Class/class_type_topical'))

WebUI.setText(findTestObject('Page_Add_Class/lesson_exp'), '60')

WebUI.setText(findTestObject('Page_Add_Class/available_seat'), '20')

WebUI.click(findTestObject('Page_Add_Class/select_language'))

WebUI.click(findTestObject('Page_Add_Class/english_language'))

WebUI.click(findTestObject('Page_Add_Class/select_teacher'))

WebUI.click(findTestObject('Page_Add_Class/teacher_natchaya_chaichana'))

WebUI.check(findTestObject('Page_Add_Class/class_level_A1'))

WebUI.check(findTestObject('Page_Add_Class/class_level_A2'))

WebUI.check(findTestObject('Page_Add_Class/class_level_B1'))

WebUI.check(findTestObject('Page_Add_Class/class_level_B2'))

WebUI.setText(findTestObject('Page_Add_Class/lesson _summary'), 'Beach has elements and objects that is very specific. It  is a good way to improve your english by differentiate things and classify them by place and  functionality')

WebUI.click(findTestObject('Page_Add_Class/class_materials(plus)'))

WebUI.uploadFile(findTestObject('Page_Add_Class/upload_file_on_class_materials'), '/Users/farisharunahmad/Documents/Vybe/Beach-Read-by-Emily-Henry.pdf')

WebUI.click(findTestObject('Page_Add_Class/class_schedule(plus)'))

WebUI.click(findTestObject('Page_Add_Class/choose_date_on_class_schedule'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Page_Add_Class/choose_start_time_on_class_schedule'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Page_Add_Class/choose_start_time_on_class_schedule'), Keys.chord(Keys.DELETE))

WebUI.setText(findTestObject('Page_Add_Class/choose_start_time_on_class_schedule'), '21:00')

WebUI.click(findTestObject('Page_Add_Class/class_syllabus(plus)'))

WebUI.setText(findTestObject('Page_Add_Class/title_on_syllabus'), 'Natural Elements')

WebUI.scrollToElement(findTestObject('Page_Add_Class/add_button(class menu)'), 0)

WebUI.setText(findTestObject('Page_Add_Class/description_on_syllabus'), 'Some of the essential elements that exist in a beach is sand, saltwater, rock, shore, trees. we can even mention waves, breeze and birds for the details.')

WebUI.click(findTestObject('Page_Add_Student/Add_button'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Positive Test Case/Education Management/Class/Delete Class (dependent)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

