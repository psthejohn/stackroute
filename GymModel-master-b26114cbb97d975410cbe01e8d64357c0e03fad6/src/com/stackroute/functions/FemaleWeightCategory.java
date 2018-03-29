package com.stackroute.functions;

import com.stackroute.gymabstract.WeightCategory;

public class FemaleWeightCategory extends WeightCategory{

	
	public String weightCategory(double i) {
		
		if(i <= 40)
		{
		return"You are Underweight";
		}
		else if(i >= 41 && i <= 60)
		{
		return"You are Medium Built";
		}
		else if(i>= 61)	
		{
		return"You are Overweight";
		}
		
		return null;

		
		
		
		
	}

}
