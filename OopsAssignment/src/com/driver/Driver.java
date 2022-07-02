package com.driver;

import com.deparments.AdminDepartment;
import com.deparments.HrDepartment;
import com.deparments.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//Object create for Admin department
		AdminDepartment adminDepartment = new AdminDepartment();
		
		adminDepartment.display();

		System.out.println();
		
		//Object create for Hr department
		HrDepartment hrDepartment = new HrDepartment();	
		
		hrDepartment.display();
		
		System.out.println();
		
		//Object create for tech department
		TechDepartment techDepartment = new TechDepartment();
		techDepartment.display();
	
		
		
		
		
		
	}

}


