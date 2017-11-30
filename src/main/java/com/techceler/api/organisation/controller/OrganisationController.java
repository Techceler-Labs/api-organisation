package com.techceler.api.organisation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techceler.api.organisation.model.Organisation;
import com.techceler.api.organisation.service.OrganisationService;



@RestController
@RequestMapping("/api")
public class OrganisationController {

	@Autowired 
	OrganisationService orgService;
	
	@RequestMapping(value = "/organisation", method = RequestMethod.GET)    
	public ResponseEntity<?> getOrganisations() {
		return new ResponseEntity<List<Organisation>>(orgService.findOrganisations(), HttpStatus.OK);     
    }

	@RequestMapping(value = "/organisation/{orgId}", method = RequestMethod.GET)    
	public ResponseEntity<Organisation> getOrganisationById(Long id) {
		return new ResponseEntity<Organisation> (orgService.findOrganisationWithBranchesById(id),HttpStatus.OK);
    }

	@RequestMapping(value = "/organisation/{orgId}/branches", method = RequestMethod.GET)    
	public String getOrganisationsBranches() {
       return "Greetings from Spring Boot!";
    }

}
