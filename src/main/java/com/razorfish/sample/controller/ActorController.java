package com.razorfish.sample.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorfish.sample.dto.Actor;
import com.razorfish.sample.service.ActorService;

@Controller
public class ActorController {
	Logger log = LogManager.getLogger(ActorController.class);
	
	@Autowired
	ActorService actorService;
	
	@RequestMapping(value="actorList.go", method=RequestMethod.GET)
	public @ResponseBody List<Actor> listActors() {
		log.info("Inside Actor Controller: fetching listActors()");
		actorService.getActors();
		return actorService.getActors();
	}
}
