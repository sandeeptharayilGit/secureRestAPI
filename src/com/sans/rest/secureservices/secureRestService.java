package com.sans.rest.secureservices;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sans.rest.services.impl.VehicleJsonBean;

@Controller
public class secureRestService {
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody
	VehicleJsonBean fetchConstants(@RequestParam(value = "brand", required = true) String brand,
		@RequestParam(value = "model", required = true) String model) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		returnBean.setOwner("Sandeep");
		returnBean.setBrand(brand);
		returnBean.setModel(model);
		return returnBean;

	}
}
