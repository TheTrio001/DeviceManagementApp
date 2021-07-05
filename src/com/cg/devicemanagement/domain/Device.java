package com.cg.devicemanagement.domain;
/**
 * This Device will work as a data traveler object from layer to layer
 * @author Anuj
 *
 */

public class Device {	
	/**
	 * serial no. of the device
	 */
	private int id;
	/**
	 * type of device
	 */
	private String device_type;
	/**
	 * problem that the user is facing with the device
	 */
	private String problem;
	/**
	 * tells if the device repaired or not
	 */
	private String repaired;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getRepaired() {
		return repaired;
	}
	public void setRepaired(String repaired) {
		this.repaired = repaired;
	}
	@Override
	public String toString() {
		return "DeviceManagement [id=" + id + ", device_type=" + device_type + ", problem=" + problem + ", repaired="
				+ repaired + "]";
	}
	
	

}
