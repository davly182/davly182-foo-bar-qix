package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.*
import org.junit.jupiter.api.function.Executable
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixApplicationTests {
	private val fooBarQuixService= FooBarQuixService()
	
	@Test
	fun contextLoads() {
	}

	@Test 
	fun testDivisibleBy3StartsWithFoo() {
		for(nombreATester in 1..127) { 
       		if( nombreATester%3 == 0 ) { 
        		//Assertions.assertTrue( (fooBarQuixService.convertNumber(nombreATester)).startsWith("Foo", false)))
       		} 
   		} 
	}
	
	@Test 
	fun testDivisibleBy5Not3StartsWithBar() {
		for(nombreATester in 1..127) { 
       		if( !(nombreATester%3 == 0) and (nombreATester%5 == 0) ) { 
        		//Assertions.assertTrue( (fooBarQuixService.convertNumber(nombreATester)).startsWith("Bar", false)))
       		} 
   		} 
	}
	
	@Test 
	fun testDivisibleBy3And5StartsWithFooBar() {
		for(nombreATester in 1..127) { 
       		if( (nombreATester%3 == 0) and (nombreATester%5 == 0) ) { 
        		//Assertions.assertTrue( (fooBarQuixService.convertNumber(nombreATester)).startsWith("FooBar", false)))
       		} 
   		} 
	}
	
	@Test 
	fun testContainsByOrder3Foo5Bar7QixEndsWith() {
		var endResult:String
    	val reg = Regex("[0-24689]")
    	val reg3 = Regex("[3]")
    	val reg5 = Regex("[5]")
    	val reg7 = Regex("[7]")
		for(nombreATester in 1..127) { 
			
			endResult = nombreATester.toString()
			endResult = reg.replace(endResult, "")
    		endResult = reg3.replace(endResult, "Foo")
    		endResult = reg5.replace(endResult, "Bar")
    		endResult = reg7.replace(endResult, "Qix")
    		
			//Assertions.assertTrue( (fooBarQuixService.convertNumber(nombreATester)).endsWith(endResult, false)))
   		} 
	}
	
}
