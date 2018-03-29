package com.stackroute.gyminterface;

import java.math.BigDecimal;
import java.util.List;

public interface IGym {

	public String getGymId();
	public void setGymId(String gymId);
	public String getGymLocation();
	public void setGymLocation(String gymLocation);
	public BigDecimal getFees();
	public void setFees(BigDecimal fees);
	public List<String> getPrograms();
	public void setPrograms(List<String> programs);
	public void setLocalGymManager(String localGymManager);
    public String getLocalGymManager();
    public void setEquipments(List<String> equipments);
    public List<String> getEquipments();
	public void setMemberDetails(List<Object> memberDetails);
    public List<Object> getMemberDetails();
}
