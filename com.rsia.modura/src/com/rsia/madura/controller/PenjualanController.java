package com.rsia.madura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jual")
public class PenjualanController {
	
	@RequestMapping(value="/list")
	public String PenjualanListView(Model model){
		
		return "PenjualanListView";
	}
	
	@RequestMapping(value="/form-add")
	public String PenjualanFormView(Model model){
		
		return "PenjualanAddForm";
	}
}
