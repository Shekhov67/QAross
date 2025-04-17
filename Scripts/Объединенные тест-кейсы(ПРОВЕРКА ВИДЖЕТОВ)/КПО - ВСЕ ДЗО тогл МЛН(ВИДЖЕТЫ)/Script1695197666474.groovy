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

WebUI.openBrowser('')

WebUI.refresh()

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/КПО/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/КПО/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.click(findTestObject('Object Repository/КПО/button_'))

def page

def selectDate = SelectDate()

def one = FirstStep()

def testing1 = Testing1(page)

def testing2 = Testing2(page)

WebUI.closeBrowser()

static def Testing1(def page) {
    WebUI.click(findTestObject('КПО/выбрать ДЗО АО Тываэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    def selectKpo = SelektKpoAndFirstStep(page)

    WebUI.click(findTestObject('КПО/выбрать АО РЭС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.click(findTestObject('КПО/выбрать АО Чеченэнерго'))

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Волга'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Мордовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Мордовэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Чувашэнерго'), 30)

    WebUI.click(findTestObject('КПО/Оренбургэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Пензаэнерго'), 30)

    WebUI.click(findTestObject('КПО/Пензаэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Самарские РС'), 30)

    WebUI.click(findTestObject('КПО/Самарские РС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Ульяновские РС'), 30)

    WebUI.click(findTestObject('КПО/Ульяновские РС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.click(findTestObject('КПО/Россети Волга'))

    WebUI.scrollToElement(findTestObject('КПО/Чувашэнерго'), 30)

    WebUI.click(findTestObject('КПО/Чувашэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Волга'), 30)

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    WebUI.scrollToElement(findTestObject('КПО/выбрать Россети Кубань'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Кубань'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Кубань'), 30)

    WebUI.click(findTestObject('КПО/Россети Кубань'))

    WebUI.click(findTestObject('КПО/Кубаньэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Ленэнерго(ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Ленэнерго (ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Ленэнерго(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('КПО/Ленинградская область'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Ленэнерго(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('КПО/Санкт-Петербург'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Московский регион'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Московский регион'), 30)

    WebUI.click(findTestObject('КПО/Россети Московский регион'))

    WebUI.click(findTestObject('КПО/Москвоская область'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Московский регион'), 30)

    WebUI.click(findTestObject('КПО/Россети Московский регион'))

    WebUI.click(findTestObject('КПО/Москва'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Дагестанская энергосбытовая компания'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Дагэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Ингушэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Каббалкэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Карачаево-Черкессэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.click(findTestObject('КПО/Севкавказэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северный-Кавказ(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Северный-Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Ставропольэнерго'), 30)

    WebUI.click(findTestObject('КПО/Ставропольэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/Архангельский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/Вологодский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/Карельский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/Мурманский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.click(findTestObject('КПО/Новгородский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('КПО/Псковский филиал'), 30)

    WebUI.click(findTestObject('КПО/Псковский филиал'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Северо-Запад'), 30)

    WebUI.click(findTestObject('КПО/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('КПО/филиал в Республике Коми'), 30)

    WebUI.click(findTestObject('КПО/филиал в Республике Коми'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.click(findTestObject('КПО/Алтайэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.click(findTestObject('КПО/Бурятэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.click(findTestObject('КПО/ГАЭС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.click(findTestObject('КПО/Красноярскэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.click(findTestObject('КПО/Кузбассэнерго-РЭС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Омскэнерго'), 30)

    WebUI.click(findTestObject('КПО/Омскэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Хакасэнерго'), 30)

    WebUI.click(findTestObject('КПО/Хакасэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Сибирь (ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Читаэнерго'), 30)

    WebUI.click(findTestObject('КПО/Читаэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Томск'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Томск'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Томск'), 30)

    WebUI.click(findTestObject('КПО/Россети Томск'))

    WebUI.click(findTestObject('КПО/Томская распределительная компания'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Тюмень(верхний уровень)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Тюмень'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Тюмень(верхний уровень)'), 30)

    WebUI.click(findTestObject('КПО/Россети Тюмень'))

    WebUI.click(findTestObject('КПО/Россети Тюмень(нижний уровень)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    '111111111111111111111111111111111'
}

static def Testing2(def page) {
    WebUI.scrollToElement(findTestObject('КПО/Россети Урал(ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    def selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Урал(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Урал(ГК)'))

    WebUI.click(findTestObject('КПО/Пермэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Урал(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Урал(ГК)'))

    WebUI.click(findTestObject('КПО/Свердловэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Урал(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Урал(ГК)'))

    WebUI.click(findTestObject('КПО/Челябэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Центр'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.click(findTestObject('КПО/Белгородэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.click(findTestObject('КПО/Брянскэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.click(findTestObject('КПО/Воронежэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Костромаэнерго'), 30)

    WebUI.click(findTestObject('КПО/Костромаэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Курскэнерго'), 30)

    WebUI.click(findTestObject('КПО/Курскэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Липецкэнерго'), 30)

    WebUI.click(findTestObject('КПО/Липецкэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Орелэнерго'), 30)

    WebUI.click(findTestObject('КПО/Орелэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Смоленскэнерго'), 30)

    WebUI.click(findTestObject('КПО/Смоленскэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Тамбовэнерго'), 30)

    WebUI.click(findTestObject('КПО/Тамбовэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Тверьэнерго'), 30)

    WebUI.click(findTestObject('КПО/Тверьэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр'))

    WebUI.scrollToElement(findTestObject('КПО/Ярэнерго'), 30)

    WebUI.click(findTestObject('КПО/Ярэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.click(findTestObject('КПО/Владимирэненрго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.click(findTestObject('КПО/Ивэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Калугаэнерго'), 30)

    WebUI.click(findTestObject('КПО/Калугаэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Кировэнерго'), 30)

    WebUI.click(findTestObject('КПО/Кировэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Мариэнерго'), 30)

    WebUI.click(findTestObject('КПО/Мариэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Нижновэнерго'), 30)

    WebUI.click(findTestObject('КПО/Нижновэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Рязаньэнерго'), 30)

    WebUI.click(findTestObject('КПО/Рязаньэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Тулэнерго'), 30)

    WebUI.click(findTestObject('КПО/Тулэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Центр и Привольжье(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Центр и Привольжье(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Удмуртэнерго'), 30)

    WebUI.click(findTestObject('КПО/Удмуртэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Юг(ГК)'))

    WebUI.click(findTestObject('КПО/АО ВМЭС'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Астраханьэнерго'), 30)

    WebUI.click(findTestObject('КПО/Астраханьэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Волгоградэнерго'), 30)

    WebUI.click(findTestObject('КПО/Волгоградэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Калмэнерго'), 30)

    WebUI.click(findTestObject('КПО/Калмэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)

    WebUI.scrollToElement(findTestObject('КПО/Россети Юг(ГК)'), 30)

    WebUI.click(findTestObject('КПО/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('КПО/Ростовэнерго'), 30)

    WebUI.click(findTestObject('КПО/Ростовэнерго'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.scrollToElement(findTestObject('КПО/скролл Заголовок дашборда'), 30)

    selectKpo = SelektKpoAndFirstStep(page)
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

    String dZO = WebUI.getText(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    String filtrDate = WebUI.getText(findTestObject('КПО/фильтр Дата'))

    String filter = WebUI.getText(findTestObject('КПО/фильтр Выручка'))

    String togle = 'переключатель млн.'

    println(filtrDate)

    String dashboardName = 'Котловой полезный отпуск'

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

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, filtrDate)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filter)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, togle)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

        n = (n + 1)

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
    } else {
        if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
            ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, filtrDate)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filter)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, togle)

            ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

            n = (n + 1)

            ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
        } else {
            if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
                ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, filtrDate)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filter)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, togle)

                ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

                n = (n + 1)

                ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
            } else {
                if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, date)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filter)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, togle)

                    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

                    n = (n + 1)

                    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                } else {
                    if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, filtrDate)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, filter)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, togle)

                        ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, date)

                        n = (n + 1)

                        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
                    }
                }
            }
        }
    }
}

static def FirstStep() {
    '1'
    WebUI.click(findTestObject('Object Repository/КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('КПО/фильтр ДЗО'))

    WebUI.click(findTestObject('КПО/ПАО Россети'))

    '0'
    WebUI.click(findTestObject('КПО/РаспредКомплекс'))

    WebUI.deleteAllCookies()
}

static def VariantFilter1(def page) {
    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем реалицаии передачи ээ'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def scan = ScanErrors(page)

    WebUI.deleteAllCookies()
}

static def VariantFilter2(def page) {
    WebUI.click(findTestObject('КПО/фильтр Выручка'))

    WebUI.click(findTestObject('КПО/снять выделения в фильтре Выручка'))

    WebUI.click(findTestObject('КПО/выбрать Объем Электроэнергии'))

    WebUI.click(findTestObject('КПО/применить в фильтре Выручка'))

    def scan = ScanErrors(page)

    WebUI.deleteAllCookies()
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

    WebUI.deleteAllCookies()
}

static def SelektKpoAndFirstStep(def page) {
    def filter1 = VariantFilter1(page)

    def filter2 = VariantFilter2(page)

    WebUI.deleteAllCookies()

    def one = FirstStep()
}

