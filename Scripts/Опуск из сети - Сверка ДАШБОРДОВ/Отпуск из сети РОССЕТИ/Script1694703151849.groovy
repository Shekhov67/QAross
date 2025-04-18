import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
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
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import org.apache.commons.lang3.StringUtils as StringUtils

String page

'ВСЕ ДЗО'
def test1 = Test1(page)

static def WriteToExcel(def a, def b, def v, def page) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО в блоке БАЛАНСЫ'))

    String year = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр Дата в блоке БАЛАНСЫ'))

    println(year)

    String dashboardName = 'Отпуск из сети'

    page = 'Данные не  совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, a)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, b)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, v)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, page)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def ScanErrors(def page) {
    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        def write = WriteToExcel2(page = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
        def write = WriteToExcel2(page = 'Ошибка запроса данных')
    } else if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
        def write = WriteToExcel2(page = 'Произошла ошибка при выполнении пользовательского кода')
    } else if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
        def write = WriteToExcel2(page = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
        def write = WriteToExcel2(page = 'Некорректные фильтры')
    }
}

static def WriteToExcel2(def page) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр Дата'))

    println(year)

    String dashboardName = 'Отпуск из сети'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

        n = (n + 1)

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)

        WebUI.closeBrowser()
    } else {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
            ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

            n = (n + 1)

            ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
        } else {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                n = (n + 1)

                ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
            } else {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                    n = (n + 1)

                    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                } else {
                    if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                        n = (n + 1)

                        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                    }
                }
            }
        }
    }
}

static def Test1(def page) {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 7))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    def scan = ScanErrors(page)

    String a = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Page_Visiology Platform/a1'))

    println('а = ' + a)

    String a0 = a.replaceAll('\\s+', '')

    println('а0 = ' + a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Page_Visiology Platform/a2'))

    println('а02 = ' + a02)

    String a2 = a02.replaceAll('\\s+', '')

    println('а2 = ' + a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println('numA02 = ' + numA02)

    String a3 = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Page_Visiology Platform/a3'))

    println('a3: ' + a3)

    a3 = a3.substring(a3.indexOf('из сети') + 7, a3.indexOf('2023/2024'))

    a3 = a3.replaceAll('\\s+', '')

    int i = a3.length() / 2

    a3 = a3.substring(i)

    println(a0)

    println(a2)

    println('a3: ' + a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 8))

    WebUI.click(findTestObject('Отпуск из сети (БАЛАНСЫ)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети (БАЛАНСЫ)/убрть выделенные в ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети (БАЛАНСЫ)/применить в фильтре ДЗО'))

    WebUI.delay(15)

    println('БАЛАНСЫ')

    String b = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Данные с виджета в блоке БАЛАНСЫ'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
		println(a0 + numberB)
		
    } else {
        String v = 'Виджет отпуск из сети'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Данные с виджета в блоке БАЛАНСЫ 2'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
		println(a2 + numberB2)
    } else {
        String v = 'Виджет отпуск из сети'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b3 = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/Page_Visiology Platform/b3'))

    println('b3: ' + b3)

    b3 = b3.substring(b3.indexOf('из сети') + 7, b3.indexOf('2023/2024'))

    b3 = b3.replaceAll('\\s+', '')

    i = (b3.length() / 2)

    b3 = b3.substring(i)

    println('b3: ' + b3)

    if (WebUI.verifyEqual(a3, b3)) {
        println('GOOD')
		println(a3 + b3)
    } else {
        String v = 'Виджет отпуск из сети'

        def write = WriteToExcel(a3, b3, v)
    }
    
    WebUI.closeBrowser()
}

