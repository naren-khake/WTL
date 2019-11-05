package com.Q16;

public class Employee {
	String eId;
	String eName;
	float eSalary;
	String eDept;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eDept=" + eDept + "]";
	}
	

}
