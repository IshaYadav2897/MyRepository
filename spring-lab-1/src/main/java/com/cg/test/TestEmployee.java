package com.cg.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.entity.Employee;
import com.cg.entity.SBU;

public class TestEmployee {

	@Test
	public void testBean() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println("Employee Details");
		System.out.println("--------------------------------------");
		System.out.println("Employee ID: " + e.getEmployeeId());
		System.out.println("Employee Name: " + e.getEmployeeName());
		System.out.println("Employee Salary: " + e.getSalary());
		//System.out.println("Employee BU: " + e.getBusinessUnit());
		System.out.println("Employee Age: " + e.getAge());
	}
	
	@Test
	public void testBeanSbu() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		Employee e = (Employee) ctx.getBean("employee");
		SBU bu = (SBU) ctx.getBean("sbu");
		e.setBusinessUnit(bu);
		System.out.println(e.toString());
	}
}
