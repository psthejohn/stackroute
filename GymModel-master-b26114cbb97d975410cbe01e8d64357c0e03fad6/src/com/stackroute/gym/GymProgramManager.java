package com.stackroute.gym;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.gymabstract.AbsGymProgramManager;
import com.stackroute.gyminterface.IGym;

public class GymProgramManager extends AbsGymProgramManager {

IGym myGym = new Gym();
private List<String> programs;
List<String>gymPrograms = new ArrayList<String>();

public GymProgramManager (List<String> programs)
{
this.programs = programs;	
}
@Override
public void addPrograms()
{
for(String s : programs)
{
	gymPrograms.add(s);
	}
myGym.setPrograms(gymPrograms);
}

@Override
public void deletePrograms() {
	
	}

@Override
public void viewAllPrograms() {
	
	}

}
