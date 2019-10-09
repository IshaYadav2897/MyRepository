package com.cg.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private String employeeId;
	private String employeeName;
	private double salary;
	//private String businessUnit;
	private int age;
	private SBU businessUnit;
	
	public Employee() {
	}

	public Employee(String employeeId, String employeeName, double salary, int age, SBU sbu) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		//this.businessUnit = businessUnit;
		this.age = age;
		this.businessUnit = sbu;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	@Value("1")
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Value("Isha")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Value("60000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
//	public String getBusinessUnit() {
//		return businessUnit;
//	}
//	
//	@Value("Europe")
//	public void setBusinessUnit(String businessUnit) {
//		this.businessUnit = businessUnit;
//	}
	
	@Value("PES-BU")
	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	@Value("22")
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + ", sbu=" + businessUnit + "]";
	}
	
	
	
	
}
