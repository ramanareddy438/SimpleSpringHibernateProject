package com.razorfish.sample.service;

import java.util.List;

import com.razorfish.sample.dto.Campaign;
import com.razorfish.sample.dto.Category;

public interface CampaignService {
	public List<Campaign> getCampaigns();
	public List<Category> getCategories();
}
