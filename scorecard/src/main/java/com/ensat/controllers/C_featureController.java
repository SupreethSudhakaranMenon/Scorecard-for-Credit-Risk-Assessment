package com.ensat.controllers;

import com.ensat.entities.C_feature;
import com.ensat.services.C_featureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class C_featureController {

	private C_featureService c_featureService; 
	
	@Autowired
	public void setCfeatureService(C_featureService c_featureService) {
		this.c_featureService = c_featureService;
	}
	
	@RequestMapping(value = "/c_features" , method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("c_features" , c_featureService.listAllCfeatures());
		System.out.println("Returning c_features:");
		return "c_features";
	}
	
	@RequestMapping("c_feature/{id}")
	public String showProduct(@PathVariable Integer id,Model model) {
		model.addAttribute("c_feature" , c_featureService.getCfeatureById(id));
		return "c_featureshow";
	}
	
	@RequestMapping("c_feature/edit/{id}")
	public String edit(@PathVariable Integer id,Model model) {
		model.addAttribute("c_feature" , c_featureService.getCfeatureById(id));
		return "c_featureform";
	}
	
	@RequestMapping("c_feature/new")
	public String newCfeature(Model model) {
		model.addAttribute("c_feature" , new C_feature());
		return "c_featureform";
	}
	
	@RequestMapping(value="c_feature" , method=RequestMethod.POST)
	public String saveCfeature(C_feature c_feature) {
		c_featureService.saveCfeature(c_feature);
		return "redirect:/c_feature/" + c_feature.getId();
	}
	
	@RequestMapping("c_feature/delete/{id}")
	public String delete(@PathVariable Integer id) {
		c_featureService.deleteCfeature(id);
		return "redirect:/c_features";
	}
	
}
