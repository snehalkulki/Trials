package com.naz.mycart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomePageController {

	@RequestMapping("/home")
	public String showHomePage() {
		System.out.println("In show home page");
		return "home";
	}
	
	@GetMapping("saveName")
	public String saveName(@RequestParam(name="name", required=true)String name, Model model) {
		model.addAttribute("savedName" , "Welcome "+name.toUpperCase());
		return "greeting";
	}
	
	@PostMapping("myOrderItems")
	public String orderItems(@RequestParam(name="savedName",required=true)String name, Model model) {
		List<String> items = new ArrayList<String>();
		items.add("Mobile");
		items.add("TV");
		items.add("Charger");
		model.addAttribute("itemList" , items);
		return "order";
	}
	
	/*@GetMapping("/greetings")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}*/
}
