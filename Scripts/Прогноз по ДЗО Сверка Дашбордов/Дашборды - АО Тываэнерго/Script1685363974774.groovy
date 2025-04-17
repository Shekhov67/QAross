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

Date date = new Date()

String todaysDate = date.format('dd.MM.yyyy')

String widget

int run = 1

for (run = 1; run < 9; run++) {
    Test(run, todaysDate, widget)
}

def Test(def run, def todaysDate, def widget) {
    String kpo

    String togle

    String planFact

    String year = '2023 год'

    WebUI.openBrowser('')

    'БЛОК РУКОВОДИТЕЛЕЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 12))

    WebUI.setText(findTestObject('Общие/input__username'), findTestData('Test Data').getValue(5, 1))

    WebUI.setText(findTestObject('Общие/input__password'), findTestData('Test Data').getValue(6, 1))

    WebUI.click(findTestObject('Object Repository/КПО/button_'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Год'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать 2023год'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/Июнь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО/Июнь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО/снять выделенные в ФИЛЬТРЕ дзо'))

    WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО/фильтр ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО/ПАО Россети'))

    WebUI.click(findTestObject('Прогноз по ДЗО/ПАО Россети'))

    WebUI.click(findTestObject('Прогноз по ДЗО/РаспредКомплекс'))

    WebUI.click(findTestObject('Прогноз по ДЗО/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Прогноз по ДЗО/применить в фильтре ДЗО'))

    WebUI.delay(10)

    if (run == 1) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать ПЛАН'))

        kpo = 'Отпуск из сети'
    } else if (run == 2) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

        kpo = 'Отпуск из сети'
    } else if (run == 3) {
        WebUI.click(findTestObject('Прогноз по ДЗО/тогл абс'))

        kpo = 'Отпуск из сети'
    } else if (run == 4) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО/тогл абс'))

        kpo = 'Отпуск из сети'
    } else if (run == 5) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать ПЛАН'))

        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

        kpo = 'КПО'
    } else if (run == 6) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

        kpo = 'КПО'
    } else if (run == 7) {
        WebUI.click(findTestObject('Прогноз по ДЗО/тогл абс'))

        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

        kpo = 'КПО'
    } else if (run == 8) {
        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр Тип показателя откланений'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО/тогл абс'))

        WebUI.click(findTestObject('Прогноз по ДЗО/фильтр КПО(Отпуск из сети)'))

        WebUI.click(findTestObject('Прогноз по ДЗО/выбрать КПО'))

        kpo = 'КПО'
    }
    
    String a = WebUI.getText(findTestObject('Прогноз по ДЗО/Данные с виджета Динамика'))

    println(a)

    int i = a.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        a = a.substring(i, a.length())
		
		println(a)
		
	}
	
	i = a.indexOf('Ожидаемое')	
	
	if (i > -1) {
			
		a = a.substring(0, i)
		
		println(a)
			
	}
		
	a = a.replaceAll('[А-Я]', '')
		
	a = a.replaceAll('[а-я]', '')
	
	a = a.replaceAll('\\s', '')
	
			
	println(a)
	
    String a1 = WebUI.getText(findTestObject('Прогноз по ДЗО/Данные с виджета Выручка'))

	i = a1.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        a1 = a1.substring(i, a1.length())
		
		println(a1)
	
    }
		
	i = a1.indexOf('Ожидаемое')
		
	if (i > -1) {
			
		a1 = a1.substring(0, i)
		
		println(a1)
			
	}
		
	a1 = a1.replaceAll('[А-Я]', '')
		
	a1 = a1.replaceAll('[а-я]', '')
	
	a1 = a1.replaceAll('\\s', '')
    
    println(a1)

    String a2 = WebUI.getText(findTestObject('Прогноз по ДЗО/Данные с виджета Отклонения'))
	
    i = a2.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        a2 = a2.substring(i, a2.length())
		
		println(a2)
	
    }
		
	i = a2.indexOf('⬤ Отклонение')
		
	if (i > -1) {
		
		a2 = a2.substring(0, i)
		
		println(a2)
			
	}
		
	a2 = a2.replaceAll('[А-Я]', '')
		
	a2 = a2.replaceAll('[а-я]', '')
	
	a2 = a2.replaceAll('\\s', '')
    
    println(a2)

    String a3 = WebUI.getText(findTestObject('Прогноз по ДЗО/Данные с виджета Выручка Отклонения'))
	
    i = a3.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        a3 = a3.substring(i, a3.length())
		
		println(a3)
	
    }
		
	i = a3.indexOf('⬤ Отклонение')
		
	if (i > -1) {
		
		a3 = a3.substring(0, i)
		
		println(a3)
			
	}
		
	a3 = a3.replaceAll('[А-Я]', '')
		
	a3 = a3.replaceAll('[а-я]', '')
	
	a3 = a3.replaceAll('\\s', '')
    
    println(a3)

    'СТРЕСС СЦЕНАРИЙ'
    WebUI.navigateToUrl(findTestData('Test Data').getValue(7, 13))

    WebUI.delay(10)

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Год'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать 2023год'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Месяц'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО стресс сценарий/Июнь'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО стресс сценарий/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Июнь'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/снять выделения в фильре ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/применить в фильтре ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр ДЗО'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/ПАО Россети'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/ПАО Россети'))

    WebUI.click(findTestObject('Прогноз по ДЗО/РаспредКомплекс'))

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать АО Тываэнерго'), 30)

    WebUI.scrollToElement(findTestObject('Прогноз по ДЗО стресс сценарий/скролл'), 30)

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать АО Тываэнерго'))

    WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/применить в фильтре ДЗО'))

    if (run == 1) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать План'))

        togle = 'переключатель на %'

        planFact = 'План'

        kpo = 'Отпуск из сети'
    } else if (run == 2) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать Факт'))

        togle = 'переключатель на %'

        planFact = 'Факт'

        kpo = 'Отпуск из сети'
    } else if (run == 3) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/тогл абс'))

        togle = 'переключатель на абс.'

        planFact = 'План'

        kpo = 'Отпуск из сети'
    } else if (run == 4) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/тогл абс'))

        togle = 'переключатель на абс.'

        planFact = 'Факт'

        kpo = 'Отпуск из сети'
    } else if (run == 5) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать План'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр КПО Отпуск'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/КПО'))

        togle = 'переключатель на %'

        planFact = 'План'

        kpo = 'КПО'
    } else if (run == 6) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр КПО Отпуск'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/КПО'))

        togle = 'переключатель на %'

        planFact = 'Факт'

        kpo = 'КПО'
    } else if (run == 7) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/тогл абс'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр КПО Отпуск'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/КПО'))

        togle = 'переключатель на абс.'

        planFact = 'План'

        kpo = 'КПО'
    } else if (run == 8) {
        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Составляющая плана'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/выбрать Факт'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/тогл абс'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр КПО Отпуск'))

        WebUI.click(findTestObject('Прогноз по ДЗО стресс сценарий/КПО'))

        togle = 'переключатель на абс.'

        planFact = 'Факт'

        kpo = 'КПО'
    }
    
    String b = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/Данные с виджета Динамика'))

    println(b)

    i = b.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        b = b.substring(i, b.length())
		
		println(b)
		
    }
		
	i = b.indexOf('Ожидаемое')
		
	if (i > -1) {
			
		b = b.substring(0, i)
		
		println(b)
			
	}
		
	b = b.replaceAll('[А-Я]', '')
	
	b = b.replaceAll('[а-я]', '')

	b = b.replaceAll('\\s', '')
		
    println(b)
		
    String b1 = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/Данные с виджета Выручка'))

    println(b1)

	i = b1.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        b1 = b1.substring(i, b1.length())
		
		println(b1)
				
    }
	
	println(b1)
	
	i = b1.indexOf('Ожидаемое')
	
	if (i > -1) {
			
		b1 = b1.substring(0, i)
		
		println(b1)
			
	}
		
	b1 = b1.replaceAll('[А-Я]', '')
	
	b1 = b1.replaceAll('[а-я]', '')

	b1 = b1.replaceAll('\\s', '')
		  
    println(b1)

    String b2 = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/Данные с виджета Отклонения'))
	
	i = b2.indexOf('2023 год')

	if (i > -1) {
		
		i = i + 9
		
		b2 = b2.substring(i, b2.length())
		
		println(b2)
	
	}
		
	i = b2.indexOf('⬤ Отклонение')
		
	if (i > -1) {
		
		b2 = b2.substring(0, i)
		
		println(b2)
			
	}
		
	b2 = b2.replaceAll('[А-Я]', '')
	
	b2 = b2.replaceAll('[а-я]', '')

	b2 = b2.replaceAll('\\s', '')
	
	println(b2)

    String b3 = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/Данные с виджета Выручка Отклонения'))
	
    i = b3.indexOf('2023 год')

    if (i > -1) {
		
		i = i + 9
		
        b3 = b3.substring(i, b3.length())
		
		println(b3)
	
    }
		
	i = b3.indexOf('⬤ Отклонение')
		
	if (i > -1) {
		
		b3 = b3.substring(0, i)
		
		println(b3)
			
	}
		
	b3 = b3.replaceAll('[А-Я]', '')
	
	b3 = b3.replaceAll('[а-я]', '')

	b3 = b3.replaceAll('\\s', '')
    
    println(b3)

    Result(a, b, a1, b1, a2, b2, a3, b3, togle, planFact, kpo, year, todaysDate, widget)

    WebUI.closeBrowser()
}

static def Result(def a, def b, def a1, def b1, def a2, def b2, def a3, def b3, def togle, def planFact, def kpo, def year, def todaysDate, def widget) {
	
    if (WebUI.verifyEqual(a, b)){
		
        println('GOOD')
		
    } else {
		
		widget = 'Динамика электропотребления'
		
        WriteToExcel(togle, planFact, kpo, year, todaysDate, widget)
    }
	
	if (WebUI.verifyEqual(a1, b1)){
		
		println('GOOD')
		
	} else {
		
		widget = 'Выручка'
		
		WriteToExcel(togle, planFact, kpo, year, todaysDate, widget)
	}
	
	if (WebUI.verifyEqual(a2, b2)){
		
		println('GOOD')
		
	} else {
		
		widget = 'Отклонения'
		
		WriteToExcel(togle, planFact, kpo, year, todaysDate, widget)
	}
	
	if (WebUI.verifyEqual(a3, b3)){
		
		println('GOOD')
		
	} else {
		
		widget = 'Выручка Отклонения'
		
		WriteToExcel(togle, planFact, kpo, year, todaysDate, widget)
	}
}

static def WriteToExcel(def togle, def planFact, def kpo, def year, def todaysDate, def widget) {
    println(togle)

    println(planFact)

    println(kpo)

    println(year)

    String sheetName = 'List1'

    def data = findTestData('Test Data')

    int n = data.getRowNumbers() + 1

    String dZO = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/фильтр ДЗО'))

    String month = WebUI.getText(findTestObject('Прогноз по ДЗО стресс сценарий/Фильтр Месяц'))

    println(month)

    String dashboardName = 'Прогноз по ДЗО'

    String page = 'Данные не  совпадают'

    def workbook01 = ExcelKeywords.getWorkbook(GlobalVariable.excelFilePath)

    def sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 0, dashboardName)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 1, dZO)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 2, month)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 3, year)
	
	ExcelKeywords.setValueToCellByIndex(sheet01, n, 4, widget)
	
    ExcelKeywords.setValueToCellByIndex(sheet01, n, 5, planFact)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 6, kpo)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 7, togle)

    ExcelKeywords.setValueToCellByIndex(sheet01, n, 8, page)

	ExcelKeywords.setValueToCellByIndex(sheet01, n, 9, todaysDate)

    n = (n + 1)

    ExcelKeywords.saveWorkbook(GlobalVariable.excelFilePath, workbook01)
}
