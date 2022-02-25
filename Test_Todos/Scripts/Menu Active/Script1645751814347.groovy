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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://todomvc.com/examples/react/#/')

WebUI.setText(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), 'Task 1')

WebUI.sendKeys(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), 'Task 2')

WebUI.sendKeys(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), 'Task 3')

WebUI.sendKeys(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), 'Task 4')

WebUI.sendKeys(findTestObject('Object Repository/Page_React  TodoMVC/input_todos_new-todo'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_React  TodoMVC/input_Task 1_toggle'))

WebUI.click(findTestObject('Object Repository/Page_React  TodoMVC/input_Task 1_toggle'))

WebUI.click(findTestObject('Object Repository/Page_React  TodoMVC/a_Active'))

