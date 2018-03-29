package com.stackroute.functions;

import com.stackroute.gymabstract.ExerciseCategories;

public class FemaleExercises extends ExerciseCategories {

	
	public String assignExercise(String bodyType) {
		
		if(bodyType.equalsIgnoreCase(" You are Underweight"))	 
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
