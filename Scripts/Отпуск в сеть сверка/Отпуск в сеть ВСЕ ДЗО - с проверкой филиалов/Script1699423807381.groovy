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

'0'
def openBrwsr = OpenBrowser()

boolean check

String page

String path = ''

String file = ''

String typeData

String otpuskVSeti = findTestData('Test Data').getValue(4, 87)

println(otpuskVSeti)

raspred = Raspred()

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

def selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

if (WebUI.getText(findTestObject(path)) == null) {
    println('Нет данных')

    WebUI.closeBrowser()
} else {
    pageDataString = WebUI.getText(findTestObject(path))

    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'1'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 76)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Тываэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

scanErr = ScanErrors(file, page, path)

if (WebUI.getText(findTestObject(path)) == null) {
    println('Нет данных')

    WebUI.closeBrowser()
} else {
    pageDataString = WebUI.getText(findTestObject(path))

    println(pageDataString)

    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'2'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 81)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать АО Чеченэнерго'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'3'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 73)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Волга'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Волга'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

WebUI.closeBrowser()

'4'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 82)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть Россети Кубань'), 
    30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Кубань'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)
}

'5'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 84)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть Россети Ленэнерго(ГК)'), 
    30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Росссети Ленэнерго(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'6'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 83)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть Россети Московский регион'), 
    30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Московский регион'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Москвоский регион'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'7'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 80)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть Россети Северо-Запад'), 
    30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северный Кавказ(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Северный Кавказ(ГК)'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

WebUI.closeBrowser()

'8'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 74)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Северо-Запад'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Северо-Запад'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'9'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 75)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Сибирь(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть сверка/применить в фльтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Сибирь(ГК)'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'10'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 77)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Томск'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'11'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 85)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Тюмень'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'12'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 78)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Урал(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Урал(ГК)'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'13'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 88)

println(otpuskVSeti)

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

WebUI.click(findTestObject('Отпуск в сеть сверка/Магистральные сети'))

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети ФСК ЕЭС'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

'14'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 71)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Центр'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'15'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 72)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Центр и Приволжье(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Центр и Приволжье(ГК)'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'16'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 79)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Юг(ГК)'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/Применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    if (check == false) {
        println('Start filial')

        WebUI.callTestCase(findTestCase('Отпуск в сеть сверка/Сверка по филиалам/Отпуск в сеть Филиалы Россети Юг(ГК)'), 
            [:], FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        println('End case DZO')

        scanErr = ScanErrors(file, page, path)

        WebUI.deleteAllCookies()

        WebUI.closeBrowser()
    }
}

'17'
openBrwsr = OpenBrowser()

otpuskVSeti = findTestData('Test Data').getValue(4, 86)

println(otpuskVSeti)

selectDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Отпуск в сеть сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие в сеть/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать Россети Янтарь'))

WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

selectDate = SelectDate(file, page, path)

path = 'Отпуск в сеть сверка/Данные со страницы Отпуск в сеть/Отпуск в сеть АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

if (pageDataString == null) {
    WebUI.closeBrowser()
} else {
    fileDataString = otpuskVSeti

    println(fileDataString)

    check = Check(typeData, pageString = pageDataString, fileString = fileDataString, path)

    scanErr = ScanErrors(file, page, path)

    WebUI.closeBrowser()
}

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

        WebUI.delay(10)

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

static def SelectDate(def file, def page, def path) {
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

    WebUI.scrollToElement(findTestObject('Отпуск в сеть(виджеты)/скрол'), 30)

    def scanErr = ScanErrors(file, page, path)
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

static def Check(def typeData, def pageString, def fileString, def path) {
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
        return true
    } else {
        def write = WriteToExcel(file, page, typeData = 'Отпуск в сеть', path)

        return false
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

    String year = '2025'

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

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, planFact)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, itogBalanc)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, err)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def Raspred() {
    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть(виджеты)/фильтр ДЗО'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Отпуск в сеть сверка/выбрать РаспредКомплекс'))
}

