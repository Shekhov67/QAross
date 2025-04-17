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

String widget

String dzo

String togle

def test1 = VyruchkaVseToggleMln1(widget, dzo, togle)

def test2 = VyruchkaOneToggleMln2(widget, dzo, togle)

def test3 = VyruchkaTwoToggleMln3(widget, dzo, togle)

def test4 = VyruchkaVseToggleProc4(widget, dzo, togle)

def test5 = VyruchkaOneToggleProc5(widget, dzo, togle)

def test6 = VyruchkaTwoToggleProc6(widget, dzo, togle)

static def VyruchkaVseToggleMln1(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.delay(25)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def date = SelectDate()

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/ПАО Россети'))

    String ao_res = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/AO_RES'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/tuv'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/chech'))

    String volg = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/volg'))

    String kub = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/kub'))

    String len = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/len'))

    String mo = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/mo'))

    String sevKaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/sevKaz'))

    String sevZap = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/SevZap'))

    String sibir = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Sibir'))

    String tomsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Tomsk'))

    String tumen = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Tumen'))

    String ural = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Ural'))

    String fsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/FSK'))

    String centr = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Centr'))

    String centrIPriv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/CentIPriv'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Ug'))

    String yantar = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Yantar'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/ПАО Россети'))

    String ao_res1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/AO_RES'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/tuv'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/chech'))

    String volg1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/volg'))

    String kub1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/kub'))

    String len1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/len'))

    String mo1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/mo'))

    String sevKaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/sevKaz'))

    String sevZap1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/SevZap'))

    String sibir1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Sibir'))

    String tomsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Tomsk'))

    String tumen1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Tumen'))

    String ural1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Ural'))

    String fsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/FSK'))

    String centr1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Centr'))

    String centrIPriv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/CentIPriv'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Ug'))

    String yantar1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Yantar'))

    println(b)

    println(b1)

    println(pao1)

    if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'ПАО Россети', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ao_res, ao_res1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО РЭС', togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Тываэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Чеченэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(volg, volg1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Волга', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(kub, kub1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Кубань', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(len, len1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Ленэнерго(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(mo, mo1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Москвоский регион', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sevKaz, sevKaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sevZap, sevZap1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северо-Запад', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sibir, sibir1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Сибирь(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tomsk, tomsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Томск', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tumen, tumen1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Тюмень', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ural, ural1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Урал(ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(fsk, fsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети ФСК ЕЭС', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(centr, centr1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр (ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(centrIPriv, centrIPriv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр и Приволжье (ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Юг(ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(yantar, yantar1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Янтарь', togle = 
            'Переключатель на : МЛН')
    }
    
    WebUI.closeBrowser()
}

static def VyruchkaOneToggleMln2(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем Электроэнергии'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    def date = SelectDate()

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/PAO one'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/tuv one'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/chech onee'))

    String sevKaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/sevkax one'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/ug one'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр Выручка'))

    WebUI.click(findTestObject('КПО для раздела Выручка/dsNATb'))

    WebUI.click(findTestObject('КПО для раздела Выручка/OBEM'))

    WebUI.click(findTestObject('КПО для раздела Выручка/PRIM'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/PAO vurch'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/tuv vurch'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/chech vurch'))

    String sevKaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/sevkaz vurch'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/ug vyruch'))

    println(b)

    println(b1)

    println(pao1)

    if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'ПАО Россети', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО Тываэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО Чеченэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sevKaz, sevKaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Юг(ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    WebUI.closeBrowser()
}

static def VyruchkaTwoToggleMln3(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем реалицаии передачи ээ'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def date = SelectDate()

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/ПАО Россети'))

    String ao_res = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/AO_RES'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/tuv'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/chech'))

    String volg = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/volg'))

    String kub = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/kub'))

    String len = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/len'))

    String mo = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/mo'))

    String sevKaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/sevKaz'))

    String sevZap = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/SevZap'))

    String sibir = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Sibir'))

    String tomsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Tomsk'))

    String tumen = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Tumen'))

    String ural = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Ural'))

    String fsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/FSK'))

    String centr = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Centr'))

    String centrIPriv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/CentIPriv'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Ug'))

    String yantar = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл млн/Yantar'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр Выручка'))

    WebUI.click(findTestObject('КПО для раздела Выручка/dsNATb'))

    WebUI.click(findTestObject('КПО для раздела Выручка/div_EE'))

    WebUI.click(findTestObject('КПО для раздела Выручка/PRIM'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/ПАО Россети'))

    String ao_res1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/AO_RES'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/tuv'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/chech'))

    String volg1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/volg'))

    String kub1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/kub'))

    String len1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/len'))

    String mo1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/mo'))

    String sevKaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/sevKaz'))

    String sevZap1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/SevZap'))

    String sibir1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Sibir'))

    String tomsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Tomsk'))

    String tumen1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Tumen'))

    String ural1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Ural'))

    String fsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/FSK'))

    String centr1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Centr'))

    String centrIPriv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/CentIPriv'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Ug'))

    String yantar1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн/Yantar'))

    println(b)

    println(b1)

    println(pao1)

    if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'ПАО Россети', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ao_res, ao_res1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО РЭС', togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Тываэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Чеченэнерго', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(volg, volg1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Волга', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(kub, kub1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Кубань', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(len, len1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Ленэнерго(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(mo, mo1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Москвоский регион', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sevKaz, sevKaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sevZap, sevZap1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северо-Запад', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(sibir, sibir1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Сибирь(ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tomsk, tomsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Томск', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(tumen, tumen1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Тюмень', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ural, ural1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Урал(ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(fsk, fsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети ФСК ЕЭС', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(centr, centr1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр (ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(centrIPriv, centrIPriv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр и Приволжье (ГК)', 
            togle = 'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Юг(ГК)', togle = 
            'Переключатель на : МЛН')
    }
    
    if (WebUI.verifyEqual(yantar, yantar1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Янтарь', togle = 
            'Переключатель на : МЛН')
    }
    
    WebUI.closeBrowser()
}

static def VyruchkaVseToggleProc4(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/тогл ПРОЦЕНТ'))

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def date = SelectDate()

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/ПАО Россети'))

    String ao_res = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/AO_RES'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/tuv'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/chech'))

    String volg = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/volg'))

    String kub = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/kub'))

    String len = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/len'))

    String mo = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/mo'))

    String sevKaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/sevKaz'))

    String sevZap = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/SevZap'))

    String sibir = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Sibir'))

    String tomsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Tomsk'))

    String tumen = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Tumen'))

    String ural = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Ural'))

    String fsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/FSK'))

    String centr = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Centr'))

    String centrIPriv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/CentIPriv'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Ug'))

    String yantar = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент/Yantar'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/ТОГЛ НА ПРОЦЕНТ'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/ПАО Россети'))

    String ao_res1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/AO_RES'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/tuv'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/chech'))

    String volg1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/volg'))

    String kub1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/kub'))

    String len1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/len'))

    String mo1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/mo'))

    String sevKaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/sevKaz'))

    String sevZap1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/SevZap'))

    String sibir1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Sibir'))

    String tomsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Tomsk'))

    String tumen1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Tumen'))

    String ural1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Ural'))

    String fsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/FSK'))

    String centr1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Centr'))

    String centrIPriv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/CentIPriv'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Ug'))

    String yantar1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент/Yantar'))

    println(b)

    println(b1)

    println(pao1)

    if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'ПАО Россети', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ao_res, ao_res1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО РЭС', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Тываэнерго', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Чеченэнерго', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(volg, volg1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Волга', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(kub, kub1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Кубань', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(len, len1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Ленэнерго(ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(mo, mo1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Москвоский регион', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sevKaz, sevKaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sevZap, sevZap1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северо-Запад', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sibir, sibir1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Сибирь(ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tomsk, tomsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Томск', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tumen, tumen1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Тюмень', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ural, ural1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Урал(ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(fsk, fsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети ФСК ЕЭС', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(centr, centr1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр (ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(centrIPriv, centrIPriv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Центр и Приволжье (ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Юг(ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(yantar, yantar1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Янтарь', togle = 
            'Переключатель на : %')
    }
    
    WebUI.closeBrowser()
}

static def VyruchkaOneToggleProc5(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/тогл ПРОЦЕНТ'))

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем Электроэнергии'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def date = SelectDate()

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/PAO ruk'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/tuv ruk'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/chech ruk'))

    String sevkaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/sevkaz ruk'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/ug ruk'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/ТОГЛ НА ПРОЦЕНТ'))

    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр Выручка'))

    WebUI.click(findTestObject('КПО для раздела Выручка/dsNATb'))

    WebUI.click(findTestObject('КПО для раздела Выручка/OBEM'))

    WebUI.click(findTestObject('КПО для раздела Выручка/PRIM'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/PAO vur'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/tuv vur'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/chech vur'))

    String sevkaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл млн - Выручка Объем электроэнергии/sevkaz vurch'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент- Выручка Объем электроэнергии/ug vur'))

    println(b)

    println(b1)

    println(pao1)

    if (WebUI.verifyEqual(a, b) && WebUI.verifyEqual(a1, b1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'ПАО Россети', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО Тываэнерго', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'АО Чеченэнерго', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sevkaz, sevkaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: Отклонение котлового полезного отпуска', dzo = 'Россети Юг(ГК)', togle = 
            'Переключатель на : %')
    }
    
    WebUI.closeBrowser()
}

static def VyruchkaTwoToggleProc6(def widget, def dzo, def togle) {
    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

    def opnbrws = OpnBrws()

    WebUI.click(findTestObject('КПО/тогл ПРОЦЕНТ'))

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем реалицаии передачи ээ'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def date = SelectDate()

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.delay(25)

    String a = WebUI.getText(findTestObject('КПО/Данные с виджета факт1'))

    String a1 = WebUI.getText(findTestObject('КПО/Данные с виджета ПЛАН1'))

    String pao = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/ПАО Россети'))

    String ao_res = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/AO_RES'))

    String tuv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/tuv'))

    String chech = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/chech'))

    String volg = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/volg'))

    String kub = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/kub'))

    String len = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/len'))

    String mo = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/mo'))

    String sevKaz = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/sevKaz'))

    String sevZap = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/SevZap'))

    String sibir = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Sibir'))

    String tomsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Tomsk'))

    String tumen = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Tumen'))

    String ural = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Ural'))

    String fsk = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/FSK'))

    String centr = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Centr'))

    String centrIPriv = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/CentIPriv'))

    String ug = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Ug'))

    String yantar = WebUI.getText(findTestObject('КПО/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Yantar'))

    println(a)

    println(a1)

    println(pao)

    'ВЫРУЧКА'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 2))

    WebUI.delay(25)

    if (WebUI.verifyTextPresent('Просьба обратить внимание', true) == true) {
        WebUI.click(findTestObject('КПО для раздела Выручка/закрыть уведомление'))
    }
    
    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/снять выделения в ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО для раздела Выручка/ТОГЛ НА ПРОЦЕНТ'))

    WebUI.click(findTestObject('КПО для раздела Выручка/Фильтр Выручка'))

    WebUI.click(findTestObject('КПО для раздела Выручка/dsNATb'))

    WebUI.click(findTestObject('КПО для раздела Выручка/div_EE'))

    WebUI.click(findTestObject('КПО для раздела Выручка/PRIM'))

    WebUI.delay(25)

    String b = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета факт'))

    String b1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета ПЛАН'))

    String pao1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/ПАО Россети'))

    String ao_res1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/AO_RES'))

    String tuv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/tuv'))

    String chech1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/chech'))

    String volg1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/volg'))

    String kub1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/kub'))

    String len1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/len'))

    String mo1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/mo'))

    String sevKaz1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/sevKaz'))

    String sevZap1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/SevZap'))

    String sibir1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Sibir'))

    String tomsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Tomsk'))

    String tumen1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Tumen'))

    String ural1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Ural'))

    String fsk1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/FSK'))

    String centr1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Centr'))

    String centrIPriv1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/CentIPriv'))

    String ug1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Ug'))

    String yantar1 = WebUI.getText(findTestObject('КПО для раздела Выручка/Данные с виджета Отклонения - тогл процент -Выручка Объем реализации подачи ээ/Yantar'))

    if (WebUI.verifyEqual(pao, pao1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'ПАО Россети', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ao_res, ao_res1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'АО РЭС', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tuv, tuv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Тываэнерго', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(chech, chech1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Чеченэнерго', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(volg, volg1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Волга', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(kub, kub1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Кубань', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(len, len1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Ленэнерго(ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(mo, mo1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Москвоский регион', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sevKaz, sevKaz1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Северный Кавказ(ГК)', 
            togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sevZap, sevZap1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Северо-Запад', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(sibir, sibir1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Сибирь(ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tomsk, tomsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Томск', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(tumen, tumen1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Тюмень', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ural, ural1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Урал(ГК)', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(fsk, fsk1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети ФСК ЕЭС', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(centr, centr1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Центр (ГК)', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(centrIPriv, centrIPriv1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Центр и Приволжье (ГК)', togle = 
            'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(ug, ug1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Юг(ГК)', togle = 'Переключатель на : %')
    }
    
    if (WebUI.verifyEqual(yantar, yantar1)) {
        println('GOOD')
    } else {
        def write = WriteToExcel(widget = 'Виджет: ВЫполнение плановых показателй', dzo = 'Россети Янтарь', togle = 'Переключатель на : %')
    }
    
    WebUI.closeBrowser()
}

static def WriteToExcel(def widget, def dzo, def togle) {
    println(dzo)

    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String year = WebUI.getText(findTestObject('КПО для раздела Выручка/фильтр Дата'))

    println(year)

    String dashboardName = 'Котловой полезный отпуск'

    String page = 'Данные не  совпадают'

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    String fltr = WebUI.getText(findTestObject('КПО для раздела Выручка/Фильтр Выручка'))

    println(fltr)

    String filtrVrch = 'Фильтр Выручка: ' + fltr

    println(filtrVrch)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dzo)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, filtrVrch)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, widget)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, togle)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)

    WebUI.acceptAlert()
}

static def SelectDate() {
    WebUI.click(findTestObject('КПО/фильтр Дата'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('КПО/применить в фильтре Дата'))

    WebUI.click(findTestObject('КПО/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('КПО/Page_Visiology Platform/раскрыть 2025 год'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('КПО/Page_Visiology Platform/раскрыть 2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('КПО/Page_Visiology Platform/раскрыть 1 квартал 2025 года'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('КПО/Page_Visiology Platform/раскрыть 1 квартал 2025 года'))

    WebUI.scrollToElement(findTestObject('КПО/Page_Visiology Platform/Январь 2025 года'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Фильтр дата'), 30)

    WebUI.click(findTestObject('КПО/Page_Visiology Platform/Январь 2025 года'))

    WebUI.click(findTestObject('КПО/Февраль 2025'))

    WebUI.click(findTestObject('КПО/применить в фильтре Дата'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)
}

static def OpnBrws() {
    if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(25)
    } else {
        WebUI.refresh()

        WebUI.delay(25)

        WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

        WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

        WebUI.click(findTestObject('Общие в сеть/button_'))

        WebUI.delay(25)

        if (WebUI.verifyElementText(findTestObject('Общие/button_'), 'Вход') == true) {
            WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

            WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

            WebUI.click(findTestObject('Общие в сеть/button_'))

            WebUI.delay(25)
        } else {
            WebUI.refresh()

            WebUI.delay(25)

            WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

            WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

            WebUI.click(findTestObject('Общие в сеть/button_'))

            WebUI.delay(25)
        }
    }
}

