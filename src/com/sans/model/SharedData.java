package com.sans.model;

import java.util.ArrayList;

public class SharedData {

	private static SharedData data = null;
	private static ArrayList<VehicleJsonBean> BeanList = null;

	/**
	 * 
	 */
	private SharedData() {
		// super();
		// TODO Auto-generated constructor stub
	}

	public static synchronized SharedData getInstance() {

		if (data == null) {
			data = new SharedData();
			BeanList = new ArrayList<VehicleJsonBean>();
			
			VehicleJsonBean returnBean = new VehicleJsonBean();
			returnBean.setOwner("Sandeep");
			returnBean.setBrand("Somwename");
			returnBean.setModel("SomeModel");
			
			data.addList(returnBean);
		}
		return data;

	}

	public ArrayList<VehicleJsonBean> getList() {
		ArrayList<VehicleJsonBean> newBeanList = (ArrayList<VehicleJsonBean>) BeanList.clone();
		BeanList = new ArrayList<VehicleJsonBean>();

		return newBeanList;

	}

	public void addList(VehicleJsonBean bean) {

		BeanList.add(bean);

	}

	public void cleanList() {

		BeanList = new ArrayList<VehicleJsonBean>();

	}

}
