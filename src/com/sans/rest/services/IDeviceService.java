package com.sans.rest.services;

import javax.servlet.http.HttpServletRequest;

import com.sans.rest.services.impl.ProductJsonBean;

public interface IDeviceService {

	public ProductJsonBean fetchConstants(String constantID, HttpServletRequest request);
}
