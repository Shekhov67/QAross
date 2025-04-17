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

String a0
String b0
String e0
String f0
String a01
String b01
String e01
String f01

def test1 = Test1()

WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗО'))

WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

WebUI.delay(50)

String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

println(a)

String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

println(b)

String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

println(e)

String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

println(f)

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

WebUI.delay(5)

if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.delay(5)
} else {
    WebUI.refresh()

    WebUI.delay(5)

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))
}

WebUI.delay(50)

String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

println(a1)

String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

println(b1)

String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

println(e1)

String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

println(f1)

def compromision = Comparison(a0 = a, b0 = b, e0 = e, df0 = f, a01 = a1, b01 = b1, e01 = e1, f01 = f1)

WebUI.closeBrowser()

static def Test1() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.delay(5)

    if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(5)
    } else {
        WebUI.refresh()

        WebUI.delay(5)

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
}

static def WriteToExcel(def widget, def month) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    String dashboardName = 'Объем потерь'

    String page = 'Данные не  совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, widget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, month)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def Comparison(def a0, def b0, def e0, def f0, def a01, def b01, def e01, def f01) {
    if (WebUI.verifyEqual(a0, a01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Объем потерь'

        String month = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильтр Дата'))

        WriteToExcel(widget, month)
    }
    
    if (WebUI.verifyEqual(b0, b01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Уровень потерь'

        String month = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильтр Дата'))

        WriteToExcel(widget, month)
    }
    
    if (WebUI.verifyEqual(e0, e01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Отклонение объема потерь'

        String month = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильтр Дата'))

        WriteToExcel(widget, month)
    }
    
    if (WebUI.verifyEqual(f0, f01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Отклонение уровня потерь'

        String month = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильтр Дата'))

        WriteToExcel(widget, month)
    }
}

