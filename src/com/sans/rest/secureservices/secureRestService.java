package com.sans.rest.secureservices;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sans.model.VehicleBean;
import com.sans.model.VehicleJsonBean;

@Controller
public class secureRestService {
	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public @ResponseBody
	VehicleJsonBean fetchVehicle(@RequestParam(value = "brand", required = true) String brand,
		@RequestParam(value = "model", required = true) String model) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		returnBean.setOwner("Sandeep");
		returnBean.setBrand(brand);
		returnBean.setModel(model);
		return returnBean;

	}

	@RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
	public @ResponseBody
	VehicleJsonBean AddVehicle(@RequestBody VehicleBean vBean) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		returnBean.setOwner("Sandeep");
		returnBean.setBrand(vBean.getName());
		returnBean.setModel(vBean.getModel());
		return returnBean;

	}
}
