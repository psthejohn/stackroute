package com.stackroute.gym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.stackroute.functions.FemaleExercises;
import com.stackroute.functions.FemaleWeightCategory;
import com.stackroute.functions.MaleExercises;
import com.stackroute.functions.MaleWeightCategory;
import com.stackroute.gymabstract.ExerciseCategories;
import com.stackroute.gymabstract.WeightCategory;
import com.stackroute.gyminterface.IGym;
import com.stackroute.gyminterface.IGymMemberController;
import com.stackroute.gyminterface.IMember;

public class MemberController implements IGymMemberController {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
IMember memberEntity = new Member();
List<Object> memberDetails = new ArrayList<Object>();
IGym myGym = new Gym();
public boolean newMemberRegistration() {
	
	try {
	System.out.println("Enter your Name");
	String name = br.readLine();
    System.out.println("Enter your Weight");
	try {
	double weight = Double.parseDouble(br.readLine());
	}
	catch(Exception e)
	{
		System.out.println("Error");
		return false;
	}
	System.out.println("Enter your Age");
	try {
		int age = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Error");
			return false;
		}
	 System.out.println("Enter your Gender Male/Female");
 	 String gender = (br.readLine());
     if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) 
     {
    	 
    }
     else
    	 return false;
	 
     System.out.println("Enter your Aadhar number");
	try {
     long aadharCard = Long.parseLong(br.readLine());
	}
	catch (Exception e)
	{
		System.out.println("Error");
		return false;
	}
	
	return true;
	}
catch (Exception e)
	{
	return false;
	}

}
public boolean assignTrainer()
{
	if(memberEntity.getGender().equalsIgnoreCase("Male"))
	{
		memberEntity.setTrainer("You have been assigned a male trainer : Pushpinder");
		
	    return true;
	}
	else if (memberEntity.getGender().equalsIgnoreCase("Female"))
	{
		memberEntity.setTrainer("You have been assigned a male trainer : Praveen");
		
	    return true;
		
	}
	return false;
}

public String generateUserName()
{
   String userName = memberEntity.getUserName();
	
	return userName;	
}
public String generatePassword()
{
String password = memberEntity.getPassword();
return password;
}



public String decideWorkOutandExercises()
{
	WeightCategory maleWorkOut = new MaleWeightCategory();
    WeightCategory femaleWorkOut = new FemaleWeightCategory();
    ExerciseCategories maleExcercises = new MaleExercises();
    ExerciseCategories femaleExcercises = new FemaleExercises();
   
    
    if(memberEntity.getGender().equalsIgnoreCase("Male"))
    {
    	final double weight = memberEntity.getWeight();
    	String bodyType = maleWorkOut.weightCategory(weight);
    	memberEntity.setBodyType(bodyType);
    	String exercise = maleExcercises.assignExercise(bodyType);
    	memberEntity.setExerciseType(exercise);
    	
    }
    
    else if(memberEntity.getGender().equalsIgnoreCase("Female"))
    
    	{
    	final double weight = memberEntity.getWeight();
    	String bodyType = femaleWorkOut.weightCategory(weight);
    	memberEntity.setBodyType(bodyType);
    	String exercise = femaleExcercises.assignExercise(bodyType);
    	memberEntity.setExerciseType(exercise);
    	}
	

	return null;
	}

public ArrayList<Object> displayAllDetails(){
	
	ArrayList<Object> details = new ArrayList<Object>();
    StringBuilder sb = new StringBuilder(" Name is : ");
    StringBuilder sb1 = new StringBuilder(" Weight is : ");
    StringBuilder sb2 = new StringBuilder(" Age is : ");
    StringBuilder sb3 = new StringBuilder(" Gender is : ");
    StringBuilder sb4 = new StringBuilder(" Aadhar number is : ");
    details.add(sb.append(memberEntity.getName()));
	details.add(sb1.append(memberEntity.getWeight()));
	details.add(sb2.append(memberEntity.getAge()));
	details.add(sb3.append(memberEntity.getGender()));
	details.add(sb4.append(memberEntity.getAadharCard()));
	details.add(memberEntity.getBodyType());
	details.add(memberEntity.getAssignedExerciseType());
	details.add(memberEntity.getAssignedTrainer());
	
return details;	
}

public void setDetails()
{
memberDetails.add(memberEntity.getName());
memberDetails.add(memberEntity.getWeight());
memberDetails.add(memberEntity.getAge());
memberDetails.add(memberEntity.getGender());
memberDetails.add(memberEntity.getAadharCard());
memberDetails.add(memberEntity.getBodyType());
memberDetails.add(memberEntity.getAssignedExerciseType());
memberDetails.add(memberEntity.getAssignedTrainer());
memberDetails.add(memberEntity.getUserName());
myGym.setMemberDetails(memberDetails);
}

@Override
public boolean customerLogin() throws IOException {
	System.out.println("Welcome");
	System.out.println("Enter your User Name");
	String userName = br.readLine();
	System.out.println("Enter your Password");
	String password = br.readLine();
	
	
	return false;
	

}


}
