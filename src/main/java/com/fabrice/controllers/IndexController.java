package com.fabrice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.fabrice.entities.Apparaat;
import com.fabrice.services.interfaces.IApparaatService;

@Controller
@RequestMapping("/")
public class IndexController {
 
	@RequestMapping("/")
	public String home() {
 		return "home";
 	}

}
