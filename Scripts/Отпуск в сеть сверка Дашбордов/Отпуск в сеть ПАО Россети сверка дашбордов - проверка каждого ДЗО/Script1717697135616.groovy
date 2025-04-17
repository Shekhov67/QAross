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

String pageBR

String pageBB

String dZO

String dZOBR

String dZOBB

dZO = 'ПАО Россети'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'ФСК ЕЭС'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Тываэнерго'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Чеченэнерго'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Волга'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Кубань'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Росссети Ленэнерго(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Московский регион'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Северный Кавказ(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Северо-Запад'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Сибирь(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Томск'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Тюмень'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Урал(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Центр'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Центр и Приволжье(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Юг(ГК)'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

dZO = 'Россети Янтарь'

Test(pageBR, pageBB, dZO, dZOBR, dZOBB)

static void DZOChange1(def dZO, def dZOBR, def dZOBB) {
    if (dZO == 'ПАО Россети') {
        println(dZO)
    }
    
    if (dZO == 'ФСК ЕЭС') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

        WebUI.click(findTestObject('Отпуск в сеть сверка/Магистральные сети'))

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети ФСК ЕЭС'))
    }
    
    if (dZO == 'Тываэнерго') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Тываэнерго'))
    }
    
    if (dZO == 'Чеченэнерго') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Чеченэнерго'))
    }
    
    if (dZO == 'Россети Волга') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Волга'))
    }
    
    if (dZO == 'Россети Кубань') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Кубань'))
    }
    
    if (dZO == 'Росссети Ленэнерго(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Росссети Ленэнерго(ГК)'))
    }
    
    if (dZO == 'Россети Московский регион') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Московский регион'))
    }
    
    if (dZO == 'Россети Северный Кавказ(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северный Кавказ(ГК)'))
    }
    
    if (dZO == 'Россети Северо-Запад') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северо-Запад'))
    }
    
    if (dZO == 'Россети Сибирь(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Сибирь(ГК)'))
    }
    
    if (dZO == 'Россети Томск') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Томск'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Томск'))
    }
    
    if (dZO == 'Россети Тюмень') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Тюмень'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Тюмень'))
    }
    
    if (dZO == 'Россети Урал(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Урал(ГК)'))
    }
    
    if (dZO == 'Россети Центр') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр'))
    }
    
    if (dZO == 'Россети Центр и Приволжье(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр и Приволжье(ГК)'))
    }
    
    if (dZO == 'Россети Юг(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

        WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Юг(ГК)'))
    }
    
    if (dZO == 'Россети Янтарь') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

        WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Янтарь'))
    }
}

static void DZOChange2(def dZO, def dZOBR, def dZOBB) {
    if (dZO == 'ПАО Россети') {
        println(dZO)
    }
    
    if (dZO == 'ФСК ЕЭС') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

        WebUI.click(findTestObject('Отпуск в сеть сверка/Магистральные сети'))

        WebUI.click(findTestObject('Отпуск в сеть Балансы/FSK'))
    }
    
    if (dZO == 'Тываэнерго') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/tuv'))
    }
    
    if (dZO == 'Чеченэнерго') {
        println(dZO)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/chech'))
    }
    
    if (dZO == 'Россети Волга') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/volga'))
    }
    
    if (dZO == 'Россети Кубань') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/kub'))
    }
    
    if (dZO == 'Росссети Ленэнерго(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/len'))
    }
    
    if (dZO == 'Россети Московский регион') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/MR'))
    }
    
    if (dZO == 'Россети Северный Кавказ(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/sevkav'))
    }
    
    if (dZO == 'Россети Северо-Запад') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/seveeroZapad'))
    }
    
    if (dZO == 'Россети Сибирь(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть Россети Сибирь(ГК)'), 
            30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/sibir'))
    }
    
    if (dZO == 'Россети Томск') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/tomsk'))
    }
    
    if (dZO == 'Россети Тюмень') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/tumen'))
    }
    
    if (dZO == 'Россети Урал(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/ural'))
    }
    
    if (dZO == 'Россети Центр') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/Россети Центр'))
    }
    
    if (dZO == 'Россети Центр и Приволжье(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/Россети Центр и Приволжье'))
    }
    
    if (dZO == 'Россети Юг(ГК)') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/ug'))
    }
    
    if (dZO == 'Россети Янтарь') {
        println(dZO)

        WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

        WebUI.click(findTestObject('Отпуск в сеть Балансы/yantar'))
    }
}

def Test(def pageBR, def pageBB, def dZO, def dZOBR, def dZOBB) {
    int i

    String a1

    String b1

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

    WebUI.refresh()

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.delay(20)

    if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(20)
    } else {
        WebUI.refresh()

        WebUI.delay(20)

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))
    }
    
    ChangeDateBR()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    DZOChange1(dZO, dZOBR, dZOBB)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.delay(10)

    dZOBR = WebUI.getText(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    a1 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Page_Visiology Platform/a1'))

    if (a1 != null) {
        if (a1.contains('нет данных') == true) {
            a1 = 'У виджета нет данных'
        } else {
            println(a1)

            a1 = a1.replaceAll('\\s+', '')

            println(a1)
        }
    }
    
    println(a1)

    'БАЛАНСЫ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 6))

    WebUI.delay(20)

    ChangeDateBB()

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/убрать выделеные в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/РаспредКомплекс'))

    DZOChange2(dZO, dZOBR, dZOBB)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть Балансы/scrl'), 30)

    WebUI.click(findTestObject('Отпуск в сеть Балансы/применить в фльтре ДЗО Балансы'))

    WebUI.delay(10)

    dZOBB = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    b1 = WebUI.getText(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/данные с виджета в блоке Балансы'))

    println(b1)

    if (b1 == null) {
        String v = 'Виджет отпуск в сеть'

        if (a1 == null) {
            WriteToExcel2(pageBR = 'У виджета нет данных', pageBB = 'У виджета нет данных', dZO, v)
        } else if (a1.contains('У виджета нет данных')) {
            WriteToExcel2(pageBR = 'У виджета нет данных', pageBB = 'У виджета нет данных', dZO, v)
        } else {
            WriteToExcel2(pageBR = a1, pageBB = 'У виджета нет данных', dZO, v)
        }
    } else if (b1.contains('нет данных')) {
        String v = 'Виджет отпуск в сеть'

        if (a1 == null) {
            WriteToExcel2(pageBR = 'У виджета нет данных', pageBB = 'У виджета нет данных', dZO, v)
        } else if (a1.contains('У виджета нет данных')) {
            WriteToExcel2(pageBR = 'У виджета нет данных', pageBB = 'У виджета нет данных', dZO, v)
        } else {
            WriteToExcel2(pageBR = a1, pageBB = 'У виджета нет данных', dZO, v)
        }
    } else {
        b1 = b1.substring(b1.indexOf('в сеть') + 6, b1.indexOf('Факт'))

        b1 = b1.replaceAll('\\D+', '')

        println(b1)

        println(b1.length())

        i = (b1.length() / 2)

        b1 = b1.substring(i)

        println('b1: ' + b1)

        if (WebUI.verifyEqual(a1, b1)) {
            println('GOOD')
        } else {
            String v = 'Виджет отпуск в сеть'

            String a = a1

            String b = b1

            WriteToExcel(a, b, v, dZO)
        }
    }
    
    WebUI.verifyEqual(a1, b1)

    'Проверка, что были выбраны одинаковые ДЗО в Блоке Руководителя и в Блоке Балансы'
    WebUI.verifyEqual(dZOBR, dZOBB)

    WebUI.closeBrowser()
}

def ChangeDateBR() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/1 квартал'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Январь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/Январь'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/Февраль'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))
}

def ChangeDateBB() {
    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр Дата в блоке Балансы'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/фильтр Дата в блоке Балансы'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/1 квартал'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Январь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть сверка/Январь'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/Февраль'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре Дата'))
}

static def WriteToExcel(def a, def b, def v, def dZO) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String year = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр Дата в блоке Балансы'))

    String dZO1 = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    if (dZO1 == 'Все') {
        dZO1 = 'ПАО Россети'
    }
    
    println(year)

    String dashboardName = 'Отпуск в сеть'

    String page1 = 'Данные не совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO1)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, a)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, b)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, v)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, page1)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def WriteToExcel2(def pageBR, def pageBB, def dZO, def v) {
    String dZO1 = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр ДЗО в Блоке Балансы'))

    if (dZO1 == 'Все') {
        dZO1 = 'ПАО Россети'
    }
    
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String year = WebUI.getText(findTestObject('Отпуск в сеть сверка/фильтр Дата в блоке Балансы'))

    println(year)

    String dashboardName = 'Отпуск в сеть'

    String page1

    if (pageBR == pageBB) {
        page1 = 'Данные отсутствуют'
    } else {
        page1 = 'Данные не совпадают'
    }
    
    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO1)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, pageBR)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, pageBB)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, v)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, page1)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

