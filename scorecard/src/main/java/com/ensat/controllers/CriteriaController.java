package com.ensat.controllers;

import com.ensat.entities.Criteria;
import com.ensat.services.CriteriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CriteriaController {
	
	private CriteriaService criteriaService;
	
	@Autowired 
	public void setCriteriaService(CriteriaService criteriaService) {
		this.criteriaService = criteriaService;
	}
	
	@RequestMapping(value = "/criterias" , method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("criterias",criteriaService.listAllCriterias());
		System.out.println("Returning criteria:");
		return "criterias";
	}
	
	@RequestMapping("criteria/{id}")
	public String showProduct(@PathVariable Integer id,Model model) {
		model.addAttribute("criteria" , criteriaService.getCriteriaById(id));
		return "criteriashow";
	}
	
	@RequestMapping("criteria/edit/{id}")
	public String edit(@PathVariable Integer id,Model model) {
		model.addAttribute("criteria" , criteriaService.getCriteriaById(id));
		return "criteriaform";
	}
	
	@RequestMapping("criteria/new")
	public String newCriteria(Model model) {
		model.addAttribute("criteria" , new Criteria());
		return "criteriaform";
	}
	
	@RequestMapping(value="criteria" , method = RequestMethod.POST)
	public String saveCriteria(Criteria criteria) {
		criteriaService.saveCriteria(criteria);
		return "redirect:/criteria/" + criteria.getId();
	}
	
	@RequestMapping("criteria/delete/{id}")
	public String delete(@PathVariable Integer id) {
		criteriaService.deleteCriteria(id);
		return "redirect:/criterias";
	}
}
