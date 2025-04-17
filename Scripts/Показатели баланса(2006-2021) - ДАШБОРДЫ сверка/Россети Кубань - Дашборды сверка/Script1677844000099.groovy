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

WebUI.openBrowser('')

'Блок руководителей'
WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 10))

WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.click(findTestObject('Общие/button_'))

def entrDzo1 = SelectDzo1()

WebUI.click(findTestObject('Показатели баланса(2006-2021)/фильтр составляющая баланса'))

WebUI.click(findTestObject('Показатели баланса(2006-2021)/выбрать Отпуск в сеть'))

String a = WebUI.getText(findTestObject('Показатели баланса(2006-2021)/данные со страницы Блок руководителй'))

println(a)

String a1 = a.substring(0, a.indexOf('Отпуск')).replaceAll('\\s', '')

println(a1)

println(a1.length())

int numA = a1.length()

'БАЛАНСЫ'
WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 11))

def entrDzo2 = SelectDzo2()

WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр Составляющая баланса'))

WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/выбрать Отпуск в сеть'))

WebUI.delay(5)

String b = WebUI.getText(findTestObject('Показатели баланса(2006-2021)/данные со страницы Блок Балансы'))

println(b)

String b1 = b.substring(0, b.indexOf('Отпуск')).replaceAll('\\s', '')

println(b1)

if (WebUI.verifyEqual(a1, b1)) {
    println('GOOD')
} else {
    def write = WriteToExcel()
}

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 10))

entrDzo1 = SelectDzo1()

WebUI.click(findTestObject('Показатели баланса(2006-2021)/фильтр составляющая баланса'))

WebUI.click(findTestObject('Показатели баланса(2006-2021)/выбрать Потери'))

a = WebUI.getText(findTestObject('Показатели баланса(2006-2021)/данные со страницы Блок руководителй'))

println(a)

a1 = a.substring(0, a.indexOf('Потери')).replaceAll('\\s', '')

println(a1)

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 11))

entrDzo2 = SelectDzo2()

WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр Составляющая баланса'))

WebUI.click(findTestObject('Показатели баланса(2006-2021)/выбрать Потери'))

WebUI.delay(5)

b = WebUI.getText(findTestObject('Показатели баланса(2006-2021)/данные со страницы Блок Балансы'))

println(b)

b1 = b.substring(0, b.indexOf('Потери')).replaceAll('\\s', '')

println(b1)

if (WebUI.verifyEqual(a1, b1)) {
    println('GOOD')
} else {
    def write = WriteToExcel()
}

WebUI.closeBrowser()

static def WriteToExcel() {

    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр Дата'))

    String balance = WebUI.getText(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр Составляющая баланса'))

    println(year)

    String dashboardName = 'Показатели баланса электроэнергии 2006-2021'

    String page = 'Данные не совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, balance)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, page)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def SelectDzo1() {
    WebUI.click(findTestObject('Показатели баланса(2006-2021)/фильтр ДЗО'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/снять выделанеия в фильре ДЗО'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/фильтр ДЗО'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/ПАО Россети'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/РаспердКомплекс'))

    WebUI.scrollToElement(findTestObject('Показатели баланса(2006-2021)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Показатели баланса(2006-2021)/скролл'), 30)

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/применить в фильтре ДЗО'))
}

static def SelectDzo2() {
    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр ДЗО'))

    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/фильтр ДЗО'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/ПАО Россети'))

    WebUI.click(findTestObject('Показатели баланса(2006-2021)/РаспердКомплекс'))

    WebUI.scrollToElement(findTestObject('Показатели баланса(2006-2021)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/scroll'), 30)

    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Показатели баланса электроэнергии 2006-2021 блок БАЛАНАСЫ/применить в фильтре ДЗО'))
}

