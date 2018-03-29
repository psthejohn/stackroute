package com.stackroute.functions;

import com.stackroute.gymabstract.WeightCategory;

public class MaleWeightCategory extends WeightCategory {

	
	public String weightCategory(double i) {
		
    if(i <= 55)
	{
		
	    return "You are Underweight";
	}
	else if(i >= 56 && i <= 85)
	{
		
		return "You are Medium Build";
	}
	else if(i>= 86)	
	{
	
		return "You are Overweight";
	}
	
	
return null;
	}

}
