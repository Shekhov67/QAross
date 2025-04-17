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

def test17 = Test17()

static def Test1() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 4))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/снять выделенные в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Объем потерь сверка - Балансы/применить в фильтре ДЗО- Балансы'))

    dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    println(dZO)

    WebUI.delay(10)

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test2() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test3() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Волга'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test4() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test5() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test6() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test7() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test8() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test9() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test10() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Томск'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test11() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Тюмень'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test12() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test13() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/Магистральные сети'))

    WebUI.click(findTestObject('Объем потерь сверка/Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test14() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test15() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test16() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def Test17() {
    String widget

    String dZO

    String year

    String month = GlobalVariable.period

    WebUI.openBrowser('')

    WebUI.refresh()

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗОО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.delay(10)

    String a = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок руководителя)1'))

    println(a)

    String b = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок руководителя)1'))

    println(b)

    String e = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь'))

    println(e)

    String f = WebUI.getText(findTestObject('Объем потерь сверка/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь'))

    println(f)

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

    String a1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Объем потерь (Блок Балансы)'))

    println(a1)

    String b1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Уровень потерь (Блок Балансы)'))

    println(b1)

    String e1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонение объема потерь(Блок Балансы)'))

    println(e1)

    String f1 = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/Данные со страницы Объем потерь/Данные с виджета Отклонения уровня потерь(Блок Балансы)'))

    println(f1)

    def compromision = Compromosion(def a0 = a, def b0 = b, def e0 = e, def f0 = f, def a01 = a1, def b01 = b1, def e01 = e1, 
        def f01 = f1)
}

static def WriteToExcel(def widget, def dZO) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dzo = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

    println(dzo)

    String month = GlobalVariable.period

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(dZO)

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

static def Compromosion(def a0, def b0, def e0, def f0, def a01, def b01, def e01, def f01) {
    if (WebUI.verifyEqual(a0, a01)) {
        println('GOOD')

        String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

        println(dZO)
    } else {
        String widget = 'Виджет: Объем потерь'

        String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

        println(dZO)

        WriteToExcel(widget, dZO)
    }
    
    if (WebUI.verifyEqual(b0, b01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Уровень потерь'

        String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

        WriteToExcel(widget, dZO)
    }
    
    if (WebUI.verifyEqual(e0, e01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Отклонение объема потерь'

        String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

        WriteToExcel(widget, dZO)
    }
    
    if (WebUI.verifyEqual(f0, f01)) {
        println('GOOD')
    } else {
        String widget = 'Виджет: Отклонение уровня потерь'

        String dZO = WebUI.getText(findTestObject('Объем потерь сверка - Балансы/фильр ДЗО'))

        WriteToExcel(widget, dZO)
    }
    
    WebUI.closeBrowser()
}

