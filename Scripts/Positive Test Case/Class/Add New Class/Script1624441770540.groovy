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

WebUI.click(findTestObject('Page_Students - Vybe/Class_Menu'))

WebUI.click(findTestObject('Add Class/a_Add Class'))

WebUI.click(findTestObject('Add Class/select_theme'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Add Class/theme_selection_7th'))

WebUI.uploadFile(findTestObject('Add Class/upload picture 240x240'), 'C:\\Users\\faris\\Pictures\\VyBE Testing Purpose\\beach view 240x240.jpg')

WebUI.uploadFile(findTestObject('Add Class/upload_picture 384x240'), 'C:\\Users\\faris\\Pictures\\VyBE Testing Purpose\\beach view 384x240.jpg')

WebUI.setText(findTestObject('Add Class/class_title'), 'Environment on Beach')

WebUI.setText(findTestObject('Add Class/room_number'), '413')

WebUI.setText(findTestObject('Add Class/class_duration'), '00:10')

WebUI.click(findTestObject('Add Class/select_class_type'))

WebUI.click(findTestObject('Add Class/class_type_topical'))

WebUI.setText(findTestObject('Add Class/lesson_exp'), '60')

WebUI.click(findTestObject('Add Class/select_teacher'))

WebUI.click(findTestObject('Add Class/teacher_natchaya_chaichana'))

WebUI.click(findTestObject('Add Class/select_language'))

WebUI.click(findTestObject('Add Class/english_language'))

WebUI.check(findTestObject('Add Class/class_level_A1'))

WebUI.check(findTestObject('Add Class/class_level_A2'))

WebUI.check(findTestObject('Add Class/class_level_B1'))

WebUI.check(findTestObject('Add Class/class_level_B2'))

WebUI.setText(findTestObject('Add Class/lesson _summary'), 'Beach has elements and objects that is very specific. It  is a good way to improve your english by differentiate things and classify them by place and  functionality')

WebUI.click(findTestObject('Add Class/class_materials(plus)'))

WebUI.uploadFile(findTestObject('Add Class/upload_file_on_class_materials'), 'D:\\Itsavirus\\VyBE\\Beach Read By Emily Henry-pdfread.net.pdf')

WebUI.click(findTestObject('Add Class/class_schedule(plus)'))

WebUI.sendKeys(findTestObject('Add Class/choose_date_on_class_schedule'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Add Class/choose_date_on_class_schedule'), '2021-07-15')

WebUI.sendKeys(findTestObject('Add Class/choose_start_time_on_class_schedule'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Add Class/choose_start_time_on_class_schedule'), '14:00')

WebUI.click(findTestObject('Add Class/class_syllabus(plus)'))

WebUI.setText(findTestObject('Add Class/title_on_syllabus'), 'Natural Elements')

WebUI.scrollToElement(findTestObject('Add Class/add_button(class menu)'), 0)

WebUI.setText(findTestObject('Add Class/description_on_syllabus'), 'Some of the essential elements that exist in a beach is sand, saltwater, rock, shore, trees. we can even mention waves, breeze and birds for the details.')

WebUI.click(findTestObject('Page_Add_Student/Add_button'))

WebUI.callTestCase(findTestCase('Positive Test Case/Class/Delete Class'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

