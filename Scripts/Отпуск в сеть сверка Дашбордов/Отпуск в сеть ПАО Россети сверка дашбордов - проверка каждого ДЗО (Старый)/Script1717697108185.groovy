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

'Все ДЗО'
def test1 = Test1()

'Тываэнерго\r\n'
def test2 = Test2()

'Чеченэнерго\r\n'
def test3 = Test3()

'Волга'
def test4 = Test4()

'Кубань'
def test5 = Test5()

'Ленэнерго\r\n'
def test6 = Test6()

'Московский регион'
def test7 = Test7()

'Северный Кавказ'
def test8 = Test8()

'Северо-Запад'
def test9 = Test9()

'Сибирь'
def test10 = Test10()

'Томск'
def test11 = Test11()

'Тюмень'
def test12 = Test12()

'Урал'
def test13 = Test13()

'Центр'
def test14 = Test14()

'Центр и Приволжье'
def test15 = Test15()

'Юг'
def test16 = Test16()

'Янтарь'
def test17 = Test17()

'ФКС ЕЭС'
def test18 = Test18()

static def SelectDate() {
    'Готовая функция'
    WebUI.click(findTestObject('Общие в сеть/Фильтр Дата'))

    WebUI.click(findTestObject('Общие в сеть/Снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Общие в сеть/Применить в фильтре Дата'))

    WebUI.click(findTestObject('Общие в сеть/Фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/2023 год'), 30)

    WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/2023 год'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/4 квартал 2023'), 30)

    WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать 1 квартал'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать 2 квартал 2023'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/раскрыть 3 квартал 2023'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать июль'))

    WebUI.click(findTestObject('Общие в сеть/Применить в фильтре Дата'))
}

static def SelectDateBalanc() {
    'не готова надо добавить дату'
    WebUI.click(findTestObject('Отпуск в сеть сверка/убрать выделеные в фильтре ДЗО'))
}

static def WriteToExcel(def a, def b, def v) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    String year = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр Дата в блоке Балансы'))

    println(year)

    String dashboardName = 'Отпуск в сеть'

    String page = 'Данные не  совпадают'

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

static def ScanErrors() {
    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        def write = WriteToExcel2(def page = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
        def write = WriteToExcel2(def page = 'Ошибка запроса данных')
    } else if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
        def write = WriteToExcel2(def page = 'Произошла ошибка при выполнении пользовательского кода')
    } else if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
        def write = WriteToExcel2(def page = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
        def write = WriteToExcel2(def page = 'Некорректные фильтры')
    }
}

static def WriteToExcel2(def page) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    println(year)

    String dashboardName = 'Отпуск в сеть'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)

    WebUI.closeBrowser()
    
}

static def WriteToExcelIsNull(def page) {
	
	String sheetName = 'List1'
	
		def data = findTestData('Test Data')
	
		int n = data.getRowNumbers() + 1
	
		String dZO = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))
	
		String year = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))
	
		println(year)
	
		String dashboardName = 'Отпуск в сеть'
	
		def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)
	
		def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)
	
		ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)
	
		n = (n + 1)
	
		ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
	
		WebUI.closeBrowser()
	
}

static def Test1() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.delay(10)

    if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(10)
    } else {
        WebUI.refresh()

        WebUI.delay(10)

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
    
    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))

    	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}
		
	println(a03)
		
	String a3 = a03.replaceAll('\\s+', '')
		
	println(a3)
		
	println(a3.length())
		
	int numA3 = a3.length()
		
	int numA03 = (a3.length() + numA02) + numA0

	
	println(numA03)
	
	println(a0)
	
	println(a2)
	
	println(a3)
		

    

    'БАЛАНСЫ'
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.delay(10)

    if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(10)
    } else {
        WebUI.refresh()

        WebUI.delay(10)

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
    
    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test2() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))

    	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}
		
	println(a03)
		
	String a3 = a03.replaceAll('\\s+', '')
		
	println(a3)
		
	println(a3.length())
		
	int numA3 = a3.length()
		
	int numA03 = (a3.length() + numA02) + numA0

	
	println(numA03)
	
	println(a0)
	
	println(a2)
	
	println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/tuv'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test3() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))

    	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}
		
	println(a03)
		
	String a3 = a03.replaceAll('\\s+', '')
		
	println(a3)
		
	println(a3.length())
		
	int numA3 = a3.length()
		
	int numA03 = (a3.length() + numA02) + numA0

	
	println(numA03)
	
	println(a0)
	
	println(a2)
	
	println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/chech'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test4() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Волга'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))

    	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}
		
	println(a03)
		
	String a3 = a03.replaceAll('\\s+', '')
		
	println(a3)
		
	println(a3.length())
		
	int numA3 = a3.length()
		
	int numA03 = (a3.length() + numA02) + numA0

	
	println(numA03)
	
	println(a0)
	
	println(a2)
	
	println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/volga'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test5() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/kub'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test6() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/len'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test7() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/MR'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test8() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/sevkav'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test9() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/seveeroZapad'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test10() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/sibir'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test11() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Томск'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/tomsk'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test12() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Тюмень'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/tumen'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test13() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/ural'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test14() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/Россети Центр'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test15() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/Россети Центр и Приволжье'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test16() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/ug'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test17() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/yantar'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

static def Test18() {
    WebUI.openBrowser('')

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие в сеть/button_'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/Магистральные сети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    def scan = ScanErrors()

    String a = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    println(a)

    String a0 = a.replaceAll('\\s+', '')

    println(a0)

    println(a0.length())

    int numA = a0.length()

    int numA0 = a0.length() * 2

    String a02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a2'))

    println(a02)

    String a2 = a02.replaceAll('\\s+', '')

    println(a2)

    println(a2.length())

    int numA2 = a2.length()

    int numA02 = a2.length() * 2

    println(numA02)

    String a03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a3'))
	
	if(a03==null) {
		
		println('нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		def writeNull = WriteToExcelIsNull(def page = 'нет данных в виджете Отпуск в сеть в третьем столбце(отображается как текущий год)')
		
		return  a03 = 0
		
	}

    println(a03)

    String a3 = a03.replaceAll('\\s+', '')

    println(a3)

    println(a3.length())

    int numA3 = a3.length()

    int numA03 = (a3.length() + numA02) + numA0

    println(numA03)

    println(a0)

    println(a2)

    println(a3)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/Магистральные сети'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/FSK'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    String b = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b)

    String b1 = b.replaceAll('\\D+', '')

    println(b1)

    String numberB = StringUtils.substring(b1, 0, numA)

    println(numberB)

    if (WebUI.verifyEqual(a0, numberB)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a0, numberB, v)
    }
    
    String b02 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b02)

    String b2 = b02.replaceAll('\\D+', '')

    println(b2)

    String numberB2 = b2.substring(numA02).substring(0, numA2)

    println(numberB2)

    if (WebUI.verifyEqual(a2, numberB2)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a2, numberB2, v)
    }
    
    String b03 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b03)

    String b3 = b03.replaceAll('\\D+', '')

    println(b3)

    String numberB3 = b3.substring(numA03).substring(0, numA3)

    println(numberB3)

    if (WebUI.verifyEqual(a3, numberB3)) {
        println('GOOD')
    } else {
        String v = 'Виджет отпуск в сеть'

        def write = WriteToExcel(a3, numberB3, v)
    }
    
    WebUI.closeBrowser()
}

