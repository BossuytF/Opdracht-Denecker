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

import com.fabrice.entities.WerknemerApparaat;
import com.fabrice.services.interfaces.IWerknemerApparaatService;
import com.fabrice.services.interfaces.IWerknemerService;

@Controller
@RequestMapping("/api")
public class WerknemerApparaatController {
	
	@Autowired
	private IWerknemerApparaatService werknemerApparaatService;
	
	@RequestMapping(value="/werknemerApparaat/{id}", method = RequestMethod.GET )
	public ResponseEntity<WerknemerApparaat> getWerknemerById(@PathVariable("nummer") Integer id) {
		WerknemerApparaat werknemerApparaat = werknemerApparaatService.get(id);
		return new ResponseEntity<WerknemerApparaat>(werknemerApparaat, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/werknemerApparaat", method = RequestMethod.GET)
	public ResponseEntity<List<WerknemerApparaat>> getAllWerknemers() {
		List<WerknemerApparaat> list = werknemerApparaatService.getAll();
		return new ResponseEntity<List<WerknemerApparaat>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(value= "/werknemerApparaat", method = RequestMethod.POST)
	public ResponseEntity<Void> addWerknemer(@RequestBody WerknemerApparaat werknemerApparaat, UriComponentsBuilder builder) {
        werknemerApparaatService.add(werknemerApparaat);
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/werknemerApparaat/{nummer}").buildAndExpand(werknemerApparaat.getId
        		()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/werknemerApparaat/{id}", method = RequestMethod.PUT )
	public ResponseEntity<WerknemerApparaat> updateWerknemer(@RequestBody WerknemerApparaat werknemerApparaat) {
		werknemerApparaatService.update(werknemerApparaat);
		return new ResponseEntity<WerknemerApparaat>(werknemerApparaat, HttpStatus.OK);
	}
	
	@RequestMapping(value="/werknemerApparaat/{nummer}", method = RequestMethod.DELETE )
	public ResponseEntity<Void> deleteWerknemer(@PathVariable("nummer") Integer id) {
		werknemerApparaatService.remove(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

}
