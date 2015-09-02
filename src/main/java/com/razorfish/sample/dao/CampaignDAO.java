package com.razorfish.sample.dao;

import java.util.List;

import com.razorfish.sample.model.Campaign;
import com.razorfish.sample.model.Category;

public interface CampaignDAO {
	public List<Campaign> getCampaigns();

	public List<Category> getCategories();
}
