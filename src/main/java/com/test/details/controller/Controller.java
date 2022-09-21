package com.test.details.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.details.entities.Details;
import com.test.details.repository.Repository;


@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private Repository repo;
	
	@GetMapping("/details/{id}")
	  public ResponseEntity<Details> getTutorialById(@PathVariable("id") long id) {
	    Optional<Details> tutorialData = repo.findById(id);

	    if (tutorialData.isPresent()) {
	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
	  @PostMapping("/details")
	  public ResponseEntity<Details> createTutorial(@RequestBody Details details) {
	    try {
	      Details details1 = repo
	          .save(new Details(details1.getName(), details1.getContactNumber()));
	      return new ResponseEntity<>(details1, HttpStatus.CREATED);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
}
