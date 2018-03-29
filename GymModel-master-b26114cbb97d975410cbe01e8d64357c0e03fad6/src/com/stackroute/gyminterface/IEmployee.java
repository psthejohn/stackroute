package com.stackroute.gyminterface;

import java.math.BigDecimal;

public interface IEmployee {

public void setTrainerId(int id);
public int getTrainerId();
public void setTrainerName(String name);
public String getTrainerName();
public void setTrainerTrainingType(String type);
public String getTrainerTrainingType();
public void setTrainerSalary(BigDecimal salary);
public BigDecimal getTrainerSalary();

}
