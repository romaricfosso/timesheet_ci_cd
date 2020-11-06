package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
class TimesheetApplicationTests {
	private static final Logger l = Logger.getLogger(TimesheetApplicationTests.class);
	 Employe employe = new Employe("RC", "FOSSO", "admon", "123", true, tn.esprit.spring.entities.Role.ADMINISTRATEUR);
	@Autowired
	IEmployeService employeService;

	@Test
	void contextLoads() {
	/*	String val ="romaric";
		TimesheetApplication tim= new TimesheetApplication ();
		FilterRegistrationBean log =tim.loginFilter();
	  assertEquals("/page/*", log);*/
		
		int employeNumberBeforTest = employeService.getNombreEmployeJPQL();
		l.info(" \n liste des employers  " + employeNumberBeforTest);
		employeService.addOrUpdateEmploye(this.employe);
		int employeNumberAfterTest = employeService.getNombreEmployeJPQL();
		l.info("\n nouvel liste des employer: " + employeNumberAfterTest);
		assertEquals(employeNumberBeforTest, employeNumberAfterTest - 1);

	}

}
