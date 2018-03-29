package com.stackroute.gym;

import java.io.IOException;
import java.util.ArrayList;

import com.stackroute.gyminterface.IGymMemberController;


public class GymMemberView {

	static IGymMemberController gymController = null;
	
	
	public static void main(String[] args) throws IOException {
	gymController = new MemberController();
	final boolean k = gymController.newMemberRegistration();	

	if(k)
	{
	System.out.println("Registration complete");
	String userName = gymController.generateUserName();
	String password = gymController.generatePassword();
	System.out.println("Your User Name is " + userName);
	System.out.println("Your Password is " + password);
	gymController.assignTrainer();
	gymController.decideWorkOutandExercises();

	final boolean l = gymController.customerLogin();
	System.out.println("All details for the customer");
	ArrayList<Object> details = gymController.displayAllDetails();
	for (Object s : details)
	{
		System.out.println(s);
	}
	}
	else
		System.out.println("resgistration failed try again");
	
	}

}
