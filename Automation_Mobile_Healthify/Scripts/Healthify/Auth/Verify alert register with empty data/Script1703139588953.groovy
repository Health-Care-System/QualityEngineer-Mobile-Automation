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

Mobile.startApplication('C:\\Users\\ferna\\Dropbox\\PC\\Downloads\\app-release-7.apk', true)

Mobile.tap(findTestObject('Object Repository/register empty email/android.view.View'), 0)

Mobile.tap(findTestObject('verify alert failed to register/password confirmation'), 0)

Mobile.setText(findTestObject('verify alert failed to register/password confirmation'), 'automated1', 0)

Mobile.clearText(findTestObject('verify alert failed to register/password confirmation'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert password confirmation harus diisi'), 0)

Mobile.tap(findTestObject('verify alert failed to register/email field'), 0)

Mobile.setText(findTestObject('verify alert failed to register/email field'), 'automated@gmail.com', 0)

Mobile.clearText(findTestObject('verify alert failed to register/email field'), 0)

Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert email harus diisi'), 0)

Mobile.tap(findTestObject('verify alert failed to register/name field'), 0)

Mobile.setText(findTestObject('verify alert failed to register/name field'), 'automated', 0)

Mobile.clearText(findTestObject('verify alert failed to register/name field'), 0)

Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert nama harus diisi'), 0)

Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)

Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)

Mobile.setText(findTestObject('verify alert failed to register/password field'), 'automated1', 0)

Mobile.clearText(findTestObject('verify alert failed to register/password field'), 0)

Mobile.pressBack()

Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert password harus diisi'), 0)

