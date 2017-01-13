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

import com.fabrice.entities.Werknemer;
import com.fabrice.services.interfaces.IWerknemerService;

@Controller
@RequestMapping("/api")
public class WerknemerController {
	
	@Autowired
	private IWerknemerService werknemerService;
	
	@RequestMapping(value="/werknemer/{nummer}", method = RequestMethod.GET )
	public ResponseEntity<Werknemer> getWerknemerById(@PathVariable("nummer") String nummer) {
		Werknemer werknemer = werknemerService.get(nummer);
		return new ResponseEntity<Werknemer>(werknemer, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/werknemer", method = RequestMethod.GET)
	public ResponseEntity<List<Werknemer>> getAllWerknemers() {
		List<Werknemer> list = werknemerService.getAll();
		return new ResponseEntity<List<Werknemer>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/werknemer", method = RequestMethod.POST)
	public ResponseEntity<Void> addWerknemer(@RequestBody Werknemer werknemer, UriComponentsBuilder builder) {
        werknemerService.add(werknemer);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/werknemer/{nummer}").buildAndExpand(werknemer.getNummer
        		()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/werknemer/{nummer}", method = RequestMethod.PUT )
	public ResponseEntity<Werknemer> updateWerknemer(@RequestBody Werknemer werknemer) {
		werknemerService.update(werknemer);
		return new ResponseEntity<Werknemer>(werknemer, HttpStatus.OK);
	}
	
	@RequestMapping(value="/werknemer/{nummer}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> deleteWerknemer(@PathVariable("nummer") String nummer) {
		werknemerService.remove(nummer);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

}
