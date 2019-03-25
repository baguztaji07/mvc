package com.bagus.springMVCdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bagus.springMVCdemo.models.Hero;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String homePageRedirect() {
		String page = "redirect:home";
		
		return page;
	}
	
	@RequestMapping("/home")
	public String homePage() {
		String page = "homepage";
		
		return page;
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("form", "hero", new Hero());
    }
	
	@RequestMapping(value = "/form_input", method=RequestMethod.POST)
	public String submitInput(
			@ModelAttribute("hero") Hero hero,
			BindingResult result,
			ModelMap model) {
		
		if(result.hasErrors())
			return "error";
		
		model.addAttribute("name", hero.getName());
		model.addAttribute("type", hero.getType());
		model.addAttribute("atkspd", hero.getAtkSpd());
		model.addAttribute("mana", hero.getMana());
		model.addAttribute("hp", hero.getHp());
		
		return "heroView";
		
	}
}
