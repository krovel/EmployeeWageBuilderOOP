package com.capgemini;

public class EmployeeWageBuilderOOP {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	private final String company;
	private final int emp_rate_per_hour,num_of_working_days,max_hrs_in_month;
	private int totalEmpWage;
	public EmployeeWageBuilderOOP(String company,int emp_rate_per_hour,int num_of_working_days,int max_hrs_in_month) {
		// TODO Auto-generated method stub
		this.company = company;
		this.emp_rate_per_hour = emp_rate_per_hour;
		this.num_of_working_days = num_of_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
		
	}	
	public void computeEmpWage() {
		int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;
		while(totalEmpHrs <= max_hrs_in_month && totalWorkingDays < num_of_working_days) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch(empCheck) {
			case is_part_time:{
				empHrs = 4;
				break;
			}
			case is_full_time:{
				empHrs = 8;
				break;
			}
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
			
		}
		totalEmpWage = totalEmpHrs*emp_rate_per_hour;
		//System.out.println("Total Emp Wage for company: "+company+" is: "+totalEmpWage);
	}
	@Override
	public String toString() {
		return "Total Emp wage for Company: "+company+" is: "+totalEmpWage;
	}
	public static void main(String[] args) {
		EmployeeWageBuilderOOP dMart = new EmployeeWageBuilderOOP("DMart",20,2,10);
		dMart.computeEmpWage();
		System.out.println(dMart);
		EmployeeWageBuilderOOP reliance = new EmployeeWageBuilderOOP("Reliance",10,4,20);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}