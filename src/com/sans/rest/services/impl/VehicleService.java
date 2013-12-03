package com.sans.rest.services.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sans.model.VehicleJsonBean;

@Controller
public class VehicleService {

	// private static Logger logger = Logger.getLogger(DeviceService.class);

	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public @ResponseBody
	VehicleJsonBean fetchConstants(@RequestParam(value = "brand", required = true) String brand,
		@RequestParam(value = "model", required = true) String model, HttpServletRequest request, HttpServletResponse response) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		returnBean.setOwner("Sandeep");
		returnBean.setBrand(brand);
		returnBean.setModel(model);

		return returnBean;
	}
}
