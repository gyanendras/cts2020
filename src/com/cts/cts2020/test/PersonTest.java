package com.cts.cts2020.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cts.cts2020.Aadhaar;
import com.cts.cts2020.Person;

public class PersonTest {
	
    @Test
	void testPersonName(){
	Person p = new Person("Mohit","Keswani");
	assertEquals("Mohit"+" "+"Keswani",p.getName());
	}
    
    @Test
    void testPersonAAdhaar() {
    	Person p = new Person("Mahesh","Arora");
    	Aadhaar a = new Aadhaar();
    	a.setAadhaarNum(23l);
    	assertEquals(23,a.getAadhaarNum().longValue());
    	
    }

}
