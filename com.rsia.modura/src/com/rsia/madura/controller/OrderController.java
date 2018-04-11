package com.rsia.madura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@RequestMapping(value="/list")
	public String OrderListView(Model model){
		
		return "OrderListView";
	}
	
	@RequestMapping(value="/form-add")
	public String OrderFormAddView(Model model){
		
		return "OrderAddForm";
	}

}
