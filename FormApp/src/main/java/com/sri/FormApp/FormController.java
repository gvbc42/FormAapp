package com.sri.FormApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
@GetMapping("Registration")
	public String Registration()
	{
	return "Registration";
	}
@PostMapping("/details")
	public String viewdetails(@RequestParam("CId") String CId,
			@RequestParam("CName") String CName, 
			@RequestParam("CEmail") String CEmail, ModelMap ModelMap)
	{
	ModelMap.put("CId", CId);
	ModelMap.put("CName", CName);
	ModelMap.put("CEmail", CEmail);
	return "ViewCustomers";
		
	}	

}
