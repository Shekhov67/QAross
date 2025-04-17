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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

def selectDate = SelectDate()

static def SelectDate() {
    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/1 квартал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь сверка/Январь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть сверка/Февраль'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре Дата'))
}

