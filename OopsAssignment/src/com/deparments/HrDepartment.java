package com.deparments;

public class HrDepartment extends SuperDepartment {


	public String departmentName() {
		// TODO Auto-generated method stub
		return "Welcome HR Department";
	}


	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

	public String doActivity () {
		// TODO Auto-generated method stub
		return "team Lunch";
	}
	
	
	public void display() {
		
		System.out.println(departmentName());
		System.out.println(doActivity());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
	}
	
	

}
