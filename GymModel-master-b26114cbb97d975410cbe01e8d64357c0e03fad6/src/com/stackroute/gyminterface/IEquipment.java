package com.stackroute.gyminterface;

import java.math.BigDecimal;

public interface IEquipment {

public void setEquipmentId(String id);
public String getEquipmentId();
public void setEquipmentName(String name);
public String getEquipmentName();
public void setEquipmentPrice(BigDecimal price);
public BigDecimal getEquipmentPrice();
public void setEquipmentAge(int age);
public int getEquipmentAge();
public void setEquipmentType(String type);
public String getEquipmentType();

}
