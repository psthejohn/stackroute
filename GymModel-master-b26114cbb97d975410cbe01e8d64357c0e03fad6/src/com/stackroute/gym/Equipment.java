package com.stackroute.gym;

import java.math.BigDecimal;

import com.stackroute.gyminterface.IEquipment;

public class Equipment implements IEquipment{

private String equipmentId;
private String equipmentName;
private BigDecimal equipmentPrice;
private int equipmentAge;
private String equipmentType;




public Equipment(String equipmentId,String equipmentName,BigDecimal equipmentPrice,int equipmentAge,String equipmentType)
{
	this.equipmentId = equipmentId;
	this.equipmentName = equipmentName;
	this.equipmentPrice = equipmentPrice; 
	this.equipmentAge = equipmentAge;
    this.equipmentType = equipmentType;
}



public String getEquipmentId() {
	return equipmentId;
}
public void setEquipmentId(String equipmentId) {
	this.equipmentId = equipmentId;
}
public String getEquipmentName() {
	return equipmentName;
}
public void setEquipmentName(String equipmentName) {
	this.equipmentName = equipmentName;
}
public BigDecimal getEquipmentPrice() {
	return equipmentPrice;
}
public void setEquipmentPrice(BigDecimal equipmentPrice) {
	this.equipmentPrice = equipmentPrice;
}
public int getEquipmentAge() {
	return equipmentAge;
}
public void setEquipmentAge(int equipmentAge) {
	this.equipmentAge = equipmentAge;
}
public String getEquipmentType() {
	return equipmentType;
}
public void setEquipmentType(String equipmentType) {
	this.equipmentType = equipmentType;
}


}
