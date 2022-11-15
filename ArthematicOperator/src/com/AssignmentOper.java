package com;

public class AssignmentOper {
	static String Id = "admin";
	static int Password=2345;
	public static void main(String[] args) {
		if(Id == "admin") 
		{
			System.out.println("entering the statement");
			if(Password == 234)
			{
				System.out.println("login is succesfull");
			}
			else
			{
				System.out.println("login is unsuccesfull");
			}
		}
		else {
			System.out.println("Id is invalid");
		}
	}
}
