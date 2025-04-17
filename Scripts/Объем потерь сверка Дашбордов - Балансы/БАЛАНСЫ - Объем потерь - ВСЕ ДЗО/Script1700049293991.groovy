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

def test1 = Test1()

def test2 = Test2()

def test3 = Test3()

def test4 = Test4()

def test5 = Test5()

def test6 = Test6()

def test7 = Test7()

def test8 = Test8()

def test9 = Test9()

def test10 = Test10()

def test11 = Test11()

def test12 = Test12()

def test13 = Test13()

def test14 = Test14()

def test15 = Test15()

def test16 = Test16() 

static def WriteToExcel(def widget, def year, def month) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    println(year)

    String dashboardName = 'Объем потерь'

    String page = 'Данные не  совпадают'
	
	Date d = new Date()
	
	SimpleDateFormat format1
	
	format1 = new SimpleDateFormat('dd.MM.yyyy')
	
	String date = format1.format(d)
	

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, widget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, month)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, page)
	
	ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def Test1() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test2() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test3() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Волга'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Волга'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test4() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test5() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test6() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test7() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test8() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test9() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test10() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Томск'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Томск'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test11() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Тюмень'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Тюмень'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test12() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test13() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/Магистральные сети'))

    WebUI.click(findTestObject('Объем потерь сверка/Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/Магистральные сети'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test14() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Центр'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test15() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test16() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

static def Test17() {
    String widget

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    a = a.replaceAll('\\s+', '')

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)2'))

    b = b.replaceAll('\\s+', '')

    String ObemPoterBlock = a + b

    println(ObemPoterBlock)

    String c = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    c = c.replaceAll('\\.', '')

    println(c)

    String d = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)2'))

    d = d.replaceAll('\\.', '')

    String UrovenPoterBlock = c + d

    println(UrovenPoterBlock)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    e = e.substring(0, e.indexOf('2022/2023'))

    e = e.replaceAll('\\D+', '')

    println(e)

    int i = e.length() / 2

    e = e.substring(0, i)

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    f = f.substring(0, f.indexOf('2022/2023'))

    println(f)

    f = f.replaceAll('\\D+', '')

    println(f)

    i = (f.length() / 2)

    f = f.substring(0, i)

    println(f)

    String OtkloneniyaBlock = e + f

    println(OtkloneniyaBlock)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь сверка - Балансы/scr - Балансы'), 30)

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.delay(10)

    String page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\D+', '')

    i = ((2 * a.length()) + b.length())

    String a1 = page.substring(0, a.length())

    int i1 = 2 * a.length()

    String b1 = page.substring(i1, i)

    String ObemPoterBalances = a1 + b1

    println(ObemPoterBalances)

    page = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(page)

    page = page.replaceAll('\\.', '')

    page = page.replaceAll('\\D+', '')

    println(page)

    i = ((2 * c.length()) + d.length())

    String c1 = page.substring(0, c.length())

    i1 = (2 * c.length())

    String d1 = page.substring(i1, i)

    String UrovenPoterBalances = c1 + d1

    println(UrovenPoterBalances)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    e1 = e1.replaceAll('\\D+', '')

    println(e1)

    e1 = e1.substring(0, e.length())

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    f1 = f1.replaceAll('\\D+', '')

    println(f1)

    f1 = f1.substring(0, f.length())

    println(f1)

    String OtkloneniyaBalances = e1 + f1

    println(OtkloneniyaBalances)

    if (WebUI.verifyEqual(a, a1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(b, b1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Объем потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(c, c1)) {
        println('GOOD')
    } else {
        year = '2022'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(d, d1)) {
        println('GOOD')
    } else {
        year = '2023'

        widget = 'Уровень потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(e, e1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение объема потерь'

        WriteToExcel(widget, year, month)
    }
    
    if (WebUI.verifyEqual(f, f1)) {
        println('GOOD')
    } else {
        year = '2022/2023'

        widget = 'Отклонение уровня потерь'

        WriteToExcel(widget, year, month)
    }
    
    WebUI.closeBrowser()
}

