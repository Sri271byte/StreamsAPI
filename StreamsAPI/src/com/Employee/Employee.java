package com.Employee;


public class Employee {
	
	private Integer Id;
	private String Name;
	private String deptName;
	private String Status;
	private Integer Salary;
	
	
	public Employee(Integer id, String name, String deptName, String status, Integer salary) {
		super();
		Id = id;
		Name = name;
		this.deptName = deptName;
		Status = status;
		Salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", deptName=" + deptName + ", Status=" + Status + ", Salary="
				+ Salary + "]";
	}


	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	
	
	
	

	
	

}
