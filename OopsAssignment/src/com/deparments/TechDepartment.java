package com.deparments;

public class TechDepartment extends SuperDepartment{


	public String departmentName() {
		// TODO Auto-generated method stub
		return "Welcome to Tech Department";
	}

	
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete coding of module 1";
	}

	
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		// TODO Auto-generated method stub
		return "core Java";
	}
	
	
	public void display() {
		
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
	}
	

}
