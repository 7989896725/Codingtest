package com.zensar.bean;

import java.util.List;

public class Employee {
	int employeeId;
	String name;
	double basicSalary;

	Address address;

	List<Skill> skillList;
	BankAccount bankAccount;

	public Employee(int employeeId, String name, double basicSalary, Address address, List<Skill> skillList,
			BankAccount bankAccount) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.bankAccount = bankAccount;
	}

	public Employee(String name, double basicSalary, Address address, List<Skill> skillList, BankAccount bankAccount) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.bankAccount = bankAccount;
	}

	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}

	public Employee() {
		super();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + ", address="
				+ address + ", skillList=" + skillList + "]";
	}

}