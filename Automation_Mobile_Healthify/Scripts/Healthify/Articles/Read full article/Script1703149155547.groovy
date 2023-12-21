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

Mobile.tap(findTestObject('Success login/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText'), 'pasienhealthify@gmail.com', 0)

//Mobile.doubleTap(findTestObject('Success login/android.widget.EditText (1)'), 0)
Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)

Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText (1)'), 'a1234567890', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Success login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Read full article/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Read full article/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Read full article/android.view.View (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Read full article/android.widget.ImageView (1)'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Read full article/android.widget.ImageView (2)'), 0)

Mobile.pressBack()

Mobile.closeApplication()

