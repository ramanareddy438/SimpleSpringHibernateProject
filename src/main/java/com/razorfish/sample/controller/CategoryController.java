package com.razorfish.sample.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.razorfish.sample.model.Category;
import com.razorfish.sample.service.CampaignService;

@RestController
public class CategoryController {
	private Logger log = LogManager.getLogger(CategoryController.class);
	
	@Autowired
	CampaignService campaignService;
	
	@RequestMapping(value="categoryList.go", method=RequestMethod.GET)
	public List<Category> listCategory() {
		log.info("Inside Category Controller: fetching listCategories()");
		return campaignService.getCategories();
	}
}
