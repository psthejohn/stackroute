package com.stackroute.gyminterface;

public interface IMember {

	void setName(String name);
	void setWeight(double weight);
	void setAge(int age);
    void setGender(String gender);
    public void setAadharCard(long aadharCard);
	public String getGender();
	public double getWeight();
	public void setBodyType(String string);
	public String getBodyType();
	public void setExerciseType(String string);
	public void setTrainer(String string);
	public String getName();
	public int getAge();
	public long getAadharCard();
	public String getAssignedExerciseType();
    public String getAssignedTrainer();
	public String getPassword();
	public String getUserName();
	

}
