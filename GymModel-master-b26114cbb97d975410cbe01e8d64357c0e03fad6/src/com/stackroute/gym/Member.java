package com.stackroute.gym;

import java.util.Random;

import com.stackroute.gyminterface.IMember;

public class Member implements IMember{

private String name;
private double weight;
private int age;
private String gender;
private long aadharCard;
private String bodyType;
private String exerciseType;
private String trainer;
private String password;
private String userName;

public String getAssignedTrainer() {
	return trainer;
}
public void setTrainer(String trainer) {
	this.trainer = trainer;
}
public String getAssignedExerciseType() {
	return exerciseType;
}
public void setExerciseType(String exerciseType) {
	this.exerciseType = exerciseType;
}

public String getBodyType() {
	return bodyType;
}
public void setBodyType(String bodyType) {
	this.bodyType = bodyType;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getAadharCard() {
	return aadharCard;
}
public void setAadharCard(long aadharCard) {
	this.aadharCard = aadharCard;
}
public String getPassword() {
    String passwordChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder userName = new StringBuilder();
    Random rnd = new Random();
    while (userName.length() < 5) { // length of the random string.
        int index = (int) (rnd.nextFloat() * passwordChars.length());
        userName.append(passwordChars.charAt(index));
    }
    String userName1 = password.toString();
    return userName1;

}
public String getUserName() {
    String passwordChars = "1234567890";
    StringBuilder password = new StringBuilder("Gym");
    Random rnd = new Random();
    while (password.length() < 6) { // length of the random string.
        int index = (int) (rnd.nextFloat() * passwordChars.length());
        password.append(passwordChars.charAt(index));
    }
    String password1 = password.toString();
    return password1;

}
public void setPassword(String password)
{
	this.password = password;
	}
public void setUserName(String UserName)
{
this.userName = UserName;	
}
}
