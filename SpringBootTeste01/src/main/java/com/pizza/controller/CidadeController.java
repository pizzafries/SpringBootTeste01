package com.pizza.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.model.Cidade;
import com.pizza.service.CidadeService;

@Controller
public class CidadeController {

	@Autowired
	private CidadeService cidadeService;
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		model.put("cidades", cidadeService.findAll());
		model.put("cidade", new Cidade());
		return "index";
	}
	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("cidade", new Cidade());
		return "addCidade";
	}
	@RequestMapping(path="/list", method=RequestMethod.GET)
	public ModelAndView findAll(){
		ModelAndView model = new ModelAndView();
		model.addObject("cidades", cidadeService.findAll());
		model.addObject("cidade", new Cidade());
		return model;
	}
	
	@RequestMapping(path="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Cidade cidade){
		
		cidadeService.save(cidade);
		
		return "redirect:/";
		
	}
	
}
