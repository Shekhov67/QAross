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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('')

WebUI.refresh()

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 7))

WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.click(findTestObject('Общие/button_'))

def date = SelectDate()

def dzo = SelectDzo()

def test1 = Testing1()

def test2 = Testing2()

def page

WebUI.closeBrowser()

static def Testing1(def page) {
    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    def errAndDzo = ErrorsAndDzo()

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/АО Тываэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Тываэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/АО Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Волга'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Мородовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Мородовэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Оренбургэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Оренбургэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Пензаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Пензаэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Самарские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Самарские РС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Саратовские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Саратовские РС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Ульяновские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Ульяновские РС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Чувашэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Чувашэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Кубань'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Кубаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Кубаньэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Ленэнерго(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/ПАО Россети Ленэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/ПАО Россети Ленэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Московская область'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Московская область'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/г.Москва'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/г.Москва'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Дагэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Дагэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Ингушэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Ингушэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Каббалкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Каббалкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Карачаево-Черкесскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Карачаево-Черкесскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Севкавказэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Севкавказэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Ставропльэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Ставропльэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Архангельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Архангельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Вологодский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Вологодский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Карельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Карельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Мурманский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Мурманский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Новгородский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Новгородский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Псковский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Псковский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/филиал в республике Коми'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/филиал в республике Коми'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()
}

static def Testing2(def page) {
    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    def errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Алтайэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Алтайэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Бурятэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Бурятэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Красноярскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Красноярскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Кузбасэнерго-РЭС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Кузбасэнерго-РЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Омскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Омскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Хакасэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Хакасэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Читаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Читаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Томск'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Томск'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Томская распределительная компания'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Томская распределительная компания'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Тюмень'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Тюмень'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Тюмень'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/АО ЕЭСК'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/АО ЕЭСК'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Пермэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Пермэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Свердловэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Свердловэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Челябэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Челябэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Магистральные сети'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Итого по ФСК ЕЭС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Центр'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Белгородэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Белгородэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Брянскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Брянскэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Воронежэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Воронежэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Костромаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Костромаэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Курскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Курскэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Липецкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Липецкэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Орелэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Орелэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Смоленскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Смоленскэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Тамбовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Тамбовэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Тверьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Тверьэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Ярэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Ярэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Владимирэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Владимирэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Ивэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Ивэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Калугаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Калугаэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Кировэенрго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Кировэенрго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Мариэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Мариэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Нижновэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Нижновэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Рязаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Рязаньэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Тулэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Тулэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Удмуртэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Удмуртэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/АО ВМЭС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/АО ВМЭС'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Астраханьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Астраханьэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Калмэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Калмэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Ростовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Ростовэнерго'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    errAndDzo = ErrorsAndDzo()

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Россети Янтарь'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Янтарь'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    def scan = ScanErrors()
}

static def ErrorsAndDzo(def page) {
    def scan = ScanErrors()

    def dzo = SelectDzo()
}

static def SelectDzo(def page) {
    WebUI.click(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/РаспредКомплекс'))
}

static def SelectDate(def page) {
    WebUI.click(findTestObject('Отпуск из сети(виджеты)/фильтр Дата'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре Дата'))

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/1 квартал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/Январь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск из сети(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Январь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/Февраль'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск из сети(виджеты)/применить в фильтре Дата'))
}

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

static def WriteToExcel(def page) {
    println(GlobalVariable.excelFilePath)

    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Отпуск из сети(виджеты)/фильтр Дата'))

    println(year)

    String dashboardName = 'Отпуск из сети'

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

        n = (n + 1)

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
    } else {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
            ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

            n = (n + 1)

            ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
        } else {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

                n = (n + 1)

                ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
            } else {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

                    n = (n + 1)

                    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                } else {
                    if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

                        n = (n + 1)

                        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                    }
                }
            }
        }
    }
}

