package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class timesheet {

	@Test
	void testbiggNumber() {
		int []list = new int []{1,2,23,34,3};	
		NumberService numberService= new NumberService();
		int biggest = numberService.biggestNumber(list);
		assertEquals(34,biggest);
		
		int []list2= new int [] {1,5,9};
		int biggest2 =numberService.biggestNumber(list2); 
		assertEquals(9, biggest2);
		
		
	}

}
