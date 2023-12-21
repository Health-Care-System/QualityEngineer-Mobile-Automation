import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AuthSteps {
	
//	Scenario: Verify user successfully login and logout with valid email and password
	@Given("I am on the login page")
	def onTheLoginPage() {
		Mobile.startApplication('C:\\Users\\ferna\\Dropbox\\PC\\Downloads\\app-release-7.apk', true)
	}
	
	@When("I input valid email and password")
	def inputValidEmailAndPasswordLogin() {
		Mobile.tap(findTestObject('Success login/android.widget.EditText'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText'), 'pasienhealthify@gmail.com', 0)
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText (1)'), 'a1234567890', 0)
		
		Mobile.pressBack()
	}
	
	@And("I click login button")
	def clickLoginButton() {
		Mobile.tap(findTestObject('Object Repository/Success login/android.widget.Button'), 0)
	}
	
	@And("I click profile button")
	def clickProfileButton() {
		Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)
		
		Mobile.verifyElementVisible(findTestObject('Success login/android.view.View - apa yg kamu butuhkan'), 0)
		
		Mobile.tap(findTestObject('Success login/menu button akun'), 0)
	}
	
	@And("I click logout button")
	def clickLogoutButton() {
		Mobile.tap(findTestObject('Success login/logout button'), 0)
	}
	
	@Then("I navigated back to login page")
	def navigatedBackToLoginPage() {
		Mobile.verifyElementVisible(findTestObject('Object Repository/Success login/android.widget.Button'), 0)
	}
	
	
//	Scenario: Verify user failed to login with invalid email
	@Given("I input invalid email and valid password")
	def inputInvalidEmailLogin() {
		Mobile.tap(findTestObject('Success login/android.widget.EditText'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText'), 'salah@gmail.com', 0)
		
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText (1)'), 'a1234567890', 0)
		
		Mobile.pressBack()
	}
	
	@Then("I can see alert email not registered")
	def validateAlertEmailNotRegistered() {
		Mobile.verifyElementVisible(findTestObject('Login page/Email tidak diregister'), 0)
		
		Mobile.tap(findTestObject('Login page/button ok login alert'), 0)
	}
	
	
//	Scenario: Verify user failed to login with invalid email format
	@Given("I input invalid email format and valid password")
	def inputInvalidEmailFormatLogin() {
		Mobile.tap(findTestObject('Success login/android.widget.EditText'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText'), 'pasienhealthifygmail.com', 0)
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.tap(findTestObject('Success login/android.widget.EditText (1)'), 0)
		
		Mobile.setText(findTestObject('Object Repository/Success login/android.widget.EditText (1)'), 'a1234567890', 0)
		
		Mobile.pressBack()
		
		Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
	}
	
	
	
//	Scenario: Verify user can see alert empty data for register
	@Given("I am on the register page")
	def onTheRegisterPage() {
		Mobile.pressBack()
		
		Mobile.tap(findTestObject('Object Repository/register empty email/android.view.View'), 0)
	}
	
	@When("I enter the password confirmation and delete it again")
	def passwordConfirmationIsEmpty() {
		Mobile.tap(findTestObject('verify alert failed to register/password confirmation'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/password confirmation'), 'automated1', 0)
		
		Mobile.clearText(findTestObject('verify alert failed to register/password confirmation'), 0)
		
		Mobile.pressBack()
	}
	
	@And("I can see alert password confirmation must be filled")
	def validateAlertPasswordConfirmationIsEmpty() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert password confirmation harus diisi'), 0)
	}
	
	@And("I enter the email and delete it again")
	def emailIsEmpty() {
		Mobile.tap(findTestObject('verify alert failed to register/email field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/email field'), 'automated@gmail.com', 0)
		
		Mobile.clearText(findTestObject('verify alert failed to register/email field'), 0)
	}
	
	@And("I can see alert email must be filled")
	def validateAlertEmailIsEmpty() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert email harus diisi'), 0)
	}
	
	@And("I enter the name and delete it again")
	def nameIsEmpty() {
		Mobile.tap(findTestObject('verify alert failed to register/name field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/name field'), 'automated', 0)
		
		Mobile.clearText(findTestObject('verify alert failed to register/name field'), 0)
	}
	
	@And("I can see alert name must be filled")
	def validateAlertNameIsEmpty() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert nama harus diisi'), 0)
	}
	
	@And("I enter the password and delete it again")
	def passwordIsEmpty() {
		Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)
		
		Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/password field'), 'automated1', 0)
		
		Mobile.clearText(findTestObject('verify alert failed to register/password field'), 0)
		
		Mobile.pressBack()
	}
	
	@Then("I can see alert password must be filled")
	def validateAlertPasswordIsEmpty() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert password harus diisi'), 0)
		
		Mobile.closeApplication()
	}
	
	
//	Scenario: Verify user can see alert invalid data for register
	@Given("I open the register page")
	def openRegisterPage() {
		Mobile.startApplication('C:\\Users\\ferna\\Dropbox\\PC\\Downloads\\app-release-7.apk', true)
		
		Mobile.tap(findTestObject('Object Repository/register empty email/android.view.View'), 0)
	}
	
	
	@When("I enter invalid password confirmation")
	def inputInvalidPasswordConfirmationRegister() {
//		Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)
		
//		Mobile.pressBack()
		
		Mobile.tap(findTestObject('verify alert failed to register/password confirmation'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/password confirmation'), 'asdasdasd', 0)
	}
	
	@And("I enter invalid email format")
	def inputInvalidEmailFormatRegister() {
		Mobile.tap(findTestObject('verify alert failed to register/email field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/email field'), 'automatedgmail.com', 0)
	}
	
	@And("I can see alert email is invalid")
	def validateAlertEmailIsInvalidRegister() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert format email tidak valid'), 0)
	}
	
	@And("I enter numeric name")
	def inputNumericNameRegister() {
		Mobile.tap(findTestObject('verify alert failed to register/name field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/name field'), '12345', 0)
	}
	
	@And("I can see alert name is invalid")
	def validateAlertNameNumeric() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert nama tidak boleh numerik'), 0)
		
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}
	
	@And("I enter password")
	def inputPasswordRegister() {
		Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)
		
		Mobile.tap(findTestObject('verify alert failed to register/password field'), 0)
		
		Mobile.setText(findTestObject('verify alert failed to register/password field'), 'automated1', 0)
		
		Mobile.pressBack()
	}
	
	@Then("I can see alert password confirmation is invalid")
	def validateAlertPasswordConfirmationIsInvalidRegister() {
		Mobile.verifyElementVisible(findTestObject('verify alert failed to register/alert password confirmation tidak sesuai'), 0)
		
//		Mobile.closeApplication()
	}

}