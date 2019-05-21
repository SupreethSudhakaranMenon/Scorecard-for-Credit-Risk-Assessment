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

    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/configurations", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("configurations", configurationService.listAllConfigurations());
        System.out.println("Returning configuration:");
        return "configurations";
    }
    
    /*for getting the values of configuration another table in mysqlfv*/
  
    
    
    
    
    

    /**
     * View a specific product by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("configuration/{id}")
    public String showProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationshow";
    }

    
    // Afficher le formulaire de modification du Product
    
    @RequestMapping("configuration/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("configuration", configurationService.getConfigurationById(id));
        return "configurationform";
    }
    
    

    /**
     * New product.
     *
     * @param model
     * @return
     */
    @RequestMapping("configuration/new")
    public String newConfiguration(Model model) {
        model.addAttribute("configuration", new Configuration());
        return "configurationform";
    }
    
    
    
  

    /**
     * Save product to database.
     *
     * @param product
     * @return
     */
    @RequestMapping(value = "configuration", method = RequestMethod.POST)
    public String saveConfiguration(Configuration configuration) {
        configurationService.saveConfiguration(configuration);
        return "redirect:/configuration/" + configuration.getId();
    }

    /**
     * Delete product by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("configuration/delete/{id}")
    public String delete(@PathVariable Integer id) {
        configurationService.deleteConfiguration(id);
        return "redirect:/configurations";
    }
	
	
	
}
