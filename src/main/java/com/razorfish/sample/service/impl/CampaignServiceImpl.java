package com.razorfish.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.razorfish.sample.dao.CampaignDAO;
import com.razorfish.sample.dto.Campaign;
import com.razorfish.sample.dto.Category;
import com.razorfish.sample.service.CampaignService;

@Service
public class CampaignServiceImpl implements CampaignService {
	
	@Autowired
	CampaignDAO campaignDAO;

	@Override
	public List<Campaign> getCampaigns() {
		return campaignDAO.getCampaigns();
	}

	@Override
	public List<Category> getCategories() {
		return campaignDAO.getCategories();
	}
	
}
