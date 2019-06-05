package com.ensat.controllers;

import com.ensat.entities.Configuration;
import com.ensat.services.ConfigurationService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ConfigurationController {

	private ConfigurationService configurationService; 
	
	@Autowired
	public void setConfigurationService(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }
	
	/*List all Details*/
	
    @RequestMapping(value = "/configurations", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("configurations", configurationService.listAllConfigurations());
        System.out.println("Returning configuration:");
        return "configurations";
    }
    
    
    @RequestMapping("configuration/{id}")
    public String showProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationshow";
    }

    
    
    @RequestMapping("configuration/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationform";
    }
    
    /*Add new details in the database*/
    @RequestMapping("configuration/new")
    public String newConfiguration(Model model) {
        model.addAttribute("configuration", new Configuration());
        return "configurationform";
    }
    
    /*Saving the details in the database*/
    @RequestMapping(value = "configuration", method = RequestMethod.POST)
    public String saveConfiguration(Configuration configuration) {
        configurationService.saveConfiguration(configuration);
        return "redirect:/configuration/" + configuration.getId();
    }

    @RequestMapping("configuration/delete/{id}")
    public String delete(@PathVariable Integer id) {
        configurationService.deleteConfiguration(id);
        return "redirect:/configurations";
    }
	
	
	
}
