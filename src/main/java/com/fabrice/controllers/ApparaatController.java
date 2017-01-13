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
@RequestMapping("/api")
public class ApparaatController {
	
	@Autowired
	private IApparaatService apparaatService;

	
	@RequestMapping(value="/apparaat/{code}", method = RequestMethod.GET )
	public ResponseEntity<Apparaat> getApparaatById(@PathVariable("code") String code) {
		Apparaat apparaat = apparaatService.get(code);
		return new ResponseEntity<Apparaat>(apparaat, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/apparaat", method = RequestMethod.GET)
	public ResponseEntity<List<Apparaat>> getAllApparaats() {
		List<Apparaat> list = apparaatService.getAll();
		return new ResponseEntity<List<Apparaat>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/apparaat", method = RequestMethod.POST)
	public ResponseEntity<Void> addApparaat(@RequestBody Apparaat apparaat, UriComponentsBuilder builder) {
        apparaatService.add(apparaat);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/apparaat/{code}").buildAndExpand(apparaat.getCode
        		()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/apparaat/{code}", method = RequestMethod.PUT )
	public ResponseEntity<Apparaat> updateApparaat(@RequestBody Apparaat apparaat) {
		apparaatService.update(apparaat);
		return new ResponseEntity<Apparaat>(apparaat, HttpStatus.OK);
	}
	
	@RequestMapping(value="/apparaat/{code}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> deleteApparaat(@PathVariable("code") String code) {
		apparaatService.remove(code);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

}
