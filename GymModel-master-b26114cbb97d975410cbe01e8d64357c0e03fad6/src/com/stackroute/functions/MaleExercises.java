package com.stackroute.functions;

import com.stackroute.gym.Member;
import com.stackroute.gymabstract.ExerciseCategories;
import com.stackroute.gyminterface.IMember;

public class MaleExercises extends ExerciseCategories {

	IMember memberEntity = new Member();
	
	@Override
	public String assignExercise(String bodyType) {
	

	if(bodyType.equalsIgnoreCase("You are Underweight"))	 
			{
		return"You have been assigned the Weight gain/Fat gain plan";
			}
	else if(bodyType.equalsIgnoreCase("You are Medium Build")) 
		{
		return"You have been assigned the Lean bulking up plan";
		}
	
	else if(bodyType.equalsIgnoreCase("You are Overweight")) 
	{
		return"You have been assigned the Shredding/Weight loss plan";
	}
	else return null;
	 
	
	
	 
	
	
	
	}

}
