package com.phealy1982.util.test;

import java.util.Date;
import org.junit.Test;
import com.phealy1982.util.DateUtils;

import static org.junit.Assert.*;


public class TestDateUtils {
	
	@Test
	public void testThatDate(){
		
		DateUtils dateUtils = new DateUtils();
		
		Date actualDate = dateUtils.giveMeTodaysDate();
		Date expectedDate = new Date();
		
		assertTrue(actualDate.equals(expectedDate));
	}

}