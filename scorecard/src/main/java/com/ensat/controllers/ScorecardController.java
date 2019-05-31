package com.ensat.controllers;

import com.ensat.entities.Scorecard;
import com.ensat.services.ScorecardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ScorecardController {

	private ScorecardService scorecardService; 
	
	@Autowired
	public void setScorecardService(ScorecardService scorecardService) {
		this.scorecardService = scorecardService;
	}
	
	@RequestMapping(value = "/scorecards" , method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("scorecards" , scorecardService.listAllScorecards());
		System.out.println("Returning scorecard:");
		return "scorecards";
	}
	
	@RequestMapping("scorecard/{id}")
	public String showProduct(@PathVariable Integer id,Model model) {
		model.addAttribute("scorecard" , scorecardService.getScorecardById(id));
		return "scorecardshow";
	}
	
	@RequestMapping("scorecard/edit/{id}")
	public String edit(@PathVariable Integer id,Model model) {
		model.addAttribute("scorecard" , scorecardService.getScorecardById(id));
		return "scorecardform";
	}
	
	@RequestMapping("scorecard/new")
	public String newScorecard(Model model) {
		model.addAttribute("scorecard" , new Scorecard()); 
		return "scorecardform";
	}
	
	@RequestMapping(value="scorecard" , method=RequestMethod.POST)
	public String saveScorecard(Scorecard scorecard) {
		scorecardService.saveScorecard(scorecard);
		return "redirect:/scorecard/" + scorecard.getId();
	}
	
	@RequestMapping("scorecard/delete/{id}")
	public String delete(@PathVariable Integer id) {
		scorecardService.deleteScorecard(id);
		return "redirect:/scorecards";
	}
	
}
