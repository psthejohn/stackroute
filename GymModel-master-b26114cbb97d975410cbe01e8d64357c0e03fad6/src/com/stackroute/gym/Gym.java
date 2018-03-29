package com.stackroute.gym;

import java.math.BigDecimal;
import java.util.List;

import com.stackroute.gyminterface.IGym;

public class Gym implements IGym{

private String gymId;
private String gymLocation;
private BigDecimal fees;
private List<String> programs;
private String localGymManager;
private List<String> equipments;
private List<Object> memberDetails;

public List<Object> getMemberDetails() {
	return memberDetails;
}
public void setMemberDetails(List<Object> memberDetails) {
	this.memberDetails = memberDetails;
}
public List<String> getEquipments() {
	return equipments;
}
public void setEquipments(List<String> equipments) {
	this.equipments = equipments;
}
public String getLocalGymManager() {
	return localGymManager;
}
public void setLocalGymManager(String localGymManager) {
	this.localGymManager = localGymManager;
}
public String getGymId() {
	return gymId;
}
public void setGymId(String gymId) {
	this.gymId = gymId;
}
public String getGymLocation() {
	return gymLocation;
}
public void setGymLocation(String gymLocation) {
	this.gymLocation = gymLocation;
}
public BigDecimal getFees() {
	return fees;
}
public void setFees(BigDecimal fees) {
	this.fees = fees;
}
public List<String> getPrograms() {
	return programs;
}
public void setPrograms(List<String> programs) {
	this.programs = programs;
}


}
