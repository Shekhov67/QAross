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

// Основные тестовые сценарии
(0..17).each({ def testNum ->
        runTestScenario(testNum)
    }) /**
 * Запускает тестовый сценарий по номеру
 * @param testNum Номер теста (0-17)
 */
// Инициализация
// Открытие браузера и авторизация
// Настройка фильтров
// Выбор даты
// Проверка данных
// Сравнение данных
// Дополнительные действия для некоторых тестов
// Закрытие браузера
/**
 * Выбирает компанию в фильтре по номеру теста
 */
/**
 * Запускает тест-кейс для филиалов
 */
/**
 * Возвращает номер строки в тестовых данных по номеру теста
 */
// ========== ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ ==========

def runTestScenario(def testNum) {
    try {
        def testData = findTestData('Test Data')

        int rowNum = getTestDataRow(testNum)

        String otpuskVSeti = testData.getValue(4, rowNum)

        println("Test $testNum: Значение из файла - $otpuskVSeti")

        def openBrwsr = OpenBrowser()

        if (testNum == 0) {
            def raspred = Raspred()
        } else {
            def selectDzo = SelectDzo()

            selectCompany(testNum)
        }
        
        def selectDate = SelectDate()

        String path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

        if (!(WebUI.verifyElementPresent(findTestObject(path), 10, FailureHandling.OPTIONAL))) {
            println("Test $testNum: Данные отсутствуют")

            WriteToExcel2()

            WebUI.closeBrowser()

            return null
        }
        
        String pageDataString = WebUI.getText(findTestObject(path))

        println("Test $testNum: Данные со страницы - $pageDataString")

        boolean check = Check()

        if ([3, 6, 7, 8, 9, 12, 14, 15, 16].contains(testNum) && !(check)) {
            println("Test $testNum: Запуск проверки филиалов")

            runFilialTestCase(testNum)
        }
        
        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
    catch (Exception e) {
        println("Ошибка в тесте $testNum: $e.getMessage()")

        WriteToExcel2()

        WebUI.closeBrowser()
    } 
}

def selectCompany(def testNum) {
    def companies = [(1) : 'выбрать АО Тываэнерго', (2) : 'выбрать АО Чеченэнерго', (3) : 'выбрать Россети Волга', (4) : 'выбрать Россети Кубань'
        , (5) : 'выбрать Росссети Ленэнерго(ГК)', (6) : 'выбрать Россети Московский регион', (7) : 'выбрать Россети Северный Кавказ(ГК)'
        , (8) : 'выбрать Россети Северо-Запад', (9) : 'выбрать Россети Сибирь(ГК)', (10) : 'выбрать Россети Томск', (11) : 'выбрать Тюмень'
        , (12) : 'выбрать Россети Урал(ГК)', (13) : 'выбрать РаспредКомплекс', (14) : 'выбрать Россети Центр', (15) : 'выбрать Россети Центр и Приволжье(ГК)'
        , (16) : 'выбрать Россети Юг(ГК)', (17) : 'выбрать Россети Янтарь', (18) : 'выбрать Магистральные сети']

    if (companies[testNum]) {
        WebUI.scrollToElement(findTestObject("Отпуск в сеть сверка/$companies[testNum]"), 30)

        WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

        WebUI.click(findTestObject("Отпуск в сеть сверка/$companies[testNum]"))

        WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))
    }
}

def runFilialTestCase(def testNum) {
    def testCases = [(3) : 'Отпуск в сеть Филиалы Россети Волга', (6) : 'Отпуск в сеть Филиалы Россети Москвоский регион'
        , (7) : 'Отпуск в сеть Филиалы Россети Северный Кавказ(ГК)', (8) : 'Отпуск в сеть Филиалы Россети Северо-Запад', (9) : 'Отпуск в сеть Филиалы Россети Сибирь(ГК)'
        , (12) : 'Отпуск в сеть Филиалы Россети Урал(ГК)', (14) : 'Отпуск в сеть Филиалы Россети Центр', (15) : 'Отпуск в сеть Филиалы Россети Центр и Приволжье(ГК)'
        , (16) : 'Отпуск в сеть Филиалы Россети Юг(ГК)']

    WebUI.callTestCase(findTestCase("Отпуск в сеть сверка/Сверка по филиалам/$testCases[testNum]"), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

def getTestDataRow(def testNum) {
    def rows = [(0) : 87, (1) : 76, (2) : 81, (3) : 73, (4) : 82, (5) : 84, (6) : 83, (7) : 80, (8) : 74, (9) : 75, (10) : 77
        , (11) : 85, (12) : 78, (13) : 88, (14) : 71, (15) : 72, (16) : 79, (17) : 86, (18) : 89]

    return 
}

static def OpenBrowser() {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.delay(10)

    if (WebUI.verifyElementPresent(findTestObject('Общие/button_'), 10)) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
    
    WebUI.delay(10)
}

static def SelectDzo() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))
}

static def Raspred() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать РаспредКомплекс'))
}

static def SelectDate() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/1 квартал'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))
}

static def Check(Map params) {
    try {
        String pageString = params.pageString.replaceAll('\\s+', '')

        String fileString = params.fileString

        String path = params.path

        String typeData = params.typeData

        int testNum

        int page = pageString.toInteger()

        int file = fileString.toInteger()

        if (page == file) {
            println("Test $testNum: Данные совпадают")

            return true
        } else {
            println("Test $testNum: Данные не совпадают (страница: $page, файл: $file)")

            WriteToExcel()

            return false
        }
    }
    catch (Exception e) {
        println("Ошибка при сравнении данных: $e.getMessage()")

        WriteToExcel2()

        return false
    } 
}

static def WriteToExcel(Map params) {
    try {
        String sheetName = 'List1'

        def data = findTestData('Test Data')

        int n = data.getRowNumbers() + 1

        def workbook = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

        def sheet = ExcelKeywords.getExcelSheet(workbook, sheetName)

        Date d = new Date()

        String date = new SimpleDateFormat('dd.MM.yyyy').format(d)

        String dZO

        String year

        ExcelKeywords.setValueToCellByIndex(sheet, n, 0, 'Отпуск в сеть')

        ExcelKeywords.setValueToCellByIndex(sheet, n, 1, dZO)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 2, params.typeData)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 3, params.file)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 4, params.page)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 5, year)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 6, date)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 7, )

        ExcelKeywords.setValueToCellByIndex(sheet, n, 8, "Test $params.testNum")

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook)
    }
    catch (Exception e) {
        println("Ошибка при записи в Excel: $e.getMessage()")
    } 
}

static def WriteToExcel2(Map params) {
    try {
        String sheetName = 'List1'

        def data = findTestData('Test Data')

        int n = data.getRowNumbers() + 1

        def workbook = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

        def sheet = ExcelKeywords.getExcelSheet(workbook, sheetName)

        Date d = new Date()

        String date = new SimpleDateFormat('dd.MM.yyyy').format(d)

        String dZO

        String year

        ExcelKeywords.setValueToCellByIndex(sheet, n, 0, 'Отпуск в сеть')

        ExcelKeywords.setValueToCellByIndex(sheet, n, 1, dZO)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 2, year)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 3, date)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 4, params.err)

        ExcelKeywords.setValueToCellByIndex(sheet, n, 5, "Test $params.testNum")

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook)
    }
    catch (Exception e) {
        println("Ошибка при записи ошибки в Excel: $e.getMessage()")
    } 
}

