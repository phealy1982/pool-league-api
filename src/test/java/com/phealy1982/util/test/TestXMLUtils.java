package com.phealy1982.util.test;

import static org.mockito.Mockito.*;
import static com.phealy1982.util.XMLUtils.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.phealy1982.util.XMLUtils;

@RunWith(PowerMockRunner.class)
@PrepareForTest(XMLUtils.class)
public class TestXMLUtils {
	
	@Test
	public void testThatXML(){
		
		PowerMockito.mockStatic(XMLUtils.class);
		when(XMLUtils.prepareTheXML()).thenReturn("mocked prepared xml");
		
		System.out.println(XMLUtils.prepareTheXML());
		
	}
	
	@Test
	public void testSomeOtherXML(){
		XMLUtils xmlu = new XMLUtils();
		XMLUtils.returnSomeXML();
		xmlu.doXML();
		
		System.out.println(prepareTheXML());
	}
	

}
