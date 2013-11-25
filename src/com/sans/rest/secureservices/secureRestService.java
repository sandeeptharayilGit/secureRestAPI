package com.sans.rest.secureservices;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sans.rest.services.impl.VehicleJsonBean;
import com.sans.utils.AppUtils;

@Controller
public class secureRestService {
	@RequestMapping(value = "/vehicle", method = RequestMethod.GET, headers = "Accept=application/json")
	public void fetchConstants(@RequestParam(value = "brand", required = true) String brand,
		@RequestParam(value = "model", required = true) String model, @RequestParam(value = "callback", required = false) String callback,
		HttpServletRequest request, HttpServletResponse response) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		returnBean.setOwner("Sandeep");
		returnBean.setBrand(brand);
		returnBean.setModel(model);

		callback = callback != null ? callback : "myFunc";

		AppUtils.createjsonp(returnBean, callback, response);

	}
}
