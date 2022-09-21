package com.test.details.controller;


import com.test.details.service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.details.entities.Details;
import com.test.details.repository.DetailsRepository;


@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private DetailsService detailsService;
	
	@GetMapping("/details/{id}")
	  public ResponseEntity<Details> getTutorialById(@PathVariable("id") long id) {
		return ResponseEntity.ok(detailsService.getDetailsById(id));
	  }
}
