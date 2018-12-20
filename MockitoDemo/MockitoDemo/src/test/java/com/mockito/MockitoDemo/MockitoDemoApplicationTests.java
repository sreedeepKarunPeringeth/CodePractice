package com.mockito.MockitoDemo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockito.MockitoDemo.Interface.DataService;

@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest
public class MockitoDemoApplicationTests {

	@Mock
	DataService dataService;
	
	@InjectMocks
	BusinessImpl businessImpl;
	
	@Test
	public void testGetGreatestNumber_withNull() {
		Mockito.when(dataService.retriveAllData()).thenReturn(new int[]{});
		assertEquals(Integer.MIN_VALUE,businessImpl.getGreatestNumber());
	}

	@Test
	public void testGetGreatestNumber_withMultipleValues() {
		Mockito.when(dataService.retriveAllData()).thenReturn(new int[]{78,12,5,97});
		assertEquals(97,businessImpl.getGreatestNumber());
	}
	
	@Test
	public void testGetGreatestNumber_MultiTimes() {
		Mockito.when(dataService.retriveAllData()).thenReturn(new int[]{78,12,5,97});
		assertEquals(97,businessImpl.getGreatestNumber());
	}
	
	
	@Test
	public void testListGetWithMultipleReturns(){
		List listMock  = Mockito.mock(List.class);
		Mockito.when(listMock.get(Mockito.anyInt())).thenReturn(5).thenReturn(10);
		assertEquals(5,listMock.get(10));
		assertEquals(10,listMock.get(100));
	}
}

