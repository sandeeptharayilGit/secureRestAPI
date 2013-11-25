package com.sans.rest.secureservices;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
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
	VehicleJsonBean fetchConstants(@RequestParam(value = "name", required = true) String name,
		@RequestParam(value = "value", required = true) String value, HttpServletRequest request, HttpServletResponse response) throws IOException {

		VehicleJsonBean returnBean = new VehicleJsonBean();
		// returnBean = deviceDelegate.getConstant(constantID,
		// request.getLocalName());
		returnBean.setReturnType("Sandeep");
		ObjectMapper mapper = new ObjectMapper();
		// byte[] jsondata=("myFunc(").getBytes();

		/*
		 * response.getOutputStream().write(new String("myFunc(").getBytes());
		 * response
		 * .getOutputStream().write(mapper.writeValueAsBytes(returnBean));
		 * response.getOutputStream().write(new String(");").getBytes());
		 * response.getOutputStream().flush();
		 */

		return returnBean;

	}
}
