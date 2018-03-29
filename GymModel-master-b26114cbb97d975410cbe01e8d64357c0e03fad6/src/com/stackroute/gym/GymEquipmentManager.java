package com.stackroute.gym;

import java.math.BigDecimal;
import java.util.List;

import com.stackroute.gymabstract.AbsGymEquipmentManager;
import com.stackroute.gyminterface.IGym;

public class GymEquipmentManager extends AbsGymEquipmentManager {

   	IGym myGym = new Gym();
   	
	@Override
	public void addEquipment() {}
	@Override
	public void editEquipmentDetails() {}

	@Override
	public void deleteEquipment() {}

	@Override
	public void viewEquipment() {}

	@Override
	public void viewAllEquipment() {}

}
