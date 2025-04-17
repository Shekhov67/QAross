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
def start = OpenBrowser()

String obemPoter = findTestData('Test Data').getValue(2, 87)

println(obemPoter)

String percentPoter = findTestData('Test Data').getValue(3, 87)

println(percentPoter)

def raspred = Raspred()

def selectDate = SelectDate()

def write2 = WriteToExcel2(def err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

def scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'1'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 76)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 76)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Тываэнерго'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'2'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 81)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 81)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.click(findTestObject('Объем потерь сверка/выбрать АО Чеченэнерго'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'3\r\n'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 73)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 73)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Волга'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'4'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 82)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 82)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Кубань'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'5'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 84)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 84)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/выбрать Росссети Ленэнерго(ГК)'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Росссети Ленэнерго(ГК)'))

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'6'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 83)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 83)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Московский регион'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'7'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 80)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 80)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северный Кавказ(ГК)'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'8'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 74)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 74)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Северо-Запад'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Северо-Запад'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'9'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 75)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 75)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Сибирь(ГК)'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'10'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 77)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 77)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Томск'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'11'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 85)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 85)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Тюмень'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'12'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 78)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 78)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Центр'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Урал(ГК)'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'13'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 88)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 88)

println(percentPoter)

WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

WebUI.click(findTestObject('Объем потерь сверка/Магистральные сети'))

WebUI.click(findTestObject('Объем потерь сверка/Россети ФСК ЕЭС'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'14'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 71)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 71)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'15'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 72)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 72)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Центр и Приволжье(ГК)'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'16'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 79)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 79)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Юг(ГК)'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

'17'
start = OpenBrowser()

obemPoter = findTestData('Test Data').getValue(2, 86)

println(obemPoter)

percentPoter = findTestData('Test Data').getValue(3, 86)

println(percentPoter)

filterDzo = SelectDzo()

WebUI.scrollToElement(findTestObject('Объем потерь сверка/Россети Янтарь'), 30)

WebUI.scrollToElement(findTestObject('Общие/скролл до фильтра дата'), 30)

WebUI.click(findTestObject('Объем потерь сверка/выбрать Россети Янтарь'))

WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

selectDate = SelectDate()

write2 = WriteToExcel2(err = 'Сверка не прошла')

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Объем потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

println(pageDataString)

fileDataString = obemPoter

println(fileDataString)

check = Check(pageString = pageDataString, fileString = fileDataString, path)

path = 'Объем потерь сверка/Данные со страницы Объем потерь/Уровень потерь АО Тываэнерго'

pageDataString = WebUI.getText(findTestObject(path))

fileDataString = percentPoter

checkPercents = CheckPercents(pageString = pageDataString, fileString = fileDataString, path)

scanErr = ScannErrors(path)

WebUI.deleteAllCookies()

WebUI.closeBrowser()

static def OpenBrowser() {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 3))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Общие/button_'))

    WebUI.delay(10)
}

static def SelectDzo() {
    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/РаспредКомплекс'))
}

static def SelectDate() {
    WebUI.click(findTestObject('Общие/Фильтр Дата'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре Дата'))

    WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))

    WebUI.click(findTestObject('Общие/Фильтр Дата'))

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/2023 год'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/4 квартал 2023'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь сверка/Выбрать 1 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Объем потерь сверка/выбрать 2 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Общие в сеть/Объем потерь сверка/раскрыть 3 квартал 2023'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Общие в сеть/Объем потерь сверка/Июль'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/Август'), 30)

    WebUI.scrollToElement(findTestObject('Объем потерь (Данные в виджетах)/скролл'), 30)

    WebUI.click(findTestObject('Объем потерь (Данные в виджетах)/Август'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Общие/Применить в фильтре Дата'))
}

static def ScannErrors(def path) {
    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        def write = WriteToExcel2(def err = 'нет данных')
    } else if (WebUI.verifyTextNotPresent('Ошибка запроса данных', false) == false) {
        def write = WriteToExcel2(def err = 'Ошибка запроса данных')
    } else if (WebUI.verifyTextNotPresent('Произошла ошибка при выполнении пользовательского кода', false) == false) {
        def write = WriteToExcel2(def err = 'Произошла ошибка при выполнении пользовательского кода')
    } else if (WebUI.verifyTextNotPresent('У виджета нет данных', false) == false) {
        def write = WriteToExcel2(def err = 'У виджета нет данных')
    } else if (WebUI.verifyTextNotPresent('Некорректные фильтры', false) == false) {
        def write = WriteToExcel2(def err = 'Некорректные фильтры')
    }
}

static def Check(def pageString, def fileString, def path) {
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
    } else {
        def write = WriteToExcel(file, page, path, def typeDate = 'Объем потерь')
    }
}

static def CheckPercents(def pageString, def fileString, def path) {
    println(pageString)

    int i = pageString.length()

    println(i)

    if (i > 4) {
        String first = pageString.charAt(0)

        String second = pageString.charAt(1)

        String third = pageString.charAt(2)

        String fourth = pageString.charAt(3)

        String fifth = pageString.charAt(4)

        pageString = ((((first + second) + third) + fourth) + fifth)

        pageString = pageString.trim()

        println(pageString)
    } else {
        pageString = pageString.trim()

        println(pageString)
    }
    
    double page = pageString.toDouble()

    println(page)

    String ii = fileString

    double file = Double.parseDouble(ii.replace(',', '.'))

    println(file)

    if (WebUI.verifyEqual(page, file) == true) {
    } else {
        def write = WriteToExcel(file, page, path, def typeDate = 'Уровень потерь')
    }
}

static def WriteToExcel(def file, def page, def path, def typeDate) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dashboardName = 'Объем потерь'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    println(n)

    println(path)
	

    path = path.replaceAll('Объем потерь сверка/Данные со страницы Объем потерь/', '')

    String dZO = WebUI.getText(findTestObject('Общие/Фильтр ДЗО'))

    println(dZO)
	
	println(typeDate)

    Date d = new Date()

    SimpleDateFormat format1

    format1 = new SimpleDateFormat('dd.MM.yyyy')

    String date = format1.format(d)

    println(date)

    String year = WebUI.getText(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, file)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, page)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, year)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, date)
	
	ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, typeDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}

static def WriteToExcel2(def err) {
    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Общие/Фильтр ДЗО'))

    String year = WebUI.getText(findTestObject('Объем потерь (Данные в виджетах)/фильтр Дата'))

    println(year)

    String dashboardName = 'Объем потерь'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    if (WebUI.verifyTextNotPresent('нет данных', false) == false) {
        ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, year)

        ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, err)

        n = (n + 1)

        ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)

        WebUI.closeBrowser()
    }
}

static def Raspred() {
    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Общие/Снять выделения в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Общие/Фильтр ДЗО'))

    WebUI.click(findTestObject('Объем потерь сверка/ПАО Росссети'))

    WebUI.click(findTestObject('Объем потерь сверка/Выбрать РаспердКомплекс'))

    WebUI.click(findTestObject('Общие/Применить в фильтре ДЗО'))
}

