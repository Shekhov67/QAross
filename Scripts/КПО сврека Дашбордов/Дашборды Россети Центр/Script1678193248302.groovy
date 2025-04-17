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

' '
WebUI.openBrowser('')

'БЛОК РУКОВОДИТЕЛЕЙ'
WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/КПО/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/КПО/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/КПО/button_'))

WebUI.click(findTestObject('КПО/фильтр Выручка'))

WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

WebUI.click(findTestObject('КПО/фильтр Дата'))

WebUI.click(findTestObject('КПО/снять выделения в фильтре Дата'))

WebUI.click(findTestObject('КПО/применить в фильтре Дата'))

WebUI.click(findTestObject('КПО/фильтр Дата'))

WebUI.scrollToElement(findTestObject('КПО/2023 год'), 30)

WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

WebUI.click(findTestObject('КПО/2023 год'))

WebUI.scrollToElement(findTestObject('КПО/4 квартал 23 года'), 30)

WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

WebUI.click(findTestObject('КПО/выбрать 1 квартал 2023'))

WebUI.click(findTestObject('КПО/выбрать 2 квартал 2023'))

WebUI.click(findTestObject('КПО/применить в фильтре Дата'))

WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

WebUI.click(findTestObject('КПО/фильтр ДЗО'))

WebUI.click(findTestObject('КПО/ПАО Россети'))

WebUI.click(findTestObject('КПО/РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

WebUI.click(findTestObject('КПО/выбрать Россети Центр'))

WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

WebUI.delay(5)

String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

println(a)

println(a1)

'ВЫРУЧКА'
WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

WebUI.delay(15)

if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
    WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
}

WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

WebUI.click(findTestObject('КПО/ПАО Россети'))

WebUI.click(findTestObject('КПО/РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('КПО для раздела Выручка/скролл'), 30)

WebUI.click(findTestObject('КПО для раздела Выручка/выбрать Россети Центр'))

WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

WebUI.click(findTestObject('КПО для раздела Выручка/i_-close'))

WebUI.click(findTestObject('КПО для раздела Выручка/фильтр Дата'))

WebUI.scrollToElement(findTestObject('КПО/2023 год'), 30)

WebUI.scrollToElement(findTestObject('КПО для раздела Выручка/скролл'), 30)

WebUI.click(findTestObject('КПО/2023 год'))

WebUI.scrollToElement(findTestObject('КПО для раздела Выручка/выбрать 1 квартал 2023'), 30)

WebUI.click(findTestObject('КПО для раздела Выручка/выбрать 1 квартал 2023'))

WebUI.scrollToElement(findTestObject('КПО для раздела Выручка/выбрать 2 квартал 2023'), 30)

WebUI.click(findTestObject('КПО для раздела Выручка/выбрать 2 квартал 2023'))

WebUI.click(findTestObject('КПО для раздела Выручка/div_entrdate'))

WebUI.delay(5)

String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

println(b)

println(b1)

if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
    println('GOOD')
} else {
    def write = WriteToExcel()
}

WebUI.closeBrowser()

static def WriteToExcel() {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('КПО для раздела Выручка/фильтр Дата'))

    println(year)

    String dashboardName = 'Котловой полезный отпуск'

    String page = 'Данные не  совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)

    WebUI.acceptAlert()
}

