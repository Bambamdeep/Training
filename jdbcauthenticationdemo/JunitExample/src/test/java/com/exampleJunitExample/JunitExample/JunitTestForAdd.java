package com.exampleJunitExample.JunitExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
class JunitTestForAdd {
Mathmematics math;
@BeforeAll
public static void setup() {
	System.out.println("BeforeAll");
}
//	
	@AfterAll
	public static void setup1() {
	  System.out.println("After All");
	}
	@BeforeEach
	public void mathObject() {
		Mathmematics math = new Mathmematics();
		System.out.println("BeforeEach");
	}
	@AfterEach
	public void mathObjectNull() {
		Mathmematics math = new Mathmematics();
		math = null;
		System.out.println("AfterEach");
	}
	
	@Test
	public void whenBothArePositive(){
		Mathmematics math = new Mathmematics();
		 assertEquals(10,math.add(5,5));
	}

	@Test
	public void whenBothAreNegative(){
		Mathmematics math = new Mathmematics();
		 assertEquals(-10,math.add(-5,-5));
	}
	@Test
	public void whenOneArePositiveAndOneNegative(){
		Mathmematics math = new Mathmematics();
		 assertEquals(0,math.add(-5,5));
	}
	@Test
	@Tag("smoke")
	public void divide(){
		Mathmematics math = new Mathmematics();
		 assertThrows (ArithmeticException.class,()-> math.divide(5,0));
	}
	@Test
	@Tag("Sanity")
	public void divide1(){
		Mathmematics math = new Mathmematics();
		assertEquals(2, math.divide(10, 5));
	}


}
