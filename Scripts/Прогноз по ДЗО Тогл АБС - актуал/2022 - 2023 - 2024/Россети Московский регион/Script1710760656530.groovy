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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.openqa.selenium.Keys as Keys
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

def openBrowser = OpenBrowser()

WebUI.click(findTestObject('Прогноз по ДЗО/тогл на МЛН'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/снять выделенные в ФИЛЬТРЕ дзо'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.doubleClick(findTestObject('Прогноз по ДЗО/ПАО Россети'))

WebUI.click(findTestObject('Прогноз по ДЗО/РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Россети Москвоский регион'), 30)

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Россети Московский регион'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

def selectDate = SelectDate()

WebUI.closeBrowser()

openBrowser = OpenBrowser()

WebUI.click(findTestObject('Прогноз по ДЗО/тогл на МЛН'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/снять выделенные в ФИЛЬТРЕ дзо'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.doubleClick(findTestObject('Прогноз по ДЗО/ПАО Россети'))

WebUI.click(findTestObject('Прогноз по ДЗО/РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Россети Москвоский регион'), 30)

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

WebUI.click(findTestObject('Прогноз по ДЗО/Россети Москвоский регион'))

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Московская область'), 30)

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

WebUI.click(findTestObject('Прогноз по ДЗО/Московская область'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

selectDate = SelectDate()

WebUI.closeBrowser()

openBrowser = OpenBrowser()

WebUI.click(findTestObject('Прогноз по ДЗО/тогл на МЛН'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/снять выделенные в ФИЛЬТРЕ дзо'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

WebUI.doubleClick(findTestObject('Прогноз по ДЗО/ПАО Россети'))

WebUI.click(findTestObject('Прогноз по ДЗО/РаспредКомплекс'))

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Россети Москвоский регион'), 30)

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

WebUI.click(findTestObject('Прогноз по ДЗО/Россети Москвоский регион'))

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Москва'), 30)

WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

WebUI.click(findTestObject('Прогноз по ДЗО/Москва'))

WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

selectDate = SelectDate()

WebUI.closeBrowser( //////////////Запись даты
    ///////////////
    )

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

static def varianttFilter() {
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

static def SelectDate() {
    
    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Год'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать 2024'))

    def selectMouth = SelectMouth()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Год'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать 2025'))

    WebUI.callTestCase(findTestCase('Тестовые тесты/Фильтр дата в прогнозе по ДЗО'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

static def SelectMouth() {
    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Январь'))

    def variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Февраль'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Март'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Апрель'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Май'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.click(findTestObject('Прогноз по ДЗО/Июнь'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Июль'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Июль'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Август'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Август'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Сентябрь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Сентябрь'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Октябрь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Октябрь'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Ноябрь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Ноябрь'))

    variant = varianttFilter()

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Декабрь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Декабрь'))

    variant = varianttFilter()
}

static def OpenBrowser() {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(3, 1))

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

static def WriteToExcel(def page) {
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

    String togle = 'переключатель на абс'

    String dashboardName = 'Прогноз по ДЗО'

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelPrognozDzo)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
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
    } else {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
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
        } else {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
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
            } else {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
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
                } else {
                    if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
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
                }
            }
        }
    }
}

