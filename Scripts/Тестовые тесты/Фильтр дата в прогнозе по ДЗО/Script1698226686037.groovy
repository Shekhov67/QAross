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
import java.util.HashMap as HashMap
import java.util.Map as Map
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

WebUI.click(findTestObject('Прогноз по ДЗО/Январь'))

def variant = varianttFilter()

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

WebUI.click(findTestObject('Прогноз по ДЗО/Февраль'))

variant = varianttFilter()

def varianttFilter() {
    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать ПЛАН'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Отпуск из сети'))

    def scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Отпуск из сети'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать ПЛАН'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/План СУ'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Отпуск из сети'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/План СУ'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать ПЛАН'))

    WebUI.click(findTestObject('Прогноз по ДЗО/ВСЕ в фильтре КПО'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

    scan = ScanErrors()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

    WebUI.click(findTestObject('Прогноз по ДЗО/План СУ'))

    scan = ScanErrors()

    'очистить куки'
    WebUI.deleteAllCookies()

    println('End function')
}

static def ScanErrors(def page) {
    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        def write = WriteToExcel(page = 'Нет данных')
    } else if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
        def write = WriteToExcel(page = 'Ошибка запроса данных')
    } else if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
        def write = WriteToExcel(page = 'Произошла ошибка при выполнении пользовательского кода')
    } else if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
        def write = WriteToExcel(page = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
        def write = WriteToExcel(page = 'Некорректные фильтры')
    }
}

static def WriteToExcel(def page) {
    String togle = 'Переключатель АБС.'

    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Object Repository/Прогноз по ДЗО/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Object Repository/Прогноз по ДЗО/фильтр Год'))

    println(year)

    String planFact = WebUI.getText(findTestObject('Object Repository/Прогноз по ДЗО/фильтр Тип показателя откланений'))

    println(planFact)

    String mounth = WebUI.getText(findTestObject('Object Repository/Прогноз по ДЗО/фильтр Месяц'))

    println(mounth)

    String kpo = WebUI.getText(findTestObject('Object Repository/Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

    println(kpo)

    String dashboardName = 'Прогноз по ДЗО'

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelPrognozDzo)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, planFact)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, mounth)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, kpo)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, togle)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelPrognozDzo, workbook01)
}

