package com.huffli.individualassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlantPlacesController {
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
}