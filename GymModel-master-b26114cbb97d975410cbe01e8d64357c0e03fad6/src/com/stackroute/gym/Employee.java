package com.stackroute.gym;

import java.math.BigDecimal;

import com.stackroute.gyminterface.IEmployee;

public class Employee implements IEmployee {

private String trainerName;
private BigDecimal trainerSalary;
private int trainerId;
private String trainerTrainingType;

public String getTrainerName() {
	return trainerName;
}
public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}
public BigDecimal getTrainerSalary() {
	return trainerSalary;
}
public void setTrainerSalary(BigDecimal trainerSalary) {
	this.trainerSalary = trainerSalary;
}
public int getTrainerId() {
	return trainerId;
}
public void setTrainerId(int trainerId) {
	this.trainerId = trainerId;
}
public String getTrainerTrainingType() {
	return trainerTrainingType;
}
public void setTrainerTrainingType(String trainerTrainingType) {
	this.trainerTrainingType = trainerTrainingType;
}



}
