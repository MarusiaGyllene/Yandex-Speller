def my_list = ["велоспед", "велоспед123", "www.имя@обьясняем.рф", "Поеду к к окиану", "мОСКВА", "texst of valeus"]
def my_resp = ["велосипед", "велосипед 123", "объясняем", "океану", "Москва", "test"]
count = my_list.size()
count_r = my_resp.size()

if (count == count_r ) {
	while (count>0) {
		count = count - 1
		testRunner.testCase.testSteps["SP"].setPropertyValue("value", my_list[count])	
		testRunner.testCase.testSteps["SP"].setPropertyValue("resp", my_resp[count])	
		testRunner.testCase.testSteps['SP_Request'].run(testRunner,context)
	}
} else {
	log.info ("Списки не равны")
}	
