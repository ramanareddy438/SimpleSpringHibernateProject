package com.razorfish.sample.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.razorfish.sample.model.Campaign;
import com.razorfish.sample.service.CampaignService;

@Controller
public class CampaignController {
	Logger log = LogManager.getLogger(CampaignController.class);

	@Autowired
	CampaignService campaignService;

	@RequestMapping(value="campaignList.go", method=RequestMethod.GET)
	public @ResponseBody List<Campaign> listCampaigns() {
		log.info("Inside Campaign Controller: fetching listCampaigns()");
		return campaignService.getCampaigns();
	}
}
