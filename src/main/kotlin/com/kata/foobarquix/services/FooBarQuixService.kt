package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
    	var result: String = ""
    	
    	// divisors have high precedence
    	// number is divisible by 3
    	if (inputNumber%3 == 0){
    		result = result.plus("Foo")
    	}
    	
    	// number is divisible by 5
    	if (inputNumber%5 == 0){
    		result = result.plus("Bar")
    	}
    	
    	// the content is replaced in the order they appear
    	// 3 -> Foo
    	// 5 -> Bar
    	// 3 -> Qix
    	var endResult = inputNumber.toString()
    	var reg = Regex("[0-24689]")
		endResult = reg.replace(endResult, "")
    	reg = Regex("[3]")
    	endResult = reg.replace(endResult, "Foo")
    	reg = Regex("[5]")
    	endResult = reg.replace(endResult, "Bar")
    	reg = Regex("[7]")
    	endResult = reg.replace(endResult, "Qix")
		
		result = result.plus(endResult)
		
		// rules don't apply, initial number return
		if (result == ""){
        	return inputNumber.toString()
    	} else{
        	return result
    	}
    }
    
    fun convertNumberToInt(inputNumber: Int): String {
    	var result: String = ""
    	if ( inputNumber > 1 ) {
    		for(nombre in 1..inputNumber) {
    		 	result = result.plus(convertNumber(nombre)).plus(" \n ")
    		 }
    	}
    	return result
    }

}