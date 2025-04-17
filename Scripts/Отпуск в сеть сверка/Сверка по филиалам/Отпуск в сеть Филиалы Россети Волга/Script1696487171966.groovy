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



String file

String path

String page
'1'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 24)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Мородовэнерго'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Мородовэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'2'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 25)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Оренбургэнерго'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Оренбургэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'3'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 26)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Пензаэнерго'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Пензаэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'5'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 27)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Самарские РС'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Самарские РС'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'6'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 28)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Саратовские РС'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Саратовские РС'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'7'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 29)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ульяновские РС'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ульяновские РС'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

'8'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(2, 30)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Чувашэнерго'), 30)

WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Чувашэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Выбор даты для сверки филиалов/Дата для сверки'), [:], FailureHandling.CONTINUE_ON_FAILURE)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = otpuskVSeti

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScanErrors(file, page, path)

WebUI.closeBrowser()

static def OpenBrowser() {
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

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
}

static def SelectDzo() {
	WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

	WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

	WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

	WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

	WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

	WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))
}


static def ScanErrors(def file, def page, def path) {
	if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
		def write = WriteToExcel(file = '', page = 'нет данных', path)
	} else if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
		def write = WriteToExcel(file = '', page = 'Ошибка запроса данных', path)
	} else if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
		def write = WriteToExcel(file = '', page = 'Произошла ошибка при выполнении пользовательского кода', path)
	} else if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
		def write = WriteToExcel(file = '', page = 'У виджета нет данных', path)
	} else if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
		def write = WriteToExcel(file = '', page = 'Некорректные фильтры', path)
	}
}

static def Check(def pageString, def fileString, def path) {
    pageString = pageString.replaceAll('\\s+', '')

    int page = pageString.toInteger()

    int page1

    int file = fileString.toInteger()

    if (page == file) {
        page1 = page
    } else if (page > file) {
        page1 = (page - 1)
    } else if (page < file) {
        page1 = (page + 1)
    }
    
    if (WebUI.verifyEqual(page1, file) == true) {
    } else {
        def write = WriteToExcel(file, page, path)
    }
}

static def WriteToExcel(def file, def page, def typeData = 'Отпуск в сеть', def path) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dashboardName = 'Отпуск в сеть'

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    String dZO = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    println(dZO)

    String filtrYear = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    String year = '2024'

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, typeData)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, file)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, filtrYear)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def WriteToExcel2(def err) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    println(year)

    String planFact = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр Показатели'))

    println(planFact)

    String itogBalanc = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр составляющая Баланса'))

    println(itogBalanc)

    String dashboardName = 'Отпуск в сеть'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePathFilials)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, planFact)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, itogBalanc)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, err)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePathFilials, workbook01)
}

