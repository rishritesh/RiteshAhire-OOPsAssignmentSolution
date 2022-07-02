package com.deparments;

public class AdminDepartment extends SuperDepartment {


	public String departmentName() {
		// TODO Auto-generated method stub
		return "Welcome to Admin Department";
	}

	
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete Your documents Submission ";
	}

	
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}
	
	
	//display function
	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}

}
