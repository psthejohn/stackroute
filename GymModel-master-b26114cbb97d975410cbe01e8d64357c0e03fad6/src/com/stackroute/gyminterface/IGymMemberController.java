package com.stackroute.gyminterface;

import java.io.IOException;
import java.util.ArrayList;

public interface IGymMemberController {

public boolean newMemberRegistration()throws IOException;
public boolean assignTrainer();
public String decideWorkOutandExercises();
public ArrayList<Object> displayAllDetails();
public boolean customerLogin() throws IOException;
public String generateUserName();
public String generatePassword();



}
