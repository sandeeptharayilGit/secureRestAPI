/**
 * 
 */
package com.sans.rest.services.impl;

/**
 * @author sandeep_ts
 * 
 */
public class VehicleJsonBean {
	private String owner;
	private boolean isAutomaticGear;
	private String brand;
	private String model;
	private String engineCapacity;
	private int numberOfCylinders;
	private int bhp;

	/**
	 * @param isAutomaticGear
	 */
	public VehicleJsonBean() {
		super();
		this.isAutomaticGear = false;
	}

	/**
	 * @return the isAutomaticGear
	 */
	public boolean isAutomaticGear() {
		return isAutomaticGear;
	}

	/**
	 * @param isAutomaticGear
	 *            the isAutomaticGear to set
	 */
	public void setAutomaticGear(boolean isAutomaticGear) {
		this.isAutomaticGear = isAutomaticGear;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the engineCapacity
	 */
	public String getEngineCapacity() {
		return engineCapacity;
	}

	/**
	 * @param engineCapacity
	 *            the engineCapacity to set
	 */
	public void setEngineCapacity(String engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	/**
	 * @return the numberOfCylinders
	 */
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	/**
	 * @param numberOfCylinders
	 *            the numberOfCylinders to set
	 */
	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	/**
	 * @return the bhp
	 */
	public int getBhp() {
		return bhp;
	}

	/**
	 * @param bhp
	 *            the bhp to set
	 */
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
