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

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 5))

WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.click(findTestObject('Общие/button_'))

def date = SelectDate()

def test1 = Testing1()

def test2 = Testing2()

WebUI.closeBrowser()

static def Testing1() {
    def dzo = SelectDzo()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    def dzoScan = DzoAndScan()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/АО Тываэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Тываэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/АО Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Чеченэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Волга'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Мородовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Мородовэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Оренбургэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Оренбургэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Пензаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Пензаэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Самарские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Самарские РС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Саратовские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Саратовские РС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ульяновские РС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ульяновские РС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Чувашэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Чувашэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Кубань'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Кубаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Кубаньэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Ленэнерго(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/ПАО Россети Ленэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/ПАО Россети Ленэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Московская область'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Московская область'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Московская область'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/г.Москва'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/г.Москва'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Дагэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Дагэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ингушэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ингушэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Каббалкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Каббалкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Карачаево-Черкесскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Карачаево-Черкесскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Севкавказэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Севкавказэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ставропльэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ставропльэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Архангельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Архангельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Вологодский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Вологодский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Карельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Карельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Мурманский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Мурманский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Новгородский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Новгородский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Псковский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Псковский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/филиал в республике Коми'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/филиал в республике Коми'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()
}

static def Testing2() {
    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    def dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Алтайэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Алтайэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Бурятэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Бурятэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Красноярскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Красноярскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Кузбасэнерго-РЭС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Кузбасэнерго-РЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Омскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Омскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Хакасэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Хакасэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Читаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Читаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Томск'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Томск'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Томская распределительная компания'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Томская распределительная компания'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Тюмень'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Тюмень'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Тюмень'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/АО ЕЭСК'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/АО ЕЭСК'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Пермэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Пермэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Свердловэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Свердловэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Челябэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Челябэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Магистральные сети'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Итого по ФСК ЕЭС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Центр'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Белгородэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Белгородэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Брянскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Брянскэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Воронежэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Воронежэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Костромаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Костромаэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Курскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Курскэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Липецкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Липецкэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Орелэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Орелэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Смоленскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Смоленскэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Тамбовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Тамбовэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Тверьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Тверьэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Ярэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Ярэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Владимирэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Владимирэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ивэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ивэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Калугаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Калугаэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Кировэенрго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Кировэенрго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Мариэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Мариэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Нижновэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Нижновэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Рязаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Рязаньэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Тулэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Тулэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Удмуртэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Удмуртэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/АО ВМЭС'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/АО ВМЭС'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Астраханьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Астраханьэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Волгоградэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Волгоградэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Калмэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Калмэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Ростовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Ростовэнерго'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    dzoScan = DzoAndScan()

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Россети Янтарь'))

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Янтарь'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    def scan = ScanErrors()
}

static def DzoAndScan() {
    def scan = ScanErrors()

    def dzo = SelectDzo()

    WebUI.deleteAllCookies()
}

static def SelectDate() {
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

static def SelectDzo() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/РаспредКомплекс'))

    WebUI.deleteAllCookies()
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

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, date)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

