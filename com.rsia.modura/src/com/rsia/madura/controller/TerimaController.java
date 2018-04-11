package com.rsia.madura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/terima")
public class TerimaController {
	
	@RequestMapping(value="/form-add")
	public String TerimaFormView(Model model){
		
		return "TerimaAddForm";
	}
}
