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

WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

WebUI.click(findTestObject('Общие/button_'))

def selectDate = SelectDate()

//def actualDate = ActualDate()
def testing1 = Testing1()

def testing2 = Testing2()

WebUI.closeBrowser( //в соответствии с текущим месяцем выбирать дату для сравнения
    // Возвращает текущую дату
    //Дата для сравнения
    // Возвращает текущую дату
    //Дата для сравнения
    // Возвращает текущую дату
    //Дата для сравнения
    )

static def Testing1() {
    def oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать АО Чеченэнерго'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Волга'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Мородовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Мородовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Оренбургэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Оренбургэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Пензаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Пензаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Самарские РС'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Самарские РС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Саратовские РС'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Саратовские РС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ульяновские РС'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ульяновские РС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Волга'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Чувашэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Чувашэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Кубань'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Кубань'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Кубань'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Кубаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Кубаньэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Росссети Ленэнерго(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Ленэнерго(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Ленэнерго(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ленэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ленэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Московский регион'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Московская область'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Московская область'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Московский регион'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Московский регион'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/г.Москва'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/г.Москва'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Северный Кавказ(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Дагэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Дагэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ингушэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ингушэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Каббалкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Каббалкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Карачаево-Черкесскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Карачаево-Черкесскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Севкавказэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Севкавказэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северный Кавказ(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ставропльэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ставропльэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Северо-Запад'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Архангельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Архангельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Вологдаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Вологдаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Вологодский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Вологодский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Карельский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Карельский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Колэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Колэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Мурманский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Мурманский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Новгородский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Новгородский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Псковский филиал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Псковский филиал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Северо-Запад'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/филиал в республике Коми'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/филиал в республике Коми'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Сибирь(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Алтайэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Алтайэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Бурятэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Бурятэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Красноярскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Красноярскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Кузбасэнерго-РЭС'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Кузбасэнерго-РЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Омскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Омскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Хакасэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Хакасэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Сибирь (ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Читаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Читаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Томск'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Томск'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Томск'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Томская распределительная компания'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Томская распределительная компания'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))
}

static def Testing2() {
    def oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Тюмень'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Тюмень'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Тюмень'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Тюмень'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Урал(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/АО ЕЭСК'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/АО ЕЭСК'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Пермэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Пермэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Свердловэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Свердловэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Урал(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Челябэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Челябэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Магистральные сети'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети ФСК ЕЭС'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Центр и Приволжье(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Владимирэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Владимирэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ивэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ивэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Калугаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Калугаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Кировэенрго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Кировэенрго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Мариэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Мариэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Нижновэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Нижновэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Рязаньэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Рязаньэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Тулэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Тулэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр и Приволжье(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Удмуртэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Удмуртэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Центр'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Белгородэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Белгородэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Брянскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Брянскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Воронежэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Воронежэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Костромаэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Костромаэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Курскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Курскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Липецкэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Липецкэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Орелэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Орелэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Смоленскэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Смоленскэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Тамбовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Тамбовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Тверьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Тверьэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Центр'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ярэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ярэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Юг(ГК)'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/АО ВМЭС'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/АО ВМЭС'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Астраханьэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Астраханьэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Волгоградэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Волгоградэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Калмэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Калмэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Юг(ГК)'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ростовэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ростовэнерго'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать Россети Янтарь'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    oneAndScan = FirstStepAndScanErrors()

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Россети Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Россети Янтарь'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Янтарь'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Янтарь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    def scan = ScanErrors()
}

static def FirstStepAndScanErrors() {
    def scan = ScanErrors()

    def one = FirstStep()
}

static def FirstStep() {
    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/РаспредКомплекс'))
}

static def SelectDate() {
    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Объем потерь сверка/2025 год'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/2025 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/1 квартал'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/1 квартал'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь сверка/Январь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь сверка/Февраль'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Применить в фильтре Дата'))
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

    String dZO = WebUI.getText(findTestObject('Объем потерь (Данные в виджетах)/фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

    println(year)

    String dashboardName = 'Объем потерь'

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

static def ActualDate() {
    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('MM')

    String dateMouth = format1.format(d)

    println(dateMouth)

    if (dateMouth == '10') {
        SimpleDateFormat formatter = new SimpleDateFormat('YYYY-MM-dd')

        Date date1 = new Date()

        Date date2 = new Date(-1900 + 2023, 10 - 1, 28)

        println(date1)

        println(date2)

        String formatted1 = formatter.format(date1)

        String formatted2 = formatter.format(date2)

        if (date1.equals(date2)) {
            println('Обе даты равны')

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else if (date1.after(date2)) {
            println(String.format((formatted1 + ' идет после ') + formatted2))

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else {
            println(String.format((formatted1 + ' приходит раньше ') + formatted2))

            println('значит не менять месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        }
    } else if (dateMouth == '11') {
        SimpleDateFormat formatter = new SimpleDateFormat('YYYY-MM-dd')

        Date date1 = new Date()

        Date date2 = new Date(-1900 + 2023, 11 - 1, 28)

        println(date1)

        println(date2)

        String formatted1 = formatter.format(date1)

        String formatted2 = formatter.format(date2)

        if (date1.equals(date2)) {
            println('Обе даты равны')

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/4 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else if (date1.after(date2)) {
            println(String.format((formatted1 + ' идет после ') + formatted2))

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/4 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else {
            println(String.format((formatted1 + ' приходит раньше ') + formatted2))

            println('значит не менять месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        }
    } else if (dateMouth == '12') {
        SimpleDateFormat formatter = new SimpleDateFormat('YYYY-MM-dd')

        Date date1 = new Date()

        Date date2 = new Date(-1900 + 2023, 12 - 1, 28)

        println(date1)

        println(date2)

        String formatted1 = formatter.format(date1)

        String formatted2 = formatter.format(date2)

        if (date1.equals(date2)) {
            println('Обе даты равны')

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ноябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ноябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else if (date1.after(date2)) {
            println(String.format((formatted1 + ' идет после ') + formatted2))

            println('значит добавить месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Ноябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Ноябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        } else {
            println(String.format((formatted1 + ' приходит раньше ') + formatted2))

            println('значит не менять месяц')

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/i_close'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/выбрать 3 квартал 2024'))

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Июль'))

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Сентябрь'), FailureHandling.CONTINUE_ON_FAILURE)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Октябрь'), 30)

            WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

            WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
        }
    }
}

