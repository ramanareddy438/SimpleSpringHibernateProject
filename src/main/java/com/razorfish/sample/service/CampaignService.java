package com.razorfish.sample.service;

import java.util.List;

import com.razorfish.sample.model.Campaign;
import com.razorfish.sample.model.Category;

public interface CampaignService {
	public List<Campaign> getCampaigns();
	public List<Category> getCategories();
}
